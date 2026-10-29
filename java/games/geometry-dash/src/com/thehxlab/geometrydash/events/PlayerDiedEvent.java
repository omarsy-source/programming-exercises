package com.thehxlab.geometrydash.events;

/**
 * Wird veröffentlicht, wenn der Player stirbt.
 */
public final class PlayerDiedEvent extends GameEvent {

	/** x-Position des Spielers zum Todeszeitpunkt (Weltkoordinaten). */
	private final double deathX;

	/**
	 * @param deathX x-Position des Spielers beim Tod
	 */
	public PlayerDiedEvent(double deathX) {
		super();
		this.deathX = deathX;
	}

	/** @return x-Position des Spielers beim Tod */
	public double getDeathX() {
		return deathX;
	}
}
