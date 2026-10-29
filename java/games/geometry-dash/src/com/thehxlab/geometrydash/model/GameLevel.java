package com.thehxlab.geometrydash.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import com.thehxlab.geometrydash.engine.CollisionEngine;
import com.thehxlab.geometrydash.events.EventBus;
import com.thehxlab.geometrydash.events.LevelCompleteEvent;
import com.thehxlab.geometrydash.events.PlayerDiedEvent;

// Unterklasse: erweitert das Verhalten ihrer Basisklasse.

public class GameLevel extends Level {
	private Player player;
	private Platform groundPlatform;
	private CollisionEngine collisionEngine;
	private PlayerDiedEvent playerDiedEvent;
	private EventBus eventBus;
	private int finishX = 3000;

	public GameLevel(String name) {
		super(name);
		collisionEngine = new CollisionEngine();
	    eventBus = EventBus.getInstance();

	}
	public void jumpPlayer() {
		player.jump();
	}
	@Override
	public void update() {

		// Alle Objekte aktualisieren dafür brauchen wir Loop
		for (GameObject obj : getObjects()) {
			obj.update();
		}

		// Kamera dem Player folgen
		cameraX = player.getX() - 150;
		player.setX(player.getX() + DEFAULT_SCROLL_SPEED);
		
		
		// Spike getroffen → PlayerDiedEvent publishen

		// gibt LISTE zurück, nicht ein Objekt
		List<Collidable> collisions = collisionEngine.getCollisions(player, getObjects());
		for (Collidable col : collisions) {
			// prüft Ist das ein Spike?
			if (col instanceof Spike) {
				playerDiedEvent = new PlayerDiedEvent(player.getX());
				eventBus.publish(playerDiedEvent);
			}
			if (col instanceof Platform) {
				// Player einrasten
				// Die obere Spielerposition liegt um die Spielerhöhe über der Plattform.
				// Kleinere y-Werte verschieben den Spieler auf dem Bildschirm nach oben.
				// So stehen die Füße des Spielers auf der Plattform.
				// wenn col einen Platform entählt, dann Casting wir, um den Platform heruas zu finden
				Platform touchedPlatform = (Platform) col;
				player.setY(touchedPlatform.getY() - player.height );
				player.setOnGround(true);
			}
			if (player.getY() > 570) {
				eventBus.publish(new PlayerDiedEvent(player.getX()));
			}

			// Der Player hat den Ziel erreicht
			// Wir können hier am besten mit >= vergleichen, da neim LAufen auf x Achse
			// nutzt das Spiel "Frame" Also es ist nicht garntiert, dass der Player den
			// extaxten Ziel zB statt 2000 erreicht er 2005
			if (player.getX() >= finishX) {
				eventBus.publish(new LevelCompleteEvent(name, 0));
			}

		}
	}

	@Override
	// Die vorbereiteten Daten oder Objekte laden.
	public void load() {
		int x = 0;
		// y steht für Y achse für den Boden Erstellung
		int y = 400;
		// 1460 damit der Player genau aufm Boden sein. Wo der Player aufm Spiel ist =
		// y - Player size (40)
		player = new Player(0, y - 40);
		// Player hinzufügen
		addObject(player);

		groundPlatform = new Platform(x, y, 3200, 50);
		addObject(groundPlatform);

		// Hindernisse
		addObject(new Spike(200, y - 40));
		addObject(new Spike(500, y - 40));
		addObject(new Spike(1000, y - 40));
		addObject(new Spike(1500, y - 40));
		addObject(new Spike(2000, y - 40));
		addObject(new Spike(2500, y - 40));

		// 2 Plattformen
		addObject(new Platform(x + 300, y - 200, 200, 20, Color.darkGray));
		addObject(new Platform(x + 500, y - 300, 200, 20, Color.darkGray));

		// Zielsäule am Ende
		addObject(new Platform(finishX, y - 200, 50, 200, Color.orange));
	}

	// Den zugehörigen gespeicherten Wert zurückgeben.
	public Player getPlayer() {
		return player;
	}

}
