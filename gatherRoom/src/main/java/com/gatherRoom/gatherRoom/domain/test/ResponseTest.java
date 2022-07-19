package com.gatherRoom.gatherRoom.domain.test;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTest {
    private String key;
    private String value;
    private int intValue;
    private float floatValue;
}
