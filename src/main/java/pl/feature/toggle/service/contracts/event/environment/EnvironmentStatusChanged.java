package pl.feature.toggle.service.contracts.event.environment;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.util.UUID;

@Builder
public record EnvironmentStatusChanged(
        EventId eventId,
        UUID environmentId,
        UUID projectId,
        String status,
        Metadata metadata,
        Changes changes
) implements IntegrationEvent {

    public static final String EVENT_TYPE = EnvironmentStatusChanged.class.getName();

    public static EnvironmentStatusChangedBuilder environmentStatusChangedBuilder() {
        return new EnvironmentStatusChangedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

}
