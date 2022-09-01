package com.scrf1.simplemessagequeue.repositories;

import com.scrf1.simplemessagequeue.models.Juice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuiceRepository extends JpaRepository<Juice, Long> {
    boolean existsByName(String name);
}
