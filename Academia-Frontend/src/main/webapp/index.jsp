<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Lista de Socios</title>
</head>
<body>

	<h2>Lista de Socios</h2>
	<br><br>
	<a href="./nuevo.jsp"><button>
	    Nuevo Socio
	</button></a>
	<br><br>
	   
	 <p> Todos</p>
	
<table>
  <tr style="background: #CCCCCC">
    <th>Numero Socio</th>
    <th>Nombre Y Apellido</th> 
    <th>Sexo</th>
    <th>Estado Civil</th>
    <th>Nombre Conyuge</th>
    <th>Cantidad de Hijos</th>
    <th>DNI</th>
    <th>Telefono</th>
    <th>Direccion</th>
    <th>Aciones</th>
  </tr>
	<s:iterator value="listaSociosDTO" status="socio">
	  <tr>
		<td> <s:property value="numeroSocio"/><br/>  </td> 
		<td> <s:property value="nombre"/><br/>  </td> 
		<td> <s:property value="sexo"/><br/>  </td> 
		<td> <s:property value="estadoCivil"/><br/>  </td> 
		<td> <s:property value="nombreConyuge"/><br/>  </td> 
		<td> <s:property value="cantidadHijos"/><br/>  </td> 
		<td> <s:property value="dni"/><br/>  </td> 
		<td> <s:property value="telefono"/><br/>  </td> 
		<td> <s:property value="direccion"/><br/>  </td> 
		<td> 
			<s:a action="./getSocio"> <s:param name="idSocio" value="id"/>
				<button> Modificar</button>
			</s:a>
			<s:a action="./deleteSocio"> <s:param name="idSocio" value="id"/>
				<button> Eliminar</button>
			</s:a>
		 </td> 
	  </tr>
	</s:iterator>
</table>
    
</body>
</html>