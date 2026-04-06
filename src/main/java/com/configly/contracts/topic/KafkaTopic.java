package com.configly.contracts.topic;

import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public enum KafkaTopic {

    CONFIGURATION("configly-structure-events"),
    FEATURE_TOGGLE("configly-toggle-events");

    private final String topicName;

    KafkaTopic(String topic) {
        this.topicName = topic;
    }
}
