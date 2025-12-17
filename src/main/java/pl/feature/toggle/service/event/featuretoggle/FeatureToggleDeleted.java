package pl.feature.toggle.service.event.featuretoggle;

import pl.feature.toggle.service.shared.EventId;
import pl.feature.toggle.service.shared.IntegrationEvent;
import lombok.Builder;

import java.util.UUID;

@Builder
public record FeatureToggleDeleted(
        EventId eventId,
        UUID id
) implements IntegrationEvent {

    public static FeatureToggleDeletedBuilder featureToggleDeletedEvent() {
        return new FeatureToggleDeletedBuilder();
    }

}
