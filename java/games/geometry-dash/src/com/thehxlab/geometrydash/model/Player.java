package com.thehxlab.geometrydash.model;

import java.awt.Color;
import java.awt.Graphics2D;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class Player extends GameObject {
	private PlayerState playerState;
	private boolean onGround;
	public Player(double x, double y) {
		super(x, y, 40, 40);
		playerState = new PlayerState();
		this.onGround = false;
	}

	@Override
	public void update() {

		playerState.setVelocityY(playerState.getVelocityY() + PlayerState.DEFAULT_GRAVITY);

		// y-Position aktualisieren
		y = y + playerState.getVelocityY();

		// onGround zurücksetzen
		onGround = false;
		
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.CYAN);

		// Wir Casting hier, da x , y sind double und fillOval akzeptiert nir Integer
		g2d.fillOval((int) this.x, (int) this.y, (int) this.width, (int) this.height);
	}

	// Wenn Bodenkontakt besteht, den Sprungimpuls setzen.
	public void jump() {
		if (onGround == true) {
			// setVelocityY nimmt den Wert von DEFAULT_JUMP_FORCE also -12
			// um einen Wert beim Setter zuweisen, gibt man ihn im klammern
			playerState.setVelocityY(PlayerState.DEFAULT_JUMP_FORCE);
		}
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	// Hier machen wir return für die Geswindwigkeit
	public double getVelocityY() {
		return playerState.getVelocityY();
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setVelocityY(double velocityY) {
		playerState.setVelocityY(velocityY);
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public PlayerState getPlayerState() {
		return playerState;
	}

}
