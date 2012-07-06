<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="services.*" %>
<%@ page import="services.DashBoardConta" %>
<%@ page import="modelo.Transacao" %>

<%
	//inicializa a vari�vel
	int idusuario = 0;
	
	//Estabelece canal de comunica��o com o Sistema 1 para acessar Usuario
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
	
	//Estabelece canal de comunica��o para acessar conta do Sistema 1 atrav�s do idusuario recebido anteriormente (n maneiras, podia ter feito direto)
	DashBoardContaDAOProxy proxy2 = new DashBoardContaDAOProxy();
	
	//DashBoardConta quem vai receber o objeto Conta vindo do Sistema 1
	DashBoardConta dashBoardConta = proxy2.buscarContaUsuario(idusuario);
	
	
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer�ncia entre contas</title>
	
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
<%  
	//Processamento da msg de erro ao tentar efetuar login
	String msg = request.getParameter("msg");
	String msgOut ="";
	if (msg!=null){
		if(msg.equals("1")){
			msgOut="Campos de login e senha devem ser preenchidos!";
		} else if (msg.equals("2")){
			msgOut = "Login e/ou senha inv�lidos!";
		}
}%>

<form action="transfere_saldo.jsp" method="post">
	<fieldset>
			<legend>Conta d�bito</legend>
			<div>
				<label for="contadebito">Valor dispon�vel:</label> <input type="text" id="contadebito" name="contadebito" value="<%= dashBoardConta.getSaldo() %>" readonly/>
			</div>
			
	</fieldset>
	<fieldset>
			<legend>Conta Cr�dito</legend>
			<div>
				<label for="contacredito">Conta cr�dito:</label> <input type="text" id="contacredito" name="contacredito" value="${param.numeroconta }" />
			</div>
			<div>
				<label for="contadebito">Valor da transfer�ncia:</label> <input type="text" id="valorcredito" name="valorcredito" value="${param.valorcredito }" />
			</div>
			<div>
				<font color="red"><%= msgOut %></font>
			</div>
			
	</fieldset>

	<div>
		<p align="right"><input type="reset" value="Limpar"/></p>
	</div>
	<br>
	<div>
		<p align="right"><input type="submit" value="Transferir >"/></p>
	</div>
</form>

</body>
</html>