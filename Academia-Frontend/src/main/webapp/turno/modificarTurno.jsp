<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Modificacion de Turno</title>
	<link rel="stylesheet" type="text/css" href="./css/style-soc.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="./js/turno.js"></script> 
	<sx:head />
</head>
<body>
	<h2 id="titulo"> Modificacion de Turno </h2>
	<s:form id="target" action="/updateTurno" name="target" method="post">
	    <s:textfield label="Nro Turno" type="number" name="turnoDTO.numeroTurno" ></s:textfield>
		<sx:autocompleter size="1" list="countries" name="country"></sx:autocompleter>
	    <s:textfield label="Especialidad:" type="text" name="turnoDTO.especialidad" ></s:textfield>
        <s:textfield label="Fecha:" type="date" name="turnoDTO.fecha" ></s:textfield>
	    <s:textfield label="Importe:" type="number" name="turnoDTO.importe" ></s:textfield>
	    <s:textfield label="Prestacion:" type="text" name="turnoDTO.prestacion" ></s:textfield>
	    <s:textfield label="Observaciones:" type="text" name="turnoDTO.observaciones" ></s:textfield>
	    <br><br>
	    <s:submit label="Modificar Turno"></s:submit>
	</s:form> 
	<a href="./listTurnos"><button> Volver </button></a>
</body>
</html>