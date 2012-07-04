<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="services.*" %>
<%@ page import="services.DashBoardConta" %>
<%@ page import="modelo.Transacao" %>

<%
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
	
	//Estabelece canal de comunicação para acessar conta do Sistema 1 através do idusuario recebido anteriormente (n maneiras, podia ter feito direto)
	DashBoardContaDAOProxy proxy2 = new DashBoardContaDAOProxy();
	
	//DashBoardConta quem vai receber o objeto Conta vindo do Sistema 1
	DashBoardConta dashBoardConta = proxy2.buscarContaUsuario(idusuario);
	
	
	
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
	<title>Consulta de Saldo</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<meta name="author" content="Assemblesoft">
	<meta name="keywords" content="">
	<meta name="description" content="">
	<link rel="stylesheet" type="text/css" href="css/screen.css">
	<link rel="stylesheet" type="text/css" href="css/dropdown.css">

	<script type="text/javascript" src="js/helpers.js"></script>
	<script type="text/javascript" src="js/date.js"></script>
	<script type="text/javascript" src="js/form.js"></script>
</head>
<body>

	<h2></h2>
			
	<br>
	<form>
	<fieldset>
		<legend>Consulta de Saldo</legend>
			<div>
				<label for="disponivel">Disponível:</label> <input type="text" id="disponivel" name="disponivel" value="<%= dashBoardConta.getSaldo() %>" readonly/>
		</div>
			<div>
				<label for="Limite">Limite:</label> <input type="text" id="limite" name="limite" value="<%= dashBoardConta.getLimite() %>" readonly/>
		</div>
	</fieldset>
		
	</form>
</body>
</html>




