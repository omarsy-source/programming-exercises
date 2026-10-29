package com.thehxlab.geometrydash.engine;

import com.thehxlab.geometrydash.model.Collidable;

import java.util.ArrayList;
import java.util.List;

/**
 * Einfache AABB-Kollisionserkennung (Axis-Aligned Bounding Box). Zwei Rechtecke
 * überlappen sich, wenn sie sich auf beiden Achsen schneiden.
 */
public final class CollisionEngine {

	/**
	 * Prüft, ob sich die Begrenzungsrahmen von a und b überlappen.
	 *
	 * @param a erstes Objekt
	 * @param b zweites Objekt
	 * @return true bei Überlappung
	 */
	public boolean overlaps(Collidable a, Collidable b) {
		return a.getX() < b.getX() + b.getWidth() && a.getX() + a.getWidth() > b.getX()
				&& a.getY() < b.getY() + b.getHeight() && a.getY() + a.getHeight() > b.getY();
	}

	/**
	 * Gibt alle Objekte aus candidates zurück, die subject überlappen. Das subject
	 * selbst wird dabei ausgeschlossen.
	 *
	 * @param subject    das zu prüfende Objekt (z.B. der Player)
	 * @param candidates alle anderen Objekte im Level
	 * @return Liste der kollidierenden Objekte
	 */
	public List<Collidable> getCollisions(Collidable subject, List<? extends Collidable> candidates) {
		List<Collidable> results = new ArrayList<>();
		for (Collidable candidate : candidates) {
			if (candidate != subject && overlaps(subject, candidate)) {
				results.add(candidate);
			}
		}
		return results;
	}
}
