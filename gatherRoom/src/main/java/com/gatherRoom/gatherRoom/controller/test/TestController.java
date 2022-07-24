package com.gatherRoom.gatherRoom.controller.test;

import com.gatherRoom.gatherRoom.domain.test.FoodService;
import com.gatherRoom.gatherRoom.domain.test.FoodTest;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/test")
public class TestController {

	private final FoodService foodService;
	
	@Autowired
	public TestController (FoodService foodService) {
		this.foodService = foodService;
	}
	
    @GetMapping("/page")
    public String testPage() {
        return "test";
    }

    @GetMapping("/food/read")
    @ResponseBody
    public List<FoodTest> getFoodList() {
        List<FoodTest> foodTestList = new ArrayList<>();
        foodTestList.add(FoodTest.builder()
                .foodId(1L)
                .foodName("사과")
                .price(1000)
                .build());
        foodTestList.add(FoodTest.builder()
                .foodId(2L)
                .foodName("배")
                .price(1500)
                .build());
        foodTestList.add(FoodTest.builder()
                .foodId(3L)
                .foodName("포도")
                .price(10000)
                .build());
        foodTestList.add(FoodTest.builder()
                .foodId(4L)
                .foodName("토마토")
                .price(5000)
                .build());
        return foodTestList;
    }

    @GetMapping("/food/insert/{foodName}/{price}")
    @ResponseBody
    public FoodTest insertFood(@PathVariable("foodName") String foodName,
                                      @PathVariable("price") Integer price) {
    	FoodTest food = new FoodTest();
    	food.setFoodName(foodName);
    	food.setPrice(price);
    	log.info(food);
    	return foodService.insertFood(food);
    }

    @GetMapping("/food/update/{foodId}/{foodName}/{price}")
    @ResponseBody
    public FoodTest updateFood(
            @PathVariable("foodId") Long foodId,
            @PathVariable("foodName") String foodName,
            @PathVariable("price") Integer price) {
        return FoodTest.builder()
                .foodId(foodId)
                .foodName(foodName)
                .price(price)
                .build();
    }

    @GetMapping("/food/read/{foodId}")
    @ResponseBody
    public FoodTest readFood(
            @PathVariable("foodId") Long foodId) {
        return FoodTest.builder()
                .foodId(foodId)
                .foodName("사과")
                .price(1000)
                .build();
    }

    @GetMapping("/food/delete/{foodId}")
    @ResponseBody
    public FoodTest deleteFood(
            @PathVariable("foodId") Long foodId) {
        return FoodTest.builder()
                .foodId(foodId)
                .foodName("사과")
                .price(1000)
                .build();
    }
}
