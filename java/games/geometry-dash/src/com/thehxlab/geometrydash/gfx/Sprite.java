package com.thehxlab.geometrydash.gfx;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Lädt ein einzelnes Standbild vom Klassenpfad und stellt es zum Zeichnen
 * bereit. Bilder unter src/resources/ ablegen, z.B. "/sprites/wuerfel.png".
 */
public final class Sprite {

	private final BufferedImage image;

	/**
	 * @param resourcePath absoluter Klassenpfad zum Bild, z.B.
	 *                     "/sprites/wuerfel.png"
	 * @throws IOException wenn die Datei nicht gefunden oder geladen werden kann
	 */
	public Sprite(String resourcePath) throws IOException {
		InputStream is = Sprite.class.getResourceAsStream(resourcePath);
		if (is == null) {
			throw new IOException("Ressource nicht gefunden: " + resourcePath);
		}
		this.image = ImageIO.read(is);
	}

	/**
	 * Zeichnet das Bild in natürlicher height.
	 *
	 * @param g2d der Grafikkontext
	 * @param x   x-Position auf dem Bildschirm
	 * @param y   y-Position auf dem Bildschirm
	 */
	public void draw(Graphics2D g2d, int x, int y) {
		g2d.drawImage(image, x, y, null);
	}

	/**
	 * Zeichnet das Bild skaliert auf die angegebene height.
	 *
	 * @param g2d    der Grafikkontext
	 * @param x      x-Position auf dem Bildschirm
	 * @param y      y-Position auf dem Bildschirm
	 * @param width  Zielbreite in Pixeln
	 * @param height Zielhöhe in Pixeln
	 */
	public void draw(Graphics2D g2d, int x, int y, int width, int height) {
		g2d.drawImage(image, x, y, width, height, null);
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getWidth() {
		return image.getWidth();
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getHeight() {
		return image.getHeight();
	}
}
