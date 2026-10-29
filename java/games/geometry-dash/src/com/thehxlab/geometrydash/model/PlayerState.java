package com.thehxlab.geometrydash.model;

/**
 * Speichert den gesamten Laufzeitzustand des Spielers. Wird an
 * PlayerEffector.applyEffect() übergeben, damit Effektoren den Zustand
 * verändern können, ohne den Player direkt zu kennen.
 */
public final class PlayerState {

	/** Richtung, in die die Schwerkraft aktuell wirkt. */
	public enum GravityDirection {
		DOWN, // normal: Player fällt nach unten
		UP // umgekehrt: Player fällt nach oben
	}

	/** Aktiver Spielmodus — bestimmt Bewegung und Sprungverhalten. */
	public enum GameMode {
		CUBE, // Tippen = Sprung mit festem Impuls
		SHIP, // Halten = nach oben fliegen
		BALL, // Tippen = Schwerkraft umkehren
		UFO, // Tippen = kurzer Aufwärtsschub
		WAVE // Winkel durch Halten/Loslassen steuern
	}

	/** Standard-Sprungimpuls in Pixeln pro Tick (negativ = aufwärts). */
	public static final double DEFAULT_JUMP_FORCE = -12.0;

	/** Schwerkraftbeschleunigung, die pro Tick zu velocityY addiert wird. */
	public static final double DEFAULT_GRAVITY = 0.6;

	private GravityDirection gravityDirection;
	private GameMode gameMode;
	private double speedMultiplier;
	private double velocityY;
	private double jumpForce;
	private boolean alive;

	/** Erstellt einen Spielerzustand mit Standardwerten für Level-Start. */
	public PlayerState() {
		this.gravityDirection = GravityDirection.DOWN;
		this.gameMode = GameMode.CUBE;
		this.speedMultiplier = 1.0;
		this.velocityY = 0.0;
		this.jumpForce = DEFAULT_JUMP_FORCE;
		this.alive = true;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public GravityDirection getGravityDirection() {
		return gravityDirection;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setGravityDirection(GravityDirection gravityDirection) {
		this.gravityDirection = gravityDirection;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public GameMode getGameMode() {
		return gameMode;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setGameMode(GameMode gameMode) {
		this.gameMode = gameMode;
	}

	/** Geschwindigkeitsmultiplikator: 1.0 = normal, 2.0 = doppelt. */
	public double getSpeedMultiplier() {
		return speedMultiplier;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setSpeedMultiplier(double speedMultiplier) {
		this.speedMultiplier = speedMultiplier;
	}

	/**
	 * Vertikale Geschwindigkeit in Pixeln pro Tick (positiv = nach unten).
	 *
	 * Wichtig: Dies ist die einzige Quelle der Wahrheit für die y-Geschwindigkeit.
	 * Die Klasse Player sollte KEIN eigenes velocityY-Feld anlegen, sondern
	 * ausschließlich state.getVelocityY() / state.setVelocityY() verwenden. Nur so
	 * kann PlayerEffector.applyEffect(state) die Geschwindigkeit tatsächlich
	 * verändern – z.B. um den Player mit einem Sprungpolster hochzuschleudern.
	 */
	public double getVelocityY() {
		return velocityY;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setVelocityY(double velocityY) {
		this.velocityY = velocityY;
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public double getJumpForce() {
		return jumpForce;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setJumpForce(double jumpForce) {
		this.jumpForce = jumpForce;
	}

	// Die zugehörige Zustandsbedingung prüfen.
	public boolean isAlive() {
		return alive;
	}

	// Das zugehörige Feld mit dem übergebenen Wert aktualisieren.
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
