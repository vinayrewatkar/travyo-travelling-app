package com.travyo.authService.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RedisHash("refresh_tokens")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefreshToken {

    @Id
    private String id; // the token string itself (UUID)

    @Indexed
    private UUID userId; // lets us query by userId

    private String familyId; // all rotated tokens share one familyId

    private boolean used; // true once rotated

    @TimeToLive(unit = TimeUnit.MILLISECONDS)
    private long ttl; // pulled from jwt.refresh-token-expiry
}
