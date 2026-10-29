package com.thehxlab.geometrydash.model;

/**
 * Wird von Objekten implementiert, die den Spielerzustand bei Berührung
 * verändern, z.B. Sprungpolster, Schwerkraftring oder Geschwindigkeitsportal.
 */
public interface PlayerEffector {

	/**
	 * Verändert den Spielerzustand bei Berührung.
	 *
	 * @param state der aktuelle, veränderliche Spielerzustand
	 */
	void applyEffect(PlayerState state);

	/** @return kurze Bezeichnung dieses Effektors, z.B. "SPRUNGPOLSTER" */
	String getEffectorType();
}
