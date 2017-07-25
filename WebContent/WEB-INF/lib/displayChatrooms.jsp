<%@page import="com.sopra.pox3.javee.Constantes"%>
<%@page import="com.sopra.pox3.javee.ChatRoom"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Voici la liste des chatrooms disponibles :

	<%
	List<ChatRoom> roomlist = (List<ChatRoom>) request.getAttribute("roomlist");

	for (int i = 0; i < roomlist.size(); i++) {
		String currentName = roomlist.get(i).getRoomName();
		System.out.print("Pour accéder à la chatroom ");
		System.out.print(currentName+" ");
		%>
		<a href='room.html?no=<%=i%>'>cliquez ici</a>
		
		<%
	}
%>
	Voulez-vous créer une nouvelle chatroom ?</br>
	
	<form action='room.html' method='post'>	 
	
	Si oui, entrez le nom de la chatroom à créer : 
	<input type='text' name='<%=Constantes.NOM_PARAMETRE_NOMCHATROOM%>'/>
	</br>
	<button type='submit'>Créer</button>
	</form>
	
</body>
</html>