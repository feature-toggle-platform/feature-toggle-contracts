import java.util.UUID;

public class EnvironmentCreatedEventBuilder {

    private UUID environmentId;
    private UUID projectId;
    private String environmentName;

    private EnvironmentCreatedEventBuilder() {
        this.environmentId = UUID.randomUUID();
        this.projectId = UUID.randomUUID();
        this.environmentName = "test-environment";
    }

    public static EnvironmentCreatedEventBuilder anEnvironmentCreatedEvent() {
        return new EnvironmentCreatedEventBuilder();
    }

    public EnvironmentCreatedEventBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public EnvironmentCreatedEventBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public EnvironmentCreatedEventBuilder withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

}
