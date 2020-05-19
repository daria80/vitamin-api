package com.vitamin.vitamin.repositories;

import com.vitamin.vitamin.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository<Day,Long> {
}
