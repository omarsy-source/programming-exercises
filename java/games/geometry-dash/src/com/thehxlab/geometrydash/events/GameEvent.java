package com.thehxlab.geometrydash.events;

/**
 * Abstrakte Basisklasse für alle Ereignisse im EventBus. Unterklassen fügen
 * eigene Felder hinzu und stellen Getter bereit.
 */
public abstract class GameEvent {

	/** Zeitpunkt der Erstellung in Nanosekunden. */
	private final long timestampNs;

	protected GameEvent() {
		this.timestampNs = System.nanoTime();
	}

	/** @return Erstellungszeitstempel in Nanosekunden */
	public long getTimestampNs() {
		return timestampNs;
	}
}
