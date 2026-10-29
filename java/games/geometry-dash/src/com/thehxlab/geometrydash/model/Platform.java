package com.thehxlab.geometrydash.model;

import java.awt.Color;
import java.awt.Graphics2D;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Platform extends GameObject {
	private Color color;

	public Platform(double x, double y, double width, double height) {
		super(x, y, width, height);
		this.color = Color.GREEN;
	}

	public Platform(double x, double y, double width, double height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(color);

		// fillRect akz. nur Integer!
		g2d.fillRect((int) this.x, (int) this.y, (int) this.width, (int) this.height);

	}

}
