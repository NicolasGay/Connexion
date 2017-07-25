package com.sopra.pox3.javee;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Outils {

	public static User getConnectedUser(HttpServletRequest req) {

		User connectedUser = (User) req.getSession().getAttribute(Constantes.CLE_SESSION_USER);
		return connectedUser;

	}
	

	public static void setConnectedUser(User newUser, HttpServletRequest req) {

		req.getSession().setAttribute(Constantes.CLE_SESSION_USER, newUser);

	}

	public static void vue(String jspName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/" + jspName + ".jsp").forward(req, resp);
	}

	public static void vuWelcomeConnected(User user, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("user", user);
		vue("welcomeConnected", req, resp);
	}

	public static void vuWelcomeNotConnected(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		vue("welcomeNotConnected", req, resp);
	}

	public static void vuNewUser(User user, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("user", user);
		vue("welcomeNewUser", req, resp);
	}

	public static void vuLogNewUser(String nom, String prenom, String prompt, HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("nom", nom); 
		req.setAttribute("prenom", prenom);
		req.setAttribute("message", prompt);

		vue("logNewUser", req, resp);
	}
	
	public static void vueFormulaireChatRoom(List<Message> messages, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("messages", messages);
		vue("formulaireChatRoom", req, resp);
		
	}
	
	public static void vueMessagesChatRoom(List<Message> messages, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("messages", messages);
		vue("messagesChatRoom", req, resp);
		
	}
	
	public static void displayChatrooms(List<ChatRoom> roomlist,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("roomlist", roomlist);
		vue("displayChatrooms", req, resp);
		
	}

}
