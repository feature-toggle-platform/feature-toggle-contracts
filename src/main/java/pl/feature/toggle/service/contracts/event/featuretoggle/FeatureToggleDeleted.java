package pl.feature.toggle.service.contracts.event.featuretoggle;

import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.util.UUID;

@Builder
public record FeatureToggleDeleted(
        EventId eventId,
        UUID id,
        Metadata metadata
) implements IntegrationEvent {

    public static FeatureToggleDeletedBuilder featureToggleDeletedEvent() {
        return new FeatureToggleDeletedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

}
