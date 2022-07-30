package com.gatherRoom.gatherRoom.socketTest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 소켓에서 주고 받을 데이터 객체
@Getter
@Setter
@ToString
public class GameInfo{
	
		private String locationX;
		private String locationY;
		private String user_name;
		private Long characterId;

}


