package com.sopra.pox3.javee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User existingUser = Outils.getConnectedUser(req);

		if (existingUser == null){
			
			Outils.vuWelcomeNotConnected(req, resp);
		}else{
			Outils.vuWelcomeConnected(existingUser, req, resp);

		}

	}
	
}
