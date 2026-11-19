package io.github.org4j.outbox;

import java.util.UUID;

public record OutboxEvent(UUID id, String topic, String key, String type, String payload) {}
