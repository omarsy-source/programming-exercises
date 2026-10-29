package com.thehxlab.geometrydash.ui;

import com.thehxlab.geometrydash.engine.GameLoop;
import com.thehxlab.geometrydash.events.EventBus;
import com.thehxlab.geometrydash.model.GameObject;
import com.thehxlab.geometrydash.events.LevelCompleteEvent;
import com.thehxlab.geometrydash.events.PlayerDiedEvent;
import com.thehxlab.geometrydash.model.Level;
import com.thehxlab.geometrydash.model.GameLevel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Haupt-Panel des Spiels. Besitzt das aktive Level und die GameLoop, nimmt
 * Tastatureingaben entgegen und zeichnet jeden Frame.
 *
 * TODO: startGame() implementieren. TODO: paintComponent() vervollständigen.
 */
public class GamePanel extends JPanel {

	/** Breite des Spielbereichs in Pixeln. */
	public static final int PANEL_WIDTH = 800;

	/** Höhe des Spielbereichs in Pixeln. */
	public static final int PANEL_HEIGHT = 450;

	private static final Color BACKGROUND_COLOR = new Color(0x1A1A2E);
	private static final Font HUD_FONT = new Font("Monospaced", Font.BOLD, 16);

	// TODO: Weitere Felder hinzufügen, z.B. für den Player oder Hintergrundebenen.
	private Level level;
	private GameLoop gameLoop;
	private int attemptNumber = 1;
	private GameLevel gameLevel;
	private boolean playerWon = false;

	public GamePanel() {
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		setBackground(BACKGROUND_COLOR);
		setFocusable(true);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					// TODO: Player jump lassen.
					//
					// Achtung – Threading: keyPressed läuft auf dem EDT, die Spiellogik
					// auf dem Game-Loop-Thread. Prüfe onGround hier NICHT direkt – der
					// Flag wird innerhalb eines Ticks kurz auf false gesetzt, bevor die
					// Kollisionserkennung ihn zurücksetzt. Sprünge gehen dann verloren.
					//
					// Empfohlenes Muster (Jump-Buffering):
					// 1. Setze in jump() nur: jumpRequested = true (volatile!)
					// 2. Werte jumpRequested am ANFANG von Player.update() aus,
					// solange onGround noch den Wert des letzten Ticks hat:
					// if (jumpRequested && onGround) { ... apply jump ... }
					// jumpRequested = false;

					if (level != null) {
						((GameLevel) level).jumpPlayer();
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					// TODO: Spielschleife stoppen oder pausieren.

				}
				if (e.getKeyCode() == KeyEvent.VK_D) {
					// D-Taste: Debug-Begrenzungsrahmen ein-/ausschalten
					GameObject.DEBUG = !GameObject.DEBUG;
				}
			}
		});
	}

	/**
	 * Lädt das Level und startet die Spielschleife. Wird vom Launcher nach dem
	 * Öffnen des Fensters aufgerufen.
	 *
	 * TODO: Konkrete Level-Unterklasse instanziieren und laden. TODO:
	 * PlayerDiedEvent und LevelCompleteEvent auf dem EventBus abonnieren. TODO:
	 * GameLoop erstellen und starten. Beispiel: level = new GameLevel();
	 * level.load(); EventBus.getInstance().subscribe(PlayerDiedEvent.class, e ->
	 * restartLevel()); gameLoop = new GameLoop(level, this); gameLoop.start();
	 */
	public void startGame() {

		// TODO: Implementierung hier einfügen.
		requestFocusInWindow();

		// Level instanziieren und laden
		gameLevel = new GameLevel("Level");
		gameLevel.load();
		level = gameLevel;

		/* Die Ereignisklasse bestimmt den Typ; der Handler reagiert auf passende Ereignisse. */
		// PlayerDiedEvent
		// // Lambda-Ausdruck: restart level den GameLoop, sobald das Event eintritt.
		EventBus.getInstance().subscribe(PlayerDiedEvent.class, event -> restartLevel());

		// LevelCompleteEvent
		// Die Ereignisklasse dient als Schlüssel für den passenden Handler.
		// Beim Ereignis wird die vorher registrierte Aktion ausgeführt.
		EventBus.getInstance().subscribe(LevelCompleteEvent.class, event -> {
			gameLoop.stop();
			playerWon = true;
			repaint();
		});

		// Hier rufen wir den Konstruktor auf, um die GameLoop zu erstellen.
		// Das Schlüsselwort 'this' übergibt das aktuelle GamePanel als Zeichenfläche.
		gameLoop = new GameLoop(level, this);
		gameLoop.start();

	}

	/**
	 * Stoppt die Schleife, löscht den EventBus und startet das Level updatedValue.
	 *
	 * TODO: Implementierung hier einfügen.
	 */
	public void restartLevel() {
		attemptNumber++;
		gameLoop.stop();
		EventBus.getInstance().clear();
		startGame();
	}

	/**
	 * Zeichnet einen Frame des Spiels. Swing ruft diese Methode auf dem EDT auf,
	 * ausgelöst durch repaint() der GameLoop.
	 *
	 * TODO: Hintergrundebenen zeichnen. TODO: Grafikkontext um -level.getCameraX()
	 * verschieben (Kamera-Scrolling). TODO: level.draw(g2d) aufrufen. TODO:
	 * Verschiebung rückgängig machen und HUD zeichnen.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		if (level == null) {
			// Platzhalter, bis startGame() implementiert ist
			g2d.setColor(Color.CYAN);
			g2d.setFont(HUD_FONT);
			g2d.drawString("TODO: startGame() implementieren", 60, PANEL_HEIGHT / 2);
			return;
		}

		// TODO: Hintergrundebenen zeichnen (vor Kameraverschiebung).

		g2d.translate(-(int) level.getCameraX(), 0);
		level.draw(g2d);
		g2d.translate((int) level.getCameraX(), 0);

		// TODO: HUD zeichnen, z.B. Versuchsnummer und Fortschrittsbalken.
		g2d.setColor(Color.WHITE);
		g2d.setFont(HUD_FONT);
		g2d.drawString("Versuch " + attemptNumber, 10, 20);

		if (playerWon) {

			g2d.setColor(new Color(0, 0, 0, 180));
			g2d.fillRect(0, 0, PANEL_WIDTH, PANEL_HEIGHT);

			g2d.setColor(Color.GREEN);
			g2d.setFont(new Font("Monospaced", Font.BOLD, 40));
			String winText = "YOU WON!";

			int stringWidth = g2d.getFontMetrics().stringWidth(winText);
			g2d.drawString(winText, (PANEL_WIDTH - stringWidth) / 2, PANEL_HEIGHT / 2);
		}
	}
}
