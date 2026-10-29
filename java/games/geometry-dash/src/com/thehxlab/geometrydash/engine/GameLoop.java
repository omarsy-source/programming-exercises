package com.thehxlab.geometrydash.engine;

import com.thehxlab.geometrydash.model.Level;

import javax.swing.JPanel;

/**
 * Treibt die Spielschleife mit festem Zeitschritt auf einem Hintergrundthread
 * an. Ruft jeden Tick level.update() und danach renderTarget.repaint() auf.
 */
public final class GameLoop implements Runnable {

	/** Anzahl der Ticks (Updates + Frames) pro Sekunde. */
	public static final int TARGET_FPS = 60;

	/** Dauer eines Ticks in Nanosekunden. */
	public static final long NS_PER_TICK = 1_000_000_000L / TARGET_FPS;

	private final Level level;
	private final JPanel renderTarget;

	private volatile boolean running;
	private Thread loopThread;

	/**
	 * @param level        wird jeden Tick über update() aktualisiert
	 * @param renderTarget erhält jeden Frame einen repaint()-Aufruf
	 */
	public GameLoop(Level level, JPanel renderTarget) {
		this.level = level;
		this.renderTarget = renderTarget;
	}

	/** Startet den Spielschleifenthread. */
	public synchronized void start() {
		if (running)
			return;
		running = true;
		loopThread = new Thread(this, "GameLoop");
		loopThread.setDaemon(true);
		loopThread.start();
	}

	/** Stoppt den Spielschleifenthread. */
	public synchronized void stop() {
		running = false;
		if (loopThread != null) {
			loopThread.interrupt();
		}
	}

	/** @return true, solange die Schleife läuft */
	public boolean isRunning() {
		return running;
	}

	@Override
	public void run() {
		long previousTime = System.nanoTime();
		long lag = 0L;

		while (running) {
			long currentTime = System.nanoTime();
			lag += currentTime - previousTime;
			previousTime = currentTime;

			// Alle aufgelaufenen Ticks verarbeiten
			while (lag >= NS_PER_TICK) {
				level.update();
				lag -= NS_PER_TICK;
			}

			renderTarget.repaint();

			// Rest des Frame-Budgets schlafen
			long sleepNs = NS_PER_TICK - (System.nanoTime() - currentTime);
			if (sleepNs > 0) {
				try {
					Thread.sleep(sleepNs / 1_000_000L, (int) (sleepNs % 1_000_000L));
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					running = false;
				}
			}
		}
	}
}
