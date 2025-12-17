import java.util.UUID;

public class ProjectCreatedEventBuilder {

    private UUID projectId;
    private String projectName;

    private ProjectCreatedEventBuilder() {
        this.projectId = UUID.randomUUID();
        this.projectName = "test-project";
    }

    public static ProjectCreatedEventBuilder asProjectCreatedEvent() {
        return new ProjectCreatedEventBuilder();
    }

    public ProjectCreatedEventBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public ProjectCreatedEventBuilder withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

}
