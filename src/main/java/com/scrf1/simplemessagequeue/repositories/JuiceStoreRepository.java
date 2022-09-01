package com.scrf1.simplemessagequeue.repositories;

import com.scrf1.simplemessagequeue.models.JuiceStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JuiceStoreRepository extends JpaRepository<JuiceStore, Long> {
    boolean existsByEmail1AndEmail2(String email1, String email2);
}
