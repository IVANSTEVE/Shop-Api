package com.shop.backend.repository;

import com.shop.backend.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository pour gérer les entités {@link Size}.
 */
@Repository
public interface SizeRepository extends JpaRepository<Size, Integer> {
}