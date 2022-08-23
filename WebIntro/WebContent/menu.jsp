<%@page import="java.util.LinkedList"%>
<%@page import="entities.Persona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="https://getbootstrap.com/favicon.ico">
	<title>MENU</title>
	
    <!-- Latest compiled and minified CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

	<!-- Latest compiled JavaScript -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <% 
    Persona p = new Persona();
    if(session.getAttribute("usuario") == null){
    	request.getRequestDispatcher("index.html").forward(request, response);
    } else{
	    p = (Persona)session.getAttribute("usuario");
    }
    %>
    
</head>
<body>

	<div class="container p-5 my-2 bg-primary text-white text-center jumbotron text-center">
		<h1 class="display-4">Bienvenido <span class="display-3"><%=p.getNombre()+" "+p.getApellido()%></span> </h1>
		<p>Lorem ipsum abder nasser</p>
	</div>
	<div class="container">
		<div class="col-md-3">
			<ul>
				<li><a href="usuarios.jsp">Administracion de Usuarios</a><br></li>
				<li><a href="altaUsuario.jsp">Creacion de Usuario</a><br></li>
			</ul>
		</div>
		<a href="cerrarsesion" class="btn btn-danger">Cerrar Sesion</a>
	</div>
			
	 
	
	 	
		
		

</body>
</html>