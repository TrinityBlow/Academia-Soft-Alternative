<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="././css/table.css">
	<link rel="stylesheet" href="././css/turno.css">
    <title>Lista de Turnos</title>
	<script src="./js/autocompleter.js"></script> 
	<sj:head jqueryui="true"/>
</head>
<body>
<div class="contenedor">
	   
	  	<h2>Struts 2 pagination using display tag</h2>
	  	
	      <section class="boxMain">
		<div class="Pacientes">
			<div class="tituloPacientes"> Turnos Del Socio </div>
				<br><br>
				
		<div class="paciente">
			<div class="tablaPaciente">
				<display:table id="Paciente1" name="listaDeTurnosSocio" uid="row" pagesize="10" requestURI="/listSociosTurnosRefresh" sort="list">
				    <display:column property="id" title="Numero Turno" sortable="true"/>
				    <display:column property="importeDelTurno" title="Importe Del Turno" sortable="true"/>
				    <display:column property="reservaDTO.fecha" title="Fecha" sortable="true"/>
				    <display:column property="reservaDTO.horarioDTO.horaInicio" title="Hora Inicio" sortable="true"/>
				    <display:column property="reservaDTO.horarioDTO.horaFin" title="Hora Fin" sortable="true"/>
				    <display:column property="observaciones" title="Observaciones" sortable="true"/>
				    <display:column property="practicaDTO.codigo" title="Practica Codigo" sortable="true"/>
				    <display:column property="socioDTO.dni" title="DNI Socio" sortable="true"/>
				    <display:column property="socioDTO.nombre" title="Nombre Socio" sortable="true"/>
				    <display:column property="socioDTO.apellido" title="Apellido Socio" sortable="true"/>
				    <display:column property="socioDTO.email" title="Email Socio" sortable="true"/>
				    <display:column property="prestadorDTO.nombre" title="Nombre Prestador" sortable="true"/>
				    <display:column property="prestadorDTO.apellido" title="Apellido Prestador" sortable="true"/>
				</display:table>
			</div>
		</div>
	</section>


			
</body>
</html>