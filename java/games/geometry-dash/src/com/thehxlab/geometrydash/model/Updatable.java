package com.thehxlab.geometrydash.model;

/**
 * Markiert ein Objekt, das jeden Spieltick aktualisiert werden muss.
 */
public interface Updatable {

	/** Rückt den Zustand dieses Objekts um einen Tick vor. */
	void update();
}
