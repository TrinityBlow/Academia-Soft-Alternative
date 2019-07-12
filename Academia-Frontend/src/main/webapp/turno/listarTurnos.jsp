<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Lista de Turnos</title>
</head>
<body>

	<h2>Lista de Turnos</h2>
	<br><br>
	<a href="./nuevoTurno.jsp"><button>
	    Nuevo Turno
	</button></a>
	<br><br>
	   
	 <p> Todos</p>
	
<table>
  <tr style="background: #CCCCCC">
    <th>Numero Turno</th>
    <th>Especialidad</th>
    <th>Fecha</th> 
    <th>Prestacion</th>
    <th>Importe</th>
    <th>Observaciones</th>
  </tr>
	<s:iterator value="listaTurnosDTO" status="turno">
	  <tr>
		<td> <s:property value="numeroTurno"/><br/>  </td> 
		<td> <s:property value="especialidad"/><br/>  </td> 
		<td> <s:property value="fecha"/><br/>  </td> 
		<td> <s:property value="prestacion"/><br/>  </td> 
		<td> <s:property value="importe"/><br/>  </td> 
		<td> <s:property value="observaciones"/><br/>  </td>
		<td> 
			<s:a action="./getTurno"> <s:param name="idTurno" value="id"/>
				<button> Modificar</button>
			</s:a>
			<s:a action="./deleteTurno"> <s:param name="idTurno" value="id"/>
				<button> Eliminar</button>
			</s:a>
		 </td> 
	  </tr>
	</s:iterator>
</table>
    
</body>
</html>