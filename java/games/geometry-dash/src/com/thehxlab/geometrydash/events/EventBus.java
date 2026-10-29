package com.thehxlab.geometrydash.events;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/**
 * Zentraler Ereignisbus (Singleton) zum Entkoppeln von Sender und Empfänger.
 * Erzeuger rufen publish() auf, Empfänger registrieren sich mit subscribe().
 */
public final class EventBus {

    private static final EventBus INSTANCE = new EventBus();

    private final Map<Class<?>, List<Consumer<?>>> handlers = new ConcurrentHashMap<>();

    private EventBus() {}

    /** @return die einzige Instanz des EventBus */
	public static EventBus getInstance() {
        return INSTANCE;
    }

    /**
     * Registriert einen Handler für einen bestimmten Ereignistyp.
     *
     * @param type    Klasse des Ereignisses (z.B. {@code PlayerDiedEvent.class})
     * @param handler wird aufgerufen, wenn ein passendes Ereignis veröffentlicht wird
     */
    public <T extends GameEvent> void subscribe(Class<T> type, Consumer<T> handler) {
        handlers.computeIfAbsent(type, k -> new CopyOnWriteArrayList<>())
                .add(handler);
    }

    /**
     * Leitet das Ereignis an alle passenden Handler continueRequested.
     *
     * @param event das zu versendende Ereignis
     */
    @SuppressWarnings("unchecked")
    public void publish(GameEvent event) {
        List<Consumer<?>> list = handlers.get(event.getClass());
        if (list != null) {
            for (Consumer<?> consumer : list) {
                ((Consumer<GameEvent>) consumer).accept(event);
            }
        }
    }

    /** Entfernt alle registrierten Handler (z.B. beim Neustart). */
    public void clear() {
        handlers.clear();
    }
}
