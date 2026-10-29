package com.thehxlab.geometrydash.ui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 * Startbildschirm des Spiels.
 *
 * Alle benötigten Komponenten sind bereits als Felder angelegt – du musst sie
 * nur anordnen und gestalten.
 *
 * ── exercise 1: Layout und Aufbau ────────────────────────────────────────────
 *
 * TODO 1a: Wähle einen LayoutManager und setze ihn mit setLayout(...).
 * Empfehlung: BorderLayout für den Gesamtaufbau, BoxLayout oder GridLayout für
 * die Buttons in der Mitte.
 *
 * TODO 1b: Füge titleLabel, playButton, settingsButton und hintLabel
 * dem Panel hinzu. Tipp: Du kannst ein inneres Hilfs-Panel (JPanel) verwenden,
 * um mehrere Komponenten zu gruppieren.
 *
 * ── exercise 2: Gestaltung ────────────────────────────────────────────────────
 *
 * TODO 2a: Setze eine Hintergrundfarbe für das Panel. Beispiel:
 * setBackground(new java.awt.Color(0x1A1A2E));
 *
 * TODO 2b: Passe Schrift und Farbe der Labels und Buttons an. examples:
 * titleLabel.setFont(new java.awt.Font("Monospaced", java.awt.Font.BOLD, 48));
 * titleLabel.setForeground(new java.awt.Color(0xFFD700));
 * playButton.setFont(new java.awt.Font("Monospaced", java.awt.Font.BOLD,
 * 20));
 *
 * TODO 2c: Optional: Ränder setzen mit
 * setBorder(javax.swing.BorderFactory.createEmptyBorder(...))
 */
public class StartPanel extends JPanel {

	/** Großer Titel oben im Bildschirm. */
	private final JLabel titleLabel = new JLabel("GEOMETRY DASH");

	/** Startet das Spiel und wechselt zum Spielbereich. */
	final JButton playButton = new JButton("Spielen");

	/** Öffnet den Einstellungs-Dialog. */
	final JButton settingsButton = new JButton("Einstellungen");

	/** Bedienungshinweis für den Player. */
	private final JLabel hintLabel = new JLabel("Leertaste oder Mausklick = Springen  |  D = Debug");

	public StartPanel() {
		setPreferredSize(new Dimension(GamePanel.PANEL_WIDTH, GamePanel.PANEL_HEIGHT));

		// TODO 1a: LayoutManager wählen und setzen
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		// TODO 1b: Komponenten hinzufügen
		panel.add(titleLabel, BorderLayout.NORTH);
		panel.add(playButton,BorderLayout.EAST);
		panel.add(settingsButton, BorderLayout.CENTER);
		panel.add(hintLabel,BorderLayout.SOUTH);
		
		// TODO 2a: Hintergrundfarbe setzen
		panel.setBackground(Color.GREEN);
		 add(panel);
		// TODO 2b: Schriften und Farben der Komponenten anpassen
		playButton.setFont(new Font("Times New Roman", Font.ITALIC, 50));
		// Text color setForeground
		playButton.setForeground(Color.cyan);
		
		settingsButton.setFont(new Font("Times New Roman", Font.ITALIC, 50));
		settingsButton.setForeground(Color.cyan);
		
		hintLabel.setFont(new Font("Courier New", Font.ITALIC , 25));
		hintLabel.setForeground(Color.darkGray);
		// TODO 2c: Ränder setzen (optional)
	}

	/**
	 * Registriert den ActionListener, der beim Klick auf "Spielen" aufgerufen wird.
	 * Wird vom Launcher verdrahtet – hier nichts ändern.
	 *
	 * @param listener der Action-Handler
	 */
	public void setPlayAction(ActionListener listener) {
		playButton.addActionListener(listener);
	}

	/**
	 * Registriert den ActionListener, der beim Klick auf "Einstellungen" aufgerufen
	 * wird. Wird vom Launcher verdrahtet – hier nichts ändern.
	 *
	 * @param listener der Action-Handler
	 */
	public void setSettingsAction(ActionListener listener) {
		settingsButton.addActionListener(listener);
	}
}
