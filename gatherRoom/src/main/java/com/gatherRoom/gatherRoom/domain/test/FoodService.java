package com.gatherRoom.gatherRoom.domain.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FoodService {

	private final FoodRepository foodRepository;
	// DI , foodService는 foodRep가 필요하다.!
	// foodRep의 구현체는 MemoryRep 가 될 수도 있고, JDBCTemplete이 될 수도 있고, JpaRep가 될 수도 있다.
	@Autowired
	public FoodService(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	public FoodTest insertFood (FoodTest food) {
		return foodRepository.save(food);
	}

	public List<FoodTest> findFoods(){
		return foodRepository.findAll();
	}

	public Optional<FoodTest> findOne(Long foodId){
		return foodRepository.findById(foodId);
	}

	public FoodTest delete(Long foodId) {
		return foodRepository.delete(foodId);
	}

}
