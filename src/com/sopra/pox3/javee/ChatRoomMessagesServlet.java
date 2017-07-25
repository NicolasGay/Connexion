package com.sopra.pox3.javee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chatRoomMessages.html")
public class ChatRoomMessagesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Message> messages = new ArrayList<>();
		// a changer
				
		Outils.vueMessagesChatRoom(messages, req, resp);

	}
	
	
	
}
