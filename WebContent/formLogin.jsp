<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
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
			msgOut = "Login e/ou senha inválidos!";
		}
}%>
	
	<center>Para logar-se no sistema informe seu login e senha:</center><br /><br />
	<form name="form1" method="post" action="login.jsp">
		<table width="180" border="0" align="center" cellpadding="0" cellspacing="1">
		<tr>
			<td bgcolor="dfdfef" colspan="2"><font color="red"><%= msgOut %></font></td>
		</tr>
		<tr>
			<td width="55">Login:</td>
			<td width="122"><input name="login" type="text" id="login" value="${param.login }" ></td>
		</tr>
		<tr>
			<td height="18">Senha:</td>
			<td><input name="senha" type="password" id="senha" value="${param.senha }"></td>
		</tr>
		<tr>
			<td colspan="2"><div align="center">
				<input type="submit" name="Submit" value="Logar"></div>
			</td>
		</tr>
		</table>
	</form>
</body>
</html>