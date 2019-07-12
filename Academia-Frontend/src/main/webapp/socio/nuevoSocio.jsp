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
	<s:form id="target" action="/agregarSocio" name="target" method="post">
	    <s:textfield label="Nro socio" type="number" name="socioDTO.numeroSocio" ></s:textfield>
<%-- 	    <s:select label="Plan" name="socioDTO.plan.descripcion" list="#{ '2 221': '2 221', '2 222': '2 222'}"></s:select> --%>
		<sx:autocompleter size="1" list="countries" name="country"></sx:autocompleter>
	    <s:textfield label="Nombre:" type="text" name="socioDTO.nombre" ></s:textfield>
	    <s:textfield label="Apellidos:" type="text" name="socioDTO.apellido" ></s:textfield>
	    <s:radio label="Sexo" name="socioDTO.sexo" list="#{ 'Masculino': 'masculino', 'Femenino': 'femenino'}"></s:radio>
	    <s:select label="Estado Civil:" name="socioDTO.estadoCivil" list="#{ 'Soltero': 'soltero', 'Casado': 'casado'}" onchange="formularioCambiar()"></s:select>
	    <div id="casados" >
		    <s:textfield label="Nombre y Apellido de Paraje:" type="text" name="socioDTO.nombreConyuge" ></s:textfield>
		    <s:textfield label="Cantidad Hijos:" type="number" name="socioDTO.cantidadHijos" ></s:textfield>
	    </div>
	    <s:textfield label="DNI:" type="number" name="socioDTO.dni" ></s:textfield>
	    <s:textfield label="Telefono:" type="number" name="socioDTO.telefono" ></s:textfield>
	    <s:textfield label="Direccion:" type="text" name="socioDTO.direccion" ></s:textfield>
	    <br><br>
	    <s:submit label="Registrar Socio"></s:submit>
	</s:form> 
	<a href="./listSocios"><button> Volver </button></a>
</body>
</html>