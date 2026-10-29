package com.thehxlab.geometrydash.model;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Abstrakte Basisklasse für alle sichtbaren Objekte in der Spielwelt.
 * Implementiert Updatable und Collidable — konkrete Unterklassen müssen
 * update() und draw() implementieren.
 *
 * TODO: Eigene Unterklassen erstellen, z.B. Player, Platform, Spike.
 */
public abstract class GameObject implements Updatable, Collidable {

	/** x-Position (linke Kante) in Weltkoordinaten. */
	protected double x;

	/** y-Position (obere Kante) in Weltkoordinaten. */
	protected double y;

	/** Breite des Objekts in Pixeln. */
	protected double width;

	/** Höhe des Objekts in Pixeln. */
	protected double height;

	/**
	 * Debug-Modus: zeigt Begrenzungsrahmen (AABB) aller Objekte an. Mit der D-Taste
	 * im Spiel umschalten.
	 */
	public static boolean DEBUG = false;

	/**
	 * @param x      Startposition x
	 * @param y      Startposition y
	 * @param width  Breite in Pixeln
	 * @param height Höhe in Pixeln
	 */
	protected GameObject(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Collidable-Implementierung
	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getX() {
		return x;
	}

	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getY() {
		return y;
	}

	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getWidth() {
		return width;
	}

	@Override
	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getHeight() {
		return height;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setX(double x) {
		this.x = x;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Spiellogik für dieses Objekt — wird jeden Tick aufgerufen. TODO: Hier z.B.
	 * Schwerkraft, Bewegung oder Animationsframes aktualisieren.
	 */
	@Override
	public abstract void update();

	/**
	 * Zeichnet dieses Objekt in den Grafikkontext. Der Kontext ist bereits auf
	 * Weltkoordinaten verschoben. TODO: Hier z.B. g2d.fillRect(...) oder
	 * sprite.draw(g2d, ...) aufrufen.
	 *
	 * @param g2d der Grafikkontext
	 */
	public abstract void draw(Graphics2D g2d);

	/**
	 * Debug-Farbe für den Begrenzungsrahmen dieses Objekts. In eigenen Unterklassen
	 * überschreiben, um Typen farblich zu unterscheiden. Beispiel: tödliche Objekte
	 * rot, den Player cyan.
	 *
	 * @return Farbe des Debug-Rahmens
	 */
	public Color getDebugColor() {
		return new Color(0x800080); // grün als Violett
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[x=" + x + ", y=" + y + ", b=" + width + ", h=" + height + "]";
	}
}
