package com.gatherRoom.gatherRoom.domain.test;

import java.util.List;
import java.util.Optional;

public interface FoodRepository {
	// 푸드를 저장한다
	FoodTest save(FoodTest food);
	// 푸드를 ID 로 찾는다
	Optional<FoodTest> findById(Long foodId);
	// 푸드를 아이디로 찾는다.
	Optional<FoodTest> findByName(String foodName);
	// 모든 푸드를 가져온다.
	List<FoodTest> findAll();
}
