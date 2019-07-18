<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registracion de Socio</title>
	<link rel="stylesheet" type="text/css" href="./css/style-soc.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="./js/socio.js"></script> 
	<sx:head />
</head>
<body>
	<h2 id="titulo"> Registracion de Socio </h2>
	<s:form id="target" action="agregarSocio" namespace="/" name="target" method="post">
	    <s:textfield label="Nro socio" type="number" name="socioServiceDTO.numeroSocio" required="required"/>
	    <s:textfield label="Nombre:" type="text" name="socioServiceDTO.nombre" required="required"/>
	    <s:textfield label="Apellidos:" type="text" name="socioServiceDTO.apellido" required="required"/>
	    <s:radio label="Sexo" name="socioServiceDTO.sexo" list="#{ 'Masculino': 'masculino', 'Femenino': 'femenino'}" required="required"/>
	    <s:select id="civil" label="Estado Civil:" name="socioServiceDTO.estadoCivil" list="#{ 'Soltero/a': 'soltero', 'Casado/a': 'casado'}" onchange="formularioCambiar()" required="required"/>
	    <div id="casados" onLoad="noMostrar()">
		    <s:textfield label="Nombre y Apellido de Pareja:" type="text" name="socioServiceDTO.nombreConyuge" required="required"/>
		    <s:textfield label="Cantidad Hijos:" type="number" name="socioServiceDTO.cantidadHijos" required="required"/>
	    </div>
	    <s:textfield label="DNI:" type="number" name="socioServiceDTO.dni" required="required"/>
	    <s:textfield label="Telefono:" type="number" name="socioServiceDTO.telefono" required="required"/>
	    <s:textfield label="Direccion:" type="text" name="socioServiceDTO.direccion" required="required"/>

	    <s:password label="Clave:" type="password" name="socioServiceDTO.password" required="required"/>
	    <s:textfield label="Email" type="email" name="socioServiceDTO.email" required="required"/>
		<s:select label="Planes:" 
			list="listaPlanesDTO" listKey="id" listValue="descripcion"
        	name="socioServiceDTO.planDTO" 
        />
	  <br><br>
	    <s:submit label="Registrar Socio"/>
	</s:form> 
	<a href="./listSocios"><button> Volver </button></a>
</body>
</html>