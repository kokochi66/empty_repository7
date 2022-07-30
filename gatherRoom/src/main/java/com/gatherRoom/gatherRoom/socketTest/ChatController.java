package com.gatherRoom.gatherRoom.socketTest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/public")
	public ChatMessagePojo sendMessage(@Payload ChatMessagePojo chatMessagePojo) {

		return chatMessagePojo;
	}

	@MessageMapping("/chat.addUser")
	@SendTo("/topic/public")
	public ChatMessagePojo addUser(@Payload ChatMessagePojo chatMessagePojo, SimpMessageHeaderAccessor headerAccessor) {

		// Add username in web socket session
		headerAccessor.getSessionAttributes().put("username", chatMessagePojo.getSender());
		return chatMessagePojo;
	}
	
	@GetMapping("/chat")
	public String chatPage() {
		// retrun 하는 것은 무조건 String , html 파일을 보내주는 것이 아니다.
		return "chat";
	}

}
