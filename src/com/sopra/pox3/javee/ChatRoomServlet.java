package com.sopra.pox3.javee;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/roomlist.html")
public class ChatRoomServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int indexChatroom = (int)  req.getAttribute("no");
		List<ChatRoom> chatrooms = Donnees.getChatRooms();
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// afficher la liste des messages sur cette chatroom
		
	}
		

}
