package com.gatherRoom.gatherRoom.repository;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.gatherRoom.gatherRoom.domain.test.FoodRepository;
import com.gatherRoom.gatherRoom.domain.test.FoodTest;
import com.gatherRoom.gatherRoom.domain.test.MemoryFoodRepository;

class MemoryFoodRepositoryTest {

	MemoryFoodRepository repository = new MemoryFoodRepository();

	@AfterEach
	public void afterEach() {
		// 테스트는 순서와 관계없이, 의존관계 없이 설계 되어야 한다. 테스트가 끝날 때마다 공용데이터를 삭제해줘야 한다.
		repository.clearStore();
	}
	
	@Test
	public void save() {
		FoodTest food1 = new FoodTest();
		food1.setFoodName("사과");
		food1.setPrice(500);

		repository.save(food1);
		FoodTest result = repository.findById(food1.getFoodId()).get(); // 여기서 왜 한 번 더 get을 써야하나?
		Assertions.assertEquals(food1, result);
	}
	
	@Test
	public void findById() {
		FoodTest food1 = new FoodTest();
		food1.setFoodName("사과");
		food1.setPrice(500);
		repository.save(food1);
	
		FoodTest food2 = new FoodTest();
		food2.setFoodName("포도");
		food2.setPrice(5000);
		repository.save(food2);

		FoodTest result = repository.findById(food1.getFoodId()).get();
		
		Assertions.assertEquals(food1,result);
	}
	@Test
	public void findAll() {
		
		FoodTest food1 = new FoodTest();
		food1.setFoodName("바나나");
		food1.setPrice(3000);
		repository.save(food1);
	
		FoodTest food2 = new FoodTest();
		food2.setFoodName("포도");
		food2.setPrice(5000);
		repository.save(food2);
		
		List<FoodTest>list = repository.findAll();
		Assertions.assertEquals(list.size(), 2);
	}

}
