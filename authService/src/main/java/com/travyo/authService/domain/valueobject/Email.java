package com.travyo.authService.domain.valueobject;

import java.util.Objects;
import java.util.regex.Pattern;

public record Email(String value) {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    // compact canonical constructor — runs on every new Email(...)
    public Email {
        Objects.requireNonNull(value, "Email must not be null");
        if (!EMAIL_PATTERN.matcher(value.trim()).matches()) {
            throw new IllegalArgumentException("Invalid email format: " + value);
        }
        value = value.trim().toLowerCase();
    }

    @Override
    public String toString() {
        return value;
    }
}