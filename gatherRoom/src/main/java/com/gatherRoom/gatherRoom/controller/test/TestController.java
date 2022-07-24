package com.gatherRoom.gatherRoom.controller.test;

import com.gatherRoom.gatherRoom.domain.test.FoodTest;
import lombok.extern.log4j.Log4j2;
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

    @GetMapping("/page")
    public String testPage() {
        return "test";
    }

    @GetMapping("/food/read")
    @ResponseBody
    public List<FoodTest> getFoodList() {
        
        return foodService.findFoods();
    }

    @GetMapping("/food/insert/{foodName}/{price}")
    @ResponseBody
    public FoodTest insertFood(@PathVariable("foodName") String foodName,
                                      @PathVariable("price") Integer price) {
        return FoodTest.builder()
                .foodId(1L)
                .foodName(foodName)
                .price(price)
                .build();
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
        return foodService.findOne(foodId).get();
    }

    @GetMapping("/food/delete/{foodId}")
    @ResponseBody
    public FoodTest deleteFood(
            @PathVariable("foodId") Long foodId) {
        return foodService.delete(foodId);
    }
}
