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
	<script src="./js/turnoHorario.js"></script> 
	<script src="./js/turnoPractica.js"></script> 
	<sx:head />
</head>
<body>
	<h2 id="titulo"> Registracion de Turno </h2>
		<s:form id="target" action="/agregarTurno" name="target" method="post">
		
	    <s:select label="Socio:" list="listaSociosDTO" name="turnoServiceDTO.socioId"  listKey="id" required="required" ></s:select>
	    
	    <s:textfield id="asd" label="Importe:" type="number" step=".01" name="turnoServiceDTO.importe" required="required" ></s:textfield>
	    
	    <s:textfield label="Observaciones:" type="text" name="turnoServiceDTO.observaciones" required="required" ></s:textfield>
	    
	    <s:select id="practicaListener" headerKey="-1" headerValue="Elegir Practica" label="Practica:" name="turnoServiceDTO.practicaId" list="listaPracticasDTO" listKey="id" required="required" ></s:select>

	    <s:select id="prestadoresListener" label="Prestador:" name="turnoServiceDTO.prestadorId" list="#{}" required="required"></s:select>
	  
        <s:textfield label="Fecha:" type="date" name="turnoServiceDTO.fecha" required="required"></s:textfield>
        
	    <s:select id="horariosListener" label="Horario:" name="turnoServiceDTO.horarioId" list="#{}" required="required" ></s:select>
	    
	    <br><br>
	    <s:submit label="Registrar Turno"></s:submit>
	</s:form> 
	<a href="./listTurnos"><button> Volver </button></a>
</body>
</html>