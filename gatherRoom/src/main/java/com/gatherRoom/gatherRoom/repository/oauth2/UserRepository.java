package com.gatherRoom.gatherRoom.repository.oauth2;

import com.gatherRoom.gatherRoom.domain.oauth2.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}