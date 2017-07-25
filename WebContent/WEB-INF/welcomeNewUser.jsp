<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChatRoomServer</title>
</head>
<body>

	Bonjour, ${user.nom} ${user.prenom}
	</br>
	<a href='index.html'>accueil</a>
	</br>
	
	</br>Pour accéder au chat, <a href='chat.html'>cliquez ici</a>

	Pour vous déconnecter immédiatement,
	<a href='deconnexion.html'>cliquez ici</a>


</body>
</html>