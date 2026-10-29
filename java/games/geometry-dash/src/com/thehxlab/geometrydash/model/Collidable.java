package com.thehxlab.geometrydash.model;

/**
 * Stellt den achsenausgerichteten Begrenzungsrahmen eines Objekts bereit, damit
 * die CollisionEngine Überlappungen prüfen kann.
 */
public interface Collidable {

	/** @return linke Kante in Weltkoordinaten (Pixel) */
	double getX();

	/** @return obere Kante in Weltkoordinaten (Pixel) */
	double getY();

	/** @return Breite des Begrenzungsrahmens (Pixel) */
	double getWidth();

	/** @return Höhe des Begrenzungsrahmens (Pixel) */
	double getHeight();
}
