package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.Vitamin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitaminRepository extends JpaRepository<Vitamin, Long> {
}
