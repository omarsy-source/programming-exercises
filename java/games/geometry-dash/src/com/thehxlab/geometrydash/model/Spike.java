package com.thehxlab.geometrydash.model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Spike extends GameObject {

	protected Spike(double x, double y) {
		super(x, y, 40, 40);

	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics2D g2d) {
		/*
		 * Wir wollen Polygon erstellen, dafür brauchen wir 2 Array einmal auf X Achse
		 * und einmal auf Y achse dann die Anzahl der Punkte Bei Java ist ein bisschen
		 * anders als mathe, Die Y-Achse wächst nach unten X bleibt wie bei Mathe.
		 */
		int[] xPoints = { (int) x, (int) x + 20, (int) x + 40 };
		int[] yPoints = { (int) y +40 , (int) y, (int) y +40};

		g2d.setColor(Color.RED);
		g2d.fillPolygon(xPoints, yPoints, 3);

		g2d.setColor(Color.yellow);
		// Rahmen Farbe
		g2d.drawPolygon(xPoints, yPoints, 3);
	}
}
