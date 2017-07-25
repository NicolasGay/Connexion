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

@WebServlet("/chat.html")
// et pas besoin d'écrire quoi que ce soit dans le web.xml ! ;)
public class ChatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int indexChatroom = (int)  req.getAttribute("no");
		List<Message> messages = Donnees.getChatRooms().get(indexChatroom).getMessages();
		Outils.vueFormulaireChatRoom(messages, req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String text = req.getParameter(Constantes.NOM_PARAMETRE_MESSAGE);
		Date date = new Date();
		User user = Outils.getConnectedUser(req);
		
		int indexChatroom =(int)  req.getAttribute("no");
		List<Message> messages = Donnees.getChatRooms().get(indexChatroom).getMessages();
		
		if(user==null){
			user=new User("Ano", "Nymous");
		}
		
		Message message = new Message(date, user, text);
		messages.add(message);


		Outils.vueFormulaireChatRoom(messages, req, resp);

	}

}
