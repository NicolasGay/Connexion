<%@page import="com.sopra.pox3.javee.Constantes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChatRoomServer</title>
</head>
<body>
	
	${message }<form action='connexion.html' method='post'>	 
	</br>
	Nom : <input type='text' name='<%=Constantes.NOM_PARAMETRE_NOM%>' value='${nom }'/>
	</br>
	Prenom : <input type='text' name='<%=Constantes.NOM_PARAMETRE_PRENOM%>' value='${prenom }'/>
	</br>
	<button type='submit'>OK</button>
	</form>
	
</body>
</html>