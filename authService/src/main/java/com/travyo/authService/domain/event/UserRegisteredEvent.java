package com.travyo.authService.domain.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisteredEvent {
    private UUID userId;
    private String email;
    private String provider;
    private LocalDateTime registeredAt;
    private String eventId;
}
