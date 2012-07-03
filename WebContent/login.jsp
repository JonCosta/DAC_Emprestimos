<%@ page language="java" import="java.util.*"%>
<%@page import="exercicio1.modelo.User"%>
<%@page import="exercicio1.dao.UserDAO"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head> 
<body>
<% 
	String pagina ="";//pagina que sera redirecionada depois de logado
	String login= request.getParameter("login"); // Pega o Login vindo do formul�rio
	String senha= request.getParameter("senha"); //Pega a senha vinda do formul�rio
	UserDAO dao = new UserDAO();
	//Verifica se as entradas est�o vazias
	if ((login == "")||(senha == "")){
		pagina= "index.jsp";
		String erro="1";
		%>
		<jsp:forward page= "<%= pagina %>">
			<jsp:param name="msg" value="<%= erro %>"/>
		</jsp:forward>
	<%} else {
		User u = new User(login, senha);
		//login e senha verificados est�o corretos
		boolean achou = dao.verificarUsuario(u);
		if(achou==true){
			pagina= "home.jsp";			
			//registra a sess�o
			HttpSession nsession = request.getSession(true) ;
			nsession.setAttribute("nome", login) ;
			
			//registra o cookie do usuario logado e redireciona para home
			//if(username==null) username="";
			
			Date now = new Date();
			String timestamp = now.toString();
			Cookie cookie = new Cookie ("username",login);
			cookie.setMaxAge(30*60);
			response.addCookie(cookie);
			%>
				
			<jsp:forward page="<%= pagina %>"/>
<%		} else {
			pagina= "index.jsp";
			String erro="2";
			//redireciona para p�gina inicial mostrando qual foi o erro
			%>
			<jsp:forward page= "<%= pagina %>">
				<jsp:param name="msg" value="<%= erro %>"/>
			</jsp:forward>	
		<%}
	}
	

%>

</body>
</html>