package com.thehxlab.geometrydash;

import com.thehxlab.geometrydash.ui.SettingsDialog;
import com.thehxlab.geometrydash.ui.GamePanel;
import com.thehxlab.geometrydash.ui.StartPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.CardLayout;

/**
 * Einstiegspunkt der Anwendung.
 *
 * Verwendet ein CardLayout, um zwischen Startbildschirm (StartPanel)
 * und Spielbereich (GamePanel) zu wechseln.
 * Hier nichts ändern – die eigentlichen exercises sind in StartPanel
 * und SettingsDialog.
 */
public final class Launcher {

    /** Fenstertitel. */
    public static final String WINDOW_TITLE = "Geometry Dash — OOP Edition";

    /** Bezeichner der Start-Karte im CardLayout. */
    private static final String START_CARD = "start";

    /** Bezeichner der Spiel-Karte im CardLayout. */
    private static final String GAME_CARD = "spiel";

    private Launcher() {}

    // Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            // ── Panels anlegen ────────────────────────────────────────────
            StartPanel startPanel = new StartPanel();
            GamePanel  gamePanel  = new GamePanel();

            // ── Container mit CardLayout ──────────────────────────────────
            // CardLayout ermöglicht das Umschalten zwischen zwei "Karten"
            // (Bildschirmen) ohne das Fenster updatedValue zu erstellen.
            JPanel container = new JPanel(new CardLayout());
            container.add(startPanel, START_CARD);
            container.add(gamePanel,  GAME_CARD);

            // ── Fenster ───────────────────────────────────────────────────
            JFrame frame = new JFrame(WINDOW_TITLE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setContentPane(container);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
         
            // "Spielen": zur Spiel-Karte wechseln und Spielschleife starten
            startPanel.setPlayAction(e -> {
                ((CardLayout) container.getLayout()).show(container, GAME_CARD);
                gamePanel.startGame();
                gamePanel.requestFocusInWindow();
            });

            // "Einstellungen": modalen Dialog öffnen
            startPanel.setSettingsAction(e ->
                new SettingsDialog(frame).setVisible(true)
            );
        });
    }
}
