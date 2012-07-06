<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="services.*" %>
<%@ page import="services.DashBoardConta" %>
<%@ page import="modelo.Transacao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String pagina ="";//pagina que sera redirecionada depois de logado
	String contacredito = request.getParameter("contadebito"); 
	String valorcredito= request.getParameter("valorcredito"); 
	//inicializa a variável
		int idusuario = 0;
		
		//Estabelece canal de comunicação com o Sistema 1 para acessar Usuario
		DashBoardUsuarioDAOProxy proxy1 = new DashBoardUsuarioDAOProxy();
		
		DashBoardUsuario u = new DashBoardUsuario("valeria", "123");
		System.out.println("nomeusuario = "+u.getNomeUsuario());
		System.out.println("senhausuario = "+u.getSenhaUsuario());

		try {
			idusuario = proxy1.buscarUsuario(u);
			System.out.println("Id do usuario = "+idusuario);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//registrar id na session !!!!!!!!!!!!!!!!!!!!!!
		
		//Busca a conta debito
		//Estabelece canal de comunicação para acessar conta do Sistema 1 através do idusuario recebido anteriormente (n maneiras, podia ter feito direto)
		DashBoardContaDAOProxy proxy2 = new DashBoardContaDAOProxy();
	
		//DashBoardConta quem vai receber o objeto Conta vindo do Sistema 1
		DashBoardConta dashBoardConta = proxy2.buscarContaUsuario(idusuario);
		//chamar função da webservice conta em S1
	
	UserDAO dao = new UserDAO();
	//Verifica se as entradas estão vazias
	if ((login == "")||(senha == "")){
		pagina= "index.jsp";
		String erro="1";
		%>
		<jsp:forward page= "<%= pagina %>">
			<jsp:param name="msg" value="<%= erro %>"/>
		</jsp:forward>
	<%} else {
		User u = new User(login, senha);
		//login e senha verificados estão corretos
		boolean achou = dao.verificarUsuario(u);
		if(achou==true){
			pagina= "home.jsp";			
			//registra a sessão
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
			//redireciona para página inicial mostrando qual foi o erro
			%>
			<jsp:forward page= "<%= pagina %>">
				<jsp:param name="msg" value="<%= erro %>"/>
			</jsp:forward>	
		<%}
	}
	

%>
</body>
</html>