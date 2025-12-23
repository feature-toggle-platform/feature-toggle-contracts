package pl.feature.toggle.service.contracts.shared;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public record Metadata(
        String actorId,
        String username,
        LocalDateTime occurredAt
) {

    private static final ChronoUnit PRECISION = ChronoUnit.SECONDS;

    public static Metadata create(String actorId, String username) {
        return new Metadata(actorId, username, LocalDateTime.now().truncatedTo(PRECISION));
    }

    public static Metadata empty() {
        return new Metadata(null, null, LocalDateTime.now().truncatedTo(PRECISION));
    }
}
