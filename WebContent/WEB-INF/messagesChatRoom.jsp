
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.sopra.pox3.javee.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>ChatRoomServer</title>

<style type="text/css">
#messageEnTete {
	color: grey;
	font-weight: bold;
}

#texte {
	position: absolute;
	display: flex;
	flex-flow: row wrap;
	flex: 1 0 auto;
	word-break: normal;
	overflow: none;
	width: 450px;
	height: auto;
	display: flex;
}
</style>

</head>
<body>


	<c:forEach var="currentMessage" items="${messages}">

		<div id="messageEnTete">
			</br> </br>
			${user.prenom } ${user.nom } a écrit (${currentMessage.date}) : 
			</br>
		</div>

		<div id="texte">
			${currentMessage.text }
			</br>
		</div>
	</c:forEach>






</body>
</html>