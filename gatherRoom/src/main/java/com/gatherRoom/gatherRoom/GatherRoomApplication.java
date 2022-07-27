package com.gatherRoom.gatherRoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

@SpringBootApplication
public class GatherRoomApplication implements Serializable {

	private static final long serialVersionUID = -7840970274551630273L;

	public static void main(String[] args) {
		SpringApplication.run(GatherRoomApplication.class, args);
	}

}
