<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registracion de Turno</title>
	<link rel="stylesheet" type="text/css" href="./css/style-soc.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="./js/turno.js"></script> 
	<sx:head />
</head>
<body>
	<h2 id="titulo"> Registracion de Turno </h2>
		<s:form id="target" action="/agregarTurno" name="target" method="post">
	    <s:textfield id="asd" label="Importe:" type="number" name="turnoDTO.importe" ></s:textfield>
	    <s:textfield label="Observaciones:" type="text" name="turnoDTO.observaciones" ></s:textfield>
	    
	    <s:select id="practicaListener" label="Practica:" name="practicaSelect" list="listaPracticasDTO" listKey="id" ></s:select>
	    
<%-- 		<s:iterator id="practicaListener" value="listaPracticasDTO" status="practica"> --%>
		
<%-- 		</s:iterator> --%>

	    <s:select id="prestadoresListener" label="Prestador:" name="prestadorSelect" list="listaPrestadoresDTO" ></s:select>
	   
<%-- 		<sx:autocompleter size="1" list="practicas" name="practica"></sx:autocompleter> --%>

        <s:textfield label="Fecha:" type="date" name="turnoDTO.fecha" ></s:textfield>
        
	    <s:select id="horariosListener" label="Horario:" name="horarioSelect" list="listaHorariosDTO" ></s:select>
	    <br><br>
	    <s:submit label="Registrar Turno"></s:submit>
	</s:form> 
	<a href="./listTurnos"><button> Volver </button></a>
</body>
</html>