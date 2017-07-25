package com.sopra.pox3.javee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnexionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String prompt = "Veuillez indiquer votre nom et prénom";
		Outils.vuLogNewUser(null, null, prompt, req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String nom = req.getParameter(Constantes.NOM_PARAMETRE_NOM);
		String prenom = req.getParameter(Constantes.NOM_PARAMETRE_PRENOM);

		

		if (nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty()) {

			String prompt = "Vous ne m'avez pas donné votre nom, votre prénom, ou les deux. </br> Veuillez recommmencer";
			if (nom == null)
				nom = "";
			if (prenom == null)
				prenom = "";

			Outils.vuLogNewUser(nom, prenom, prompt, req, resp);

		} else {
			User newUser = new User(nom, prenom);
			Outils.setConnectedUser(newUser, req);
			Outils.vuNewUser(newUser, req, resp);
		}

	}

}
