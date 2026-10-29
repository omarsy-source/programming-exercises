package com.thehxlab.geometrydash.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Abstrakte Basisklasse für ein spielbares Level. Verwaltet alle GameObjects
 * und wird von der GameLoop jeden Tick aktualisiert.
 *
 * TODO: Eigene Unterklasse erstellen und load() implementieren.
 */
public abstract class Level {

	/** Standard-Scrollgeschwindigkeit in Pixeln pro Tick. */
	public static final double DEFAULT_SCROLL_SPEED = 5.0;

	/**
	 * Vom Einstellungs-Dialog gesetzte Geschwindigkeit. Wird beim nächsten
	 * Level-Start übernommen. Wertebereich: 1 – 10.
	 */
	public static double configuredScrollSpeed = DEFAULT_SCROLL_SPEED;

	private final List<GameObject> gameObjects = new ArrayList<>();

	/** Anzeigename des Levels. */
	protected String name;

	/**
	 * Aktueller Kamera-Versatz in Weltkoordinaten (wächst beim Vorwärtsscrolling).
	 */
	protected double cameraX;

	/** Horizontale Scrollgeschwindigkeit in Pixeln pro Tick. */
	protected double scrollSpeed;

	/**
	 * @param name Anzeigename des Levels
	 */
	protected Level(String name) {
		this.name = name;
		this.cameraX = 0.0;
		this.scrollSpeed = configuredScrollSpeed; // vom Einstellungs-Dialog übernehmen
	}

	/**
	 * Befüllt das Level mit seinen Spielobjekten. Wird einmal vor dem Start der
	 * Spielschleife aufgerufen.
	 *
	 * TODO: Hier Objekte erstellen und mit addObject() registrieren. Beispiel:
	 * addObject(new Player(100, 300)); addObject(new Platform(0, 380, 2000, 40));
	 */
	public abstract void load();

	/**
	 * Aktualisiert alle Spielobjekte um einen Tick. Kann überschrieben werden —
	 * super.update() dabei immer aufrufen.
	 *
	 * TODO: Hier Kollisionserkennung mit der CollisionEngine einbauen. TODO:
	 * PlayerDiedEvent veröffentlichen, wenn der Player stirbt. TODO:
	 * LevelCompleteEvent veröffentlichen, wenn das Ziel erreicht wird.
	 */
	public void update() {
		cameraX += scrollSpeed;
		
		// Kopie verwenden, damit Objekte sich während update() selbst entfernen können
		for (GameObject obj : new ArrayList<>(gameObjects)) {
			obj.update();
		}
	}

	/**
	 * Zeichnet alle Spielobjekte.
	 *
	 * @param g2d der Grafikkontext (bereits auf Weltkoordinaten verschoben)
	 */
	public void draw(Graphics2D g2d) {
		for (GameObject obj : gameObjects) {
			obj.draw(g2d);

			// Debug-Modus: Begrenzungsrahmen (AABB) einzeichnen
			if (GameObject.DEBUG) {
				Color c = obj.getDebugColor();
				// Halbtransparente Füllung
				g2d.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue(), 50));
				g2d.fillRect((int) obj.getX(), (int) obj.getY(), (int) obj.getWidth(), (int) obj.getHeight());
				// Voller Rahmen
				g2d.setColor(c);
				g2d.drawRect((int) obj.getX(), (int) obj.getY(), (int) obj.getWidth(), (int) obj.getHeight());
				// Klassenname oben links im Kasten
				g2d.setFont(new Font ("Monospaced", Font.PLAIN, 12));
				g2d.drawString(obj.getClass().getSimpleName(), (int) obj.getX() + 2, (int) obj.getY() + 10);
			}
		}
	}

	/**
	 * Fügt ein Spielobjekt zum Level hinzu.
	 *
	 * @param obj das hinzuzufügende Objekt
	 */
	protected void addObject(GameObject obj) {
		gameObjects.add(obj);
	}

	/**
	 * Entfernt ein Spielobjekt aus dem Level.
	 *
	 * @param obj das zu entfernende Objekt
	 */
	protected boolean removeObject(GameObject obj) {
		return gameObjects.remove(obj);
	}

	/** @return unveränderliche Sicht auf alle Spielobjekte */
	public List<GameObject> getObjects() {
		return Collections.unmodifiableList(gameObjects);
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public String getName() {
		return name;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getCameraX() {
		return cameraX;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getScrollSpeed() {
		return scrollSpeed;
	}
}
