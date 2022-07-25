package com.gatherRoom.gatherRoom.domain.test;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "gr_food_test")
@Entity // JPA가 관리하는 Entity 구나~
public class FoodTest {
    @Id // PK야
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;
    private String foodName;
    private Integer price;
}
