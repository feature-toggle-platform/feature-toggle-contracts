package pl.feature.toggle.service.contracts.event.project;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.util.UUID;

@Builder
public record ProjectUpdated(
        EventId eventId,
        UUID projectId,
        String projectName,
        Metadata metadata,
        String status,
        Changes changes
) implements IntegrationEvent {

    public static final String EVENT_TYPE = ProjectUpdated.class.getName();

    public static ProjectUpdatedBuilder projectUpdatedEventBuilder() {
        return new ProjectUpdatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

}
