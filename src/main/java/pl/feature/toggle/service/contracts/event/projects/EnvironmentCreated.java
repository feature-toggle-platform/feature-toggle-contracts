package pl.feature.toggle.service.contracts.event.projects;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;

import java.util.UUID;

@Builder
public record EnvironmentCreated(
        EventId eventId,
        UUID environmentId,
        UUID projectId,
        String environmentName
) implements IntegrationEvent {

    public static final String EVENT_TYPE = EnvironmentCreated.class.getName();

    public static EnvironmentCreatedBuilder environmentCreatedEventBuilder() {
        return new EnvironmentCreatedBuilder()
                .eventId(EventId.create());
    }

}
