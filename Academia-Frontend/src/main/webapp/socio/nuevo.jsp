<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
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
	<s:form action="agregarSocio" method="post" >
	    <s:textfield label="Nro socio" type="number" name="socioServiceDTO.numeroSocio" ></s:textfield>
	    <s:textfield label="Nombre:" type="text" name="socioServiceDTO.nombre" ></s:textfield>
	    <s:textfield label="Apellidos:" type="text" name="socioServiceDTO.apellido" ></s:textfield>
	    <s:radio label="Sexo" name="socioServiceDTO.sexo" list="#{ 'Masculino': 'masculino', 'Femenino': 'femenino'}"></s:radio>
	    <s:select label="Estado Civil:" name="socioServiceDTO.estadoCivil" list="#{ 'Soltero': 'soltero', 'Casado': 'casado'}" onchange="formularioCambiar()"></s:select>
	    <div id="casados" >
		    <s:textfield label="Nombre y Apellido de Paraje:" type="text" name="socioServiceDTO.nombreConyuge" ></s:textfield>
		    <s:textfield label="Cantidad Hijos:" type="number" name="socioServiceDTO.cantidadHijos" ></s:textfield>
	    </div>
	    <s:textfield label="DNI:" type="number" name="socioServiceDTO.dni" ></s:textfield>
	    <s:textfield label="Telefono:" type="number" name="socioServiceDTO.telefono" ></s:textfield>
	    <s:textfield label="Direccion:" type="text" name="socioServiceDTO.direccion" ></s:textfield>
<%-- 		<s:select  label="Planes:" headerKey="-1" headerValue="Select Plan" list="listaPlanesDTO" name="planDTO" ></s:select> --%>

<%-- 		<s:select label="Planes"  --%>
<%-- 			list="listaPlanesDTO"  --%>
<%-- 			name="planDTO"  --%>
<%-- 			/> --%>
			
	    <br><br>
	    <s:submit label="Registrar Socio"></s:submit>
	</s:form> 
	<a href="./listSocios"><button> Volver </button></a>
</body>
</html>