<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registracion de Prestador</title>
	<link rel="stylesheet" type="text/css" href="./css/style-soc.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="./js/prestador.js"></script> 
	<sx:head />
</head>
<body>
	<h2 id="titulo"> Registracion de Prestador </h2>
	<s:form id="target" action="/agregarPrestador" name="target" method="post">
	    <s:textfield label="Nro prestador" type="number" name="prestadorDTO.numeroPrestador" ></s:textfield>
		<sx:autocompleter size="1" list="countries" name="country"></sx:autocompleter>
	    <s:textfield label="Nombre:" type="text" name="prestadorDTO.nombre" ></s:textfield>
	    <s:textfield label="Apellido:" type="text" name="prestadorDTO.apellido" ></s:textfield>
	    <s:textfield label="Email:" type="text" name="prestadorDTO.email" ></s:textfield>
	    <s:textfield label="Telefono:" type="number" name="prestadorDTO.telefono" ></s:textfield>    
	    <div id="practicas" >
	         <s:checkboxlist label="Practicas" list="practicas" name="practicasElegidas"  /><br>
	    </div>
	    <div id="horarios" >
	         <s:checkboxlist label="Horarios" list="horarios" name="horariosElegidos" value="id" />
	    </div>
	    
	    <br><br>
	    <s:submit label="Registrar Prestador"></s:submit>
	</s:form> 
	<a href="./listPrestadores"><button> Volver </button></a>
</body>
</html>