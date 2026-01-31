package pl.feature.toggle.service.contracts.event.environment;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.util.UUID;

@Builder
public record EnvironmentUpdated(
        EventId eventId,
        UUID environmentId,
        UUID projectId,
        String environmentName,
        Metadata metadata
) implements IntegrationEvent {

    public static final String EVENT_TYPE = EnvironmentUpdated.class.getName();

    public static EnvironmentUpdatedBuilder environmentUpdatedEventBuilder() {
        return new EnvironmentUpdatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

}
