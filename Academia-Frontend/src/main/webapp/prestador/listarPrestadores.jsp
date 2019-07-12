<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Lista de Prestadores</title>
</head>
<body>

	<h2>Lista de Prestadores</h2>
	<br><br>
	<a href="./nuevoPrestador.jsp"><button>
	    Nuevo Prestador
	</button></a>
	<br><br>
	   
	 <p> Todos</p>
	
<table>
  <tr style="background: #CCCCCC">
    <th>Numero Prestador</th>
    <th>Nombre</th>
    <th>Apellido</th> 
    <th>Email</th>
    <th>Telefono</th>
    <th>Nro practica</th>
    <th>Franja Horaria</th>
  </tr>
	<s:iterator value="listaPrestadoresDTO" status="prestador">
	  <tr>
		<td> <s:property value="numeroPrestador"/><br/>  </td> 
		<td> <s:property value="nombre"/><br/>  </td> 
		<td> <s:property value="apellido"/><br/>  </td> 
		<td> <s:property value="email"/><br/>  </td> 
		<td> <s:property value="telefono"/><br/>  </td> 
		<td> <s:property value="practica"/><br/>  </td>
		<td> <s:property value="franjaHoraria"/><br/>  </td> 
		<td> 
			<s:a action="./getPrestador"> <s:param name="idPrestador" value="id"/>
				<button> Modificar</button>
			</s:a>
			<s:a action="./deletePrestador"> <s:param name="idPrestador" value="id"/>
				<button> Eliminar</button>
			</s:a>
		 </td> 
	  </tr>
	</s:iterator>
</table>
    
</body>
</html>