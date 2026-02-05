package pl.feature.toggle.service.contracts.event.project;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.util.UUID;

@Builder
public record ProjectCreated(
        EventId eventId,
        UUID projectId,
        String projectName,
        Metadata metadata,
        String status,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = ProjectCreated.class.getName();

    public static ProjectCreatedBuilder projectCreatedEventBuilder() {
        return new ProjectCreatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }
}
