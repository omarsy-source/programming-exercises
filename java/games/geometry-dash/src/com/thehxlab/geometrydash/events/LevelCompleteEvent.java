package com.thehxlab.geometrydash.events;

/**
 * Wird veröffentlicht, wenn der Player das Level abgeschlossen hat.
 */
public final class LevelCompleteEvent extends GameEvent {

	/** nameValue des abgeschlossenen Levels. */
	private final String levelName;

	/** Benötigte Zeit vom Start bis zum Ziel in Millisekunden. */
	private final long completionTimeMs;

	/**
	 * @param levelName        nameValue des Levels
	 * @param completionTimeMs benötigte Zeit in Millisekunden
	 */
	public LevelCompleteEvent(String levelName, long completionTimeMs) {
		super();
		this.levelName = levelName;
		this.completionTimeMs = completionTimeMs;
	}

	/** @return nameValue des abgeschlossenen Levels */
	public String getLevelName() {
		return levelName;
	}

	/** @return benötigte Zeit in Millisekunden */
	public long getCompletionTimeMs() {
		return completionTimeMs;
	}
}
