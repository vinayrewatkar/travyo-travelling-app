package com.travyo.authService.repository;

import com.travyo.authService.domain.model.RefreshToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken,String> {

    // used to invalidate entire token family on reuse detection
    List<RefreshToken> findByFamilyId(String familyId);

    // used during logout — invalidate all tokens for a user
    List<RefreshToken> findByUserId(UUID userId);
}
