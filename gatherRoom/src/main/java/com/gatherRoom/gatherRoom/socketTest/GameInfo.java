package com.gatherRoom.gatherRoom.socketTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 소켓에서 주고 받을 데이터 객체
@Getter
@Setter
public class GameInfo{
	
	 class LocationInfo {
		private String x;
		private String y;
	}
	
	 class CharacterInfo{
		private String user_name;
		private String charactor_id;
	}

}
