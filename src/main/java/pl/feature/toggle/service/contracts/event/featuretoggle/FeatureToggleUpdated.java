package pl.feature.toggle.service.contracts.event.featuretoggle;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleUpdated(
        EventId eventId,
        UUID id,
        UUID projectId,
        UUID environmentId,
        String name,
        String description,
        String type,
        String value,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) implements IntegrationEvent {

    public static FeatureToggleUpdatedBuilder featureToggleUpdatedEventBuilder() {
        return new FeatureToggleUpdatedBuilder()
                .eventId(EventId.create());
    }

}

