package pl.feature.toggle.service.shared;

import java.util.function.Consumer;

public interface EventProcessor {

    <T extends IntegrationEvent> void process(T event, Consumer<T> consumer);
}
