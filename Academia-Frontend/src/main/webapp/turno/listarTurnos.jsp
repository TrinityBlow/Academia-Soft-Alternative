<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="././css/table.css">
    <title>Lista de Turnos</title>
	<sx:head />
</head>
<body>
<div class="contenedor">
      <header>
			<form action="buscar.html">
				<input id="buscar" type="search" value="Search">
			</form>
      </header>

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
					<display:table id="Paciente1" name="listaTurnosDTO" pagesize="2" requestURI="/listTurnosRefresh">
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
							<s:form action="searchNombreSocio" namespace="/" method="POST" >
					
<%-- 						<sx:autocompleter label="Turno por Nombre de Socio" list="listaTurnosNombre>" name="turnoElegido" />	 --%>
						
						<sx:autocompleter label="What's your lucky number?" name="turnoElegido" autoComplete="false" list="{'1','12','13','14','21','22','23','24','31','32','33','34','41','42','43','44'}" />
						
						<s:submit value="submit" name="buscar" />			
					</s:form>
</body>
</html>