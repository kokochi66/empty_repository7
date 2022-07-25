package com.gatherRoom.gatherRoom.repository;

import com.gatherRoom.gatherRoom.domain.test.FoodTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepositoryJpa extends JpaRepository<FoodTest, Long> {

}
