package com.codesentinel.codesentinel.dto;

import java.time.Instant;

public record ProjectResponse(Long id, String name, Instant createdAt, Instant updatedAt) {
}
