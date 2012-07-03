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

</head>
<body>

	<h2></h2>
	
		<p>Consulta de saldo</p>

			
	<br>
	

		<table border="1" width="">
		<tr>
			<th>
				Disponível (+)
			</th>
			<th>
				Limite (-)
			</th>
			
		</tr>
		<tr>
			<td>
				<%= dashBoardConta.getSaldo() %>
			</td>
			<td>
				<%= dashBoardConta.getLimite() %>
			</td>
			
		</tr>
		</table>
		
	
</body>
</html>




