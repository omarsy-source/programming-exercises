package com.thehxlab.geometrydash.events;

import com.thehxlab.geometrydash.model.PlayerEffector;

/**
 * Wird veröffentlicht, wenn der Player einen PlayerEffector berührt (z.B.
 * Sprungpolster, Schwerkraftring, Geschwindigkeitsportal).
 */
public final class EffectorTriggeredEvent extends GameEvent {

	/** Der ausgelöste Effektor. */
	private final PlayerEffector effector;

	/**
	 * @param effector der aktivierte Effektor
	 */
	public EffectorTriggeredEvent(PlayerEffector effector) {
		super();
		this.effector = effector;
	}

	/** @return der aktivierte Effektor */
	public PlayerEffector getEffector() {
		return effector;
	}
}
