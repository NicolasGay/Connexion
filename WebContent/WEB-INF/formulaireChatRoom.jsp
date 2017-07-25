<%@page import="com.sopra.pox3.javee.Constantes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sopra.pox3.javee.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ChatRoomServer</title>

<style type="text/css">

body{
display:flex;
flex-flow: column nowrap;
align-items:center;

}

#chat {
	display:flex; 
	flex-flow: column nowrap;
	justify-content:flex-end;
	width:500px; 
	height :800px;
	overflow-y: auto;
}
</style>

<iframe id="chat" src="chatRoomMessages.html">

	<meta http-equiv="refresh" content="5">

</iframe>

</head>
<body>

	<form action="" method="post">
		<input type="text" name="<%=Constantes.NOM_PARAMETRE_MESSAGE%>">
		<button type="submit">Envoyer</button>
	</form>
	
	</br></br>
	Pour vous déconnecter immédiatement,
	<a href='deconnexion.html'>cliquez ici</a>
	</br>
</body>
</html>