package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.DayItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayItemRepository extends JpaRepository<DayItem,Long> {
}
