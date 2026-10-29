package com.thehxlab.geometrydash.ui;

import com.thehxlab.geometrydash.model.GameObject;
import com.thehxlab.geometrydash.model.Level;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 * Modaler Einstellungs-Dialog. Hier können Scrollgeschwindigkeit und
 * Debug-Modus angepasst werden. Die Änderungen werden beim Klick auf "OK"
 * gespeichert und beim nächsten Spielstart übernommen.
 *
 * ── exercise 3: Komponenten einbauen ─────────────────────────────────────────
 *
 * TODO 3a: Erstelle einen JSlider für die Scrollgeschwindigkeit. Wertebereich
 * 1–10, Startwert: (int) Level.configuredScrollSpeed Beispiel: JSlider
 * speedSlider = new JSlider(1, 10, initialValue);
 * speedSlider.setMajorTickSpacing(1);
 * speedSlider.setPaintTicks(true);
 * speedSlider.setPaintLabels(true);
 *
 * TODO 3b: Erstelle eine JCheckBox für den Debug-Modus. Startzustand:
 * GameObject.DEBUG Beispiel: JCheckBox debugCheckBox = new
 * JCheckBox("Begrenzungsrahmen anzeigen", GameObject.DEBUG);
 *
 * ── exercise 4: OK-Button verdrahten ─────────────────────────────────────────
 *
 * TODO 4: Füge dem okButton einen ActionListener hinzu, der: (a)
 * Level.configuredScrollSpeed auf den Slider-Wert setzt, (b)
 * GameObject.DEBUG auf den Zustand der Checkbox setzt, (c) den Dialog schließt:
 * dispose() Beispiel: okButton.addActionListener(e -> {
 * Level.configuredScrollSpeed = speedSlider.getValue();
 * GameObject.DEBUG = debugCheckBox.isSelected(); dispose(); });
 *
 * ── exercise 5: Layout ────────────────────────────────────────────────────────
 *
 * TODO 5: Ordne alle Komponenten mit einem LayoutManager an und füge sie dem
 * Dialog hinzu. Empfehlung: – GridLayout(n, 2) für Label/Eingabe-Paare –
 * FlowLayout oder BorderLayout für die Buttons unten Vergiss nicht:
 * add(component) und danach pack() aufrufen.
 *
 * Tipp: Du kannst getContentPane() verwenden oder direkt add() aufrufen.
 */
public class SettingsDialog extends JDialog {

	/** Bestätigt die Einstellungen und schließt den Dialog. */
	private final JButton okButton = new JButton("OK");

	/** Schließt den Dialog ohne Änderungen zu speichern. */
	private final JButton cancelButton = new JButton("Abbrechen");

	/**
	 * Erstellt den Einstellungs-Dialog.
	 *
	 * @param owner das übergeordnete Fenster (nötig für Modalität)
	 */
	public SettingsDialog(Frame owner) {
		super(owner, "Einstellungen", true); // true = modal (blockiert das Hauptfenster)

		// TODO 3a: JSlider für Scrollgeschwindigkeit erstellen
		// Startwert wird von Level.configuredScrollSpeed zugewiesen
		JSlider speedSlider = new JSlider(1, 10, (int) Level.configuredScrollSpeed);
		
		// TODO 3b: JCheckBox für Debug-Modus erstellen
		// wird von GameObject.DEBUG genommen. wenn checkbox true wird aktiviert
		JCheckBox debugCheckBox = new JCheckBox("Begrenzungsrahmen anzeigen", GameObject.DEBUG);
		
		// TODO 4: okButton-Listener verdrahten
		okButton.addActionListener(e -> {
		    Level.configuredScrollSpeed = speedSlider.getValue();  // Nimmt denValue von speedSlider 
		    GameObject.DEBUG = debugCheckBox.isSelected() ; // checkt dden Zustand                   
		    dispose();                                
		});
		// Abbrechen: Dialog ohne Änderungen schließen – hier nichts ändern
		cancelButton.addActionListener(e -> dispose());

		// TODO 5: Komponenten mit LayoutManager anordnen und hinzufügen,
		// dann pack() und setLocationRelativeTo(owner) aufrufen
		JPanel settingsPanel = new JPanel();
		settingsPanel.setLayout(new GridLayout(2, 2));
		settingsPanel.add(new JLabel("Scrollgeschwindigkeit (1–10):"));
		settingsPanel.add(speedSlider);
		settingsPanel.add(new JLabel("Debug-Modus:"));
		settingsPanel.add(debugCheckBox);
		add(settingsPanel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout ());
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		add(buttonPanel);
		

		pack();
		setLocationRelativeTo(owner);
	}
}
