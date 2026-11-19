package uz.khakimjanovich.outbox4j;

import java.util.UUID;

public record OutboxEvent(UUID id, String topic, String key, String type, String payload) {}
