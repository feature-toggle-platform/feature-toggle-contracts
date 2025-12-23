package pl.feature.toggle.service.contracts.event.featuretoggle;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;

import java.util.UUID;

@Builder
public record FeatureToggleDeleted(
        EventId eventId,
        UUID id,
        String actorId,
        String username
) implements IntegrationEvent {

    public static FeatureToggleDeletedBuilder featureToggleDeletedEvent() {
        return new FeatureToggleDeletedBuilder();
    }

}
