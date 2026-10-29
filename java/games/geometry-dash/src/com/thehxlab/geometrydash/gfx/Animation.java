package com.thehxlab.geometrydash.gfx;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * Spielt eine Frame-Animation aus einem horizontalen Spritesheet ab. Alle
 * Frames haben dieselbe Breite und sind nebeneinander in einer Zeile
 * angeordnet.
 *
 * Jeden Tick update() aufrufen, jeden Frame draw() aufrufen.
 */
public final class Animation {

	private final BufferedImage spritesheet;
	private final int frameWidth;
	private final int frameHeight;
	private final int frameCount;

	/** Anzahl Ticks, die jeder Frame angezeigt wird. */
	private final int frameDurationTicks;

	private int currentFrame;
	private int ticksElapsed;

	/**
	 * @param resourcePath       Klassenpfad zum Spritesheet
	 * @param frameWidth         Breite eines Frames in Pixeln
	 * @param frameHeight        Höhe eines Frames in Pixeln
	 * @param frameCount         Anzahl der Frames im Sheet
	 * @param frameDurationTicks Ticks pro Frame (kleiner = schneller)
	 * @throws IOException wenn das Bild nicht geladen werden kann
	 */
	public Animation(String resourcePath, int frameWidth, int frameHeight, int frameCount, int frameDurationTicks)
			throws IOException {
		InputStream is = Animation.class.getResourceAsStream(resourcePath);
		if (is == null) {
			throw new IOException("Ressource nicht gefunden: " + resourcePath);
		}
		this.spritesheet = ImageIO.read(is);
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.frameCount = frameCount;
		this.frameDurationTicks = frameDurationTicks;
	}

	/** Rückt die Animation um einen Tick vor. */
	public void update() {
		ticksElapsed++;
		if (ticksElapsed >= frameDurationTicks) {
			ticksElapsed = 0;
			currentFrame = (currentFrame + 1) % frameCount;
		}
	}

	/**
	 * Zeichnet den aktuellen Frame an der angegebenen Position.
	 *
	 * @param g2d der Grafikkontext
	 * @param x   x-Position auf dem Bildschirm
	 * @param y   y-Position auf dem Bildschirm
	 */
	public void draw(Graphics2D g2d, int x, int y) {
		int srcX = currentFrame * frameWidth;
		g2d.drawImage(spritesheet, x, y, x + frameWidth, y + frameHeight, srcX, 0, srcX + frameWidth, frameHeight,
				null);
	}

	/** Setzt die Animation auf den ersten Frame zurück. */
	public void reset() {
		currentFrame = 0;
		ticksElapsed = 0;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getCurrentFrame() {
		return currentFrame;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getFrameWidth() {
		return frameWidth;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public int getFrameHeight() {
		return frameHeight;
	}
}
