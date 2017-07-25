package com.sopra.pox3.javee;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	
	private  String name;
	private   User user;
	public static List<Message> messages = new ArrayList<>();

	
	public String getRoomName() {
		return name;
	}

	public User getUser() {
		return user;
	}
	public static List<Message> getMessages() {
		return messages;
	}
	
	

}
