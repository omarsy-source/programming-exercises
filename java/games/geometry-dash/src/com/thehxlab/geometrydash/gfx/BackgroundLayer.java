package com.thehxlab.geometrydash.gfx;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Eine horizontal gekachelte Hintergrundebene mit Parallax-Scrolling. Ein
 * scrollFactor von 0.0 hält die Ebene still, 1.0 scrollt sie mit dem
 * Vordergrund. Mehrere Ebenen mit unterschiedlichen Faktoren erzeugen einen
 * Tiefeneffekt.
 */
public final class BackgroundLayer {

	private final BufferedImage image;

	/**
	 * Anteil der Kamerageschwindigkeit, mit dem diese Ebene scrollt (0.0 – 1.0).
	 */
	private final double scrollFactor;

	private double offsetX;

	/**
	 * @param resourcePath Klassenpfad zum Hintergrundbild
	 * @param scrollFactor Parallax-Multiplikator zwischen 0.0 und 1.0
	 * @throws IOException wenn das Bild nicht geladen werden kann
	 */
	public BackgroundLayer(String resourcePath, double scrollFactor) throws IOException {
		InputStream is = BackgroundLayer.class.getResourceAsStream(resourcePath);
		if (is == null) {
			throw new IOException("Ressource nicht gefunden: " + resourcePath);
		}
		this.image = ImageIO.read(is);
		this.scrollFactor = scrollFactor;
	}

	/**
	 * Rückt den Scroll-Versatz einen Tick vor.
	 *
	 * @param cameraScrollSpeed aktuelle Scrollgeschwindigkeit des Levels
	 */
	public void update(double cameraScrollSpeed) {
		offsetX += cameraScrollSpeed * scrollFactor;
		if (offsetX >= image.getWidth()) {
			offsetX -= image.getWidth();
		}
	}

	/**
	 * Kachelt das Bild horizontal über die gesamte Bildschirmbreite.
	 *
	 * @param g2d          der Grafikkontext
	 * @param screenWidth  Breite des Viewports
	 * @param screenHeight Höhe des Viewports
	 */
	public void draw(Graphics2D g2d, int screenWidth, int screenHeight) {
		int startX = -(int) (offsetX % image.getWidth());
		for (int x = startX; x < screenWidth; x += image.getWidth()) {
			g2d.drawImage(image, x, 0, image.getWidth(), screenHeight, null);
		}
	}
}
