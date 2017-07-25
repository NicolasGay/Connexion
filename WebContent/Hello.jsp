<%@page import="com.sopra.pox3.javee.Outils"%>
<%@page import="com.sopra.pox3.javee.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/monInclude.jsp"></jsp:include>
	Bonjour, c'est le fichier "Hello" ! Au fait, un plus un égale
	<%=1 + 1%>

	<%
		String monParameter = request.getParameter("toto");
		out.print(monParameter);
	%>

	<%
	User user= Outils.getConnectedUser(request);
	if(user!=null){
	%>
	<div>
		Salut !
		<%=user.getNom() %>
		<%=user.getPrenom() %>
	</div>
	<%
	}
	%>

	<br /> Ton parametre c'est :
	<%=monParameter%>
</body>
</html>