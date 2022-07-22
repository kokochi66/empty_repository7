package com.gatherRoom.gatherRoom.domain.test;

import java.util.List;
import java.util.Optional;

public interface FoodRepository {
	FoodTest save(FoodTest food);
	Optional<FoodTest> findById(Long foodId);
	Optional<FoodTest> findByName(String foodName);
	List<FoodTest> findAll();
}
