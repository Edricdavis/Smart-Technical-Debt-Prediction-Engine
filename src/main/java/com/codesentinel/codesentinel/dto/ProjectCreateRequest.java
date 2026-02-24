package com.codesentinel.codesentinel.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProjectCreateRequest(
        @NotBlank(message = "Project name is required")
        @Size(max = 120, message = "Project name must be less than 120 characters")
        String name
) {
}
