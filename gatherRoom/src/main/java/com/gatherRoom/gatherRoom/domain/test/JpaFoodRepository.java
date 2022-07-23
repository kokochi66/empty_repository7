package com.gatherRoom.gatherRoom.domain.test;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
public class JpaFoodRepository implements FoodRepository{
	
	private final EntityManager em;
	// 마찬가지로 JpaFoodRep 는 EntitiyMamger와 의존관계이기 때문에 생성자로 주입해준다.
	public JpaFoodRepository(EntityManager em) {
		this.em = em;
	}
	
	@Override
	// pk기반인 save나 findById 는 Jpql 을 작성할 필요가 없다.
	public FoodTest save(FoodTest food) {
		em.persist(food);
		return food; 
	}

	@Override
	public Optional<FoodTest> findById(Long foodId) {
		FoodTest food = em.find(FoodTest.class, foodId);
		return Optional.ofNullable(food);
	}

	@Override
	public Optional<FoodTest> findByName(String foodName) {
		// Jpql이라는 객체지향 쿼리를 써야 한다. 객체 자체를 select 한다. 
		List<FoodTest> result = em.createQuery("select food from FoodTest as food where food.name = :foodName", FoodTest.class)
		.setParameter("foodName", foodName)
		.getResultList();
		return result.stream().findAny();
	}

	@Override
	public List<FoodTest> findAll() {
		List<FoodTest> result = em.createQuery("select food from FoodTest as food", FoodTest.class).getResultList();
		return result;
	}

	
}
