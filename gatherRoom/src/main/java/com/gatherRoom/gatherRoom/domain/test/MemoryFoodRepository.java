package com.gatherRoom.gatherRoom.domain.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

public class MemoryFoodRepository implements FoodRepository{

	private static Map<Long, FoodTest> store = new HashMap<>();
	private static long sequence = 0L;
	
	@Override
	public FoodTest save(FoodTest food) {
		food.setFoodId(++sequence);
		store.put(food.getFoodId(), food);
		return food;
	}

	@Override
	public Optional<FoodTest> findById(Long foodId) {
		return Optional.ofNullable(store.get(foodId));
	}

	@Override
	public Optional<FoodTest> findByName(String foodName) {
		// 여기서는 람다를 쓴다네? 신기하당
		return store.values().stream()
		.filter(food -> food.getFoodName().equals(foodName))
		.findAny();
	}

	@Override
	public List<FoodTest> findAll() {
		// 신기하네
		return new ArrayList<>(store.values());
	}
	
	public void clearStore() {
		store.clear();
	}

	@Override
	public FoodTest delete(Long foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodTest update(Long foodId) {
		// TODO Auto-generated method stub
		return null;
	}

}
