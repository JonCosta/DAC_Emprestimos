<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%  
	//Processamento da msg de erro ao tentar efetuar login
	String msg = request.getParameter("msg");
	String msgOut ="";
	String msgOutSucesso1 ="";
	if (msg!=null){
		//Login do usuario
		if(msg.equals("1")){
			msgOut="Login e/ou senha inv�lidos!";
		//login administrador
		} else if (msg.equals("2")){
			msgOut = "Login e/ou senha inv�lidos!";
		} else {
			//session.getAtribute("login");
			msgOutSucesso1 = "Voc� efetuou login como "+session.getAttribute("login");
		}
}%>
<!DOCTYPE HTML>
<html>
<head>
<title>Banco TADS</title>
<meta name="description" content="website description">
<meta name="keywords" content="website keywords, website keywords">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" id="theme" href="css/style.css">
<!-- modernizr enables HTML5 elements and feature detects --><script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
<style type="text/css">
body,td,th {
	font-size: 0.8em;
	color: #CCCCCC;
}
</style>
</head>
<body>
  <div id="main">
    <header><div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.jsp">Banco<span class="logo_colour">TADS</span></a></h1>
          <h2>2012</h2>
        </div>
        
        
        <form method="post" action="login.jsp" id="search">
          <table>
          <tr align="center"><td colspan="4" >J� � cliente?! Acesse j� sua conta!</td></tr>
          <tr><td>
				<label>Login:</label></td>
				<td><input type="text" name="loginusuario" id="loginusuario" size="7"/></td>
				<td><label>Senha:</label><input type="password" name="senhausuario" id="senhausuario" size="7"/></td>
		  <td><input type="submit" value="Ok"></td>
          </tr>

          </table>
          <b> <font color="red"><%= msgOut %></font></b>
          <% 
        		String loginsessao = (String)session.getAttribute("login");
        		if (msgOutSucesso1 != null){
        			%><b><font color="#FFB90F"><%= msgOutSucesso1 %></font></b><a href="logoff.jsp">Sair</a><% 
        		}
        	
        %>
         
         
		
		</form>
		
      </div>
      <nav><ul class="sf-menu" id="nav">
<li class="current"><a href="index.jsp">Home</a></li>
          <li><a href="abreconta.jsp">Abrir Conta</a></li>
          <li><a href="#">Conta e Servi&ccedil;os</a><ul>
<li><a href="formSaldo.jsp">Saldo</a></li>
              <li>
<a href="formTransferencia.jsp">Transfer�ncias</a>
                
</li>

            </ul></li>
          <li><a href="listarEmprestimos.jsp">Empr&eacute;stimos</a></li>
          <li>
<a href="listarPagamentos.jsp">Pagamentos	</a>
            
</li>
          <li><a href="sobre.php">Sobre</a></li>
        </ul></nav></header><div id="site_content">
      <div id="sidebar_container">
        <div class="sidebar">
          <h3>�rea restrita</h3>
          <div class="sidebar_item">

             <jsp:include page="formEntrarAreaRestrita.jsp" flush="true"/> 
             
          </div>
          <div class="sidebar_base"></div>
        </div>
        <div class="sidebar">
          <h3>Sobre</h3>
          <div class="sidebar_item">
            <ul>
<li><a href="#">Institucional</a></li>
              <li><a href="#">Fale Conosco</a></li>
              <li><a href="#">Servi&ccedil;os adicionais</a></li>
            </ul>
</div>
          <div class="sidebar_base"></div>
        </div>
        
      </div>
      <div class="content">
        <h1>BEM VINDO AO BANCO TADS</h1>
        <div class="content_item">
          <p>O Banco TADS &eacute; um banco f&iacute;cticio apresentado &agrave; disciplna de   Desenvolvimento de Aplica&ccedil;&otilde;es Corporativas da Universidade Federal do   Paran&aacute; sob orienta&ccedil;&atilde;o do prof. Razer. Foi desenvolvido com base nos   conceitos de integra&ccedil;&atilde;o de sistemas que utilizam bancos de dados   diferentes e trocam informa&ccedil;&otilde;es entre si.</p>
          <p>Este sistema foi desenvolvido por Jonathan Costa e Val&eacute;ria Pedro.<strong></strong></p>
        </div>
      </div>
      <div class="content">
        <h1>Ferramentas utilizadas</h1>
        <div class="content_item">
          <p>This template has been tested in the following browsers:</p>
          <ul>
<li>HTML/CSS/JAVASCRIPT.</li>
            <li>Java Web.</li>
            <li>Web Services.</li>
            <li>Banco de dados MySQL.</li>
          </ul>
</div>
      </div>
    </div>
    <footer>
      <p><a href="index.jsp">Home</a> | <a href="examples.html">ABRIR CONTA</a> | <a href="page.html">CONTA E SERVI&Ccedil;OS</a> | <a href="another_page.html">EMPR&Eacute;STIMOS</a> | <a href="contact.php">PAGAMENTOS</a></p>
      <p>Copyright &copy; BANCO TADS | Jonathan costa/val&eacute;ria pedro</p>
    </footer>
</div>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script><script type="text/javascript" src="js/jquery.easing-sooper.js"></script><script type="text/javascript" src="js/jquery.sooperfish.js"></script><script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
    });
  </script>
</body>
</html>





