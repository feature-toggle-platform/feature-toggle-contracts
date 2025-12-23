package pl.feature.toggle.service.contracts.shared;

import java.time.LocalDateTime;

public record Metadata(
        String actorId,
        String username,
        LocalDateTime occurredAt
) {

    public static Metadata create(String actorId, String username) {
        return new Metadata(actorId, username, LocalDateTime.now());
    }

    public static Metadata empty() {
        return new Metadata(null, null, LocalDateTime.now());
    }
}
