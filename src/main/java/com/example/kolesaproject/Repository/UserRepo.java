package com.example.kolesaproject.Repository;

import com.example.kolesaproject.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
