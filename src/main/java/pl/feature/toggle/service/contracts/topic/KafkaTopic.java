package pl.feature.toggle.service.contracts.topic;

import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public enum KafkaTopic {

    PROJECT_ENV("project-env-events"),
    FEATURE_TOGGLE("feature-toggle-events");

    private final String topic;

    KafkaTopic(String topic) {
        this.topic = topic;
    }
}
