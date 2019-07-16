<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="././css/table.css">
    <title>Lista de Turnos</title>
	<script src="./js/autocompleter.js"></script> 
	<sj:head jqueryui="true"/>
</head>
<body>
<div class="contenedor">
      <header>
			<form action="buscar.html">
				<input id="buscar" type="search" value="Search">
			</form>
      </header>
	<s:form id="form" action="echo" theme="simple" cssClass="yform">
		<fieldset>
			<legend>Select Box as Autocompleter</legend>
			<div class="type-select">
				<label for="echo">Echo: </label>
				<sj:autocompleter
						id="customers"
						name="echo"
						list="%{listaTurnosDTO}"
						listValue="nombre"
						listKey="id"
						selectBox="true"
						selectBoxIcon="true"
						onChangeTopics="autocompleteChange"
						onFocusTopics="autocompleteFocus"
						onSelectTopics="autocompleteSelect"
						/>
			</div>
			<br><br>
   			<sj:autocompleter id="languages" list="%{languages}"/>
   			<br><br>
   			<sj:autocompleter id="listaTurnosDTO" list="%{id}"/>
   			<br><br>
   			<sj:autocompleter id="listaTurnosDTO" list="%{listaTurnosDTO.id}"/>
		</fieldset>
	</s:form>
	<br><br>
        <section class="boxMain">

			<div class="Pacientes">
				<div class="tituloPacientes"> Turnos </div>
					<br><br>
					<s:a action="nuevoTurno"> <s:param name="idTurno" value="id"/>
						<button> Nuevo Turno</button>
					</s:a>
					<br><br>
				<div class="paciente">
					<div class="tablaPaciente">
						<table id="Paciente1">
							<tr class="titulosPaciente">
							    <th>Numero Turno</th>
							    <th>Importe Del Turno</th>
							    <th>Fecha</th> 
							    <th>Hora Inicio</th>
							    <th>Hora Fin</th>
							    <th>Observaciones</th>
							    <th>Practica Codigo</th>
							    <th>DNI Socio</th>
							    <th>Nombre Socio</th>
							    <th>Apellido Socio</th>
							    <th>Email Socio</th>
							    <th>Nombre Prestador</th>
							    <th>Apellido Prestador</th>
							    <th>Opciones</th>
							</tr>
							<s:iterator value="listaTurnosDTO" status="turno">
							  <tr>
								<td> <s:property value="id"/><br/>  </td> 
								<td> <s:property value="importeDelTurno"/><br/>  </td> 
								<td> <s:property value="reservaDTO.fecha"/><br/>  </td> 
								<td> <s:property value="reservaDTO.horarioDTO.horaInicio"/><br/>  </td> 
								<td> <s:property value="reservaDTO.horarioDTO.horaFin"/><br/>  </td> 
								<td> <s:property value="observaciones"/><br/>  </td> 
								<td> <s:property value="practicaDTO.codigo"/><br/>  </td> 
								<td> <s:property value="socioDTO.dni"/><br/>  </td> 
								<td> <s:property value="socioDTO.nombre"/><br/>  </td> 
								<td> <s:property value="socioDTO.apellido"/><br/>  </td> 
								<td> <s:property value="socioDTO.email"/><br/>  </td> 
								<td> <s:property value="prestadorDTO.nombre"/><br/>  </td> 
								<td> <s:property value="prestadorDTO.apellido"/><br/>  </td> 
								<td> 
									<s:a action="deleteTurno"> <s:param name="idTurno" value="id"/>
										<button> Eliminar</button>
									</s:a>
								 </td> 
							  </tr>
							</s:iterator>
						</table>
					</div>
					<div class="accionesPaciente">
						<div><a action="./deleteSocio"><img class="accion" src="menos.png"></img></a></div>
					</div>
				</div>
			</div>
			</section>
			<div class="paginas" align="center">
				<table>
					<td><a href="listarSocios.html">Pagina1</a></td>
					<td><a href="listaSocios.html">Pagina2</a></td>
					<td><a href="listaSocios.html">Pagina3</a></td>
				</table>
			</div>
		</div>
	   
	   
	   	<h2>Struts 2 pagination using display tag</h2>
	   	
        <section class="boxMain">
			<div class="Pacientes">
				<div class="tituloPacientes"> Turnos </div>
					<br><br>
					<s:a action="nuevoTurno"> <s:param name="idTurno" value="id"/>
						<button> Nuevo Turno</button>
					</s:a>
					<br><br>

					
					<br>
			<div class="paciente">
				<div class="tablaPaciente">
					<display:table id="Paciente1" name="listaTurnosDTO" uid="row" pagesize="2" requestURI="/listTurnosRefresh" sort="list">
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
			           	<display:column title="Opciones">
						<s:a action="deleteTurno"> <s:param name="idTurno" value="%{#attr.row.id}"/>
										<button> Eliminar</button>
						</s:a>
       					</display:column>
					</display:table>
				</div>
			</div>
		</section>
		

			
</body>
</html>