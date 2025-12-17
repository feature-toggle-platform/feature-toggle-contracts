package pl.feature.toggle.service.contracts.event.projects;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;

import java.util.UUID;

@Builder
public record ProjectCreated(
        EventId eventId,
        UUID projectId,
        String projectName
) implements IntegrationEvent {

    public static final String EVENT_TYPE = ProjectCreated.class.getName();

    public static ProjectCreatedBuilder projectCreatedEventBuilder() {
        return new ProjectCreatedBuilder()
                .eventId(EventId.create());
    }
}
