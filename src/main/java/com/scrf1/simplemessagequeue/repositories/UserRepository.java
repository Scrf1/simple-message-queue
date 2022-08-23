package com.scrf1.simplemessagequeue.repositories;

import com.scrf1.simplemessagequeue.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
