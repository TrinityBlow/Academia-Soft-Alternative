<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="././css/table.css">
            <title>Lista de Prestadores</title>
</head>
<body>
<div class="contenedor">
    <section class="boxMain">
        <div class="Pacientes">
           <div class="tituloPacientes"> Prestadores </div>
			<br><br>
			<a href="./nuevoPrestador"><button>
			    Nuevo Prestador
			</button></a>
			<br><br>
		<div class="paciente">
		    <div class="tablaPaciente">			
				<table>
				  <tr class="titulosPaciente">
				    <th>Nombre</th>
				    <th>Apellido</th> 
				    <th>Email</th>
				    <th>Telefono</th>
				    <th>Nro practica</th>
				    <th>Franja Horaria</th>
				  </tr>
					<s:iterator value="listaPrestadoresDTO" status="prestador">
					  <tr>
						<td> <s:property value="nombre"/><br/>  </td> 
						<td> <s:property value="apellido"/><br/>  </td> 
						<td> <s:property value="email"/><br/>  </td> 
						<td> <s:property value="telefono"/><br/>  </td> 
						<td> <s:property value="codigosPracticas"/><br/>  </td>
						<td> <s:property value="horas"/><br/>  </td> 
						<td> 
							<s:a action="./deletePrestador"><s:param name="idPrestador" value="id"/> 
										<img class="accion" src="img/menos.PNG"/> 
							</s:a>
							<s:a action="./getPrestador"><s:param name="idPrestador" value="id"/> 
										<img class="accion" src="img/modificar.PNG"/>
							</s:a>
						 </td> 
					  </tr>
					</s:iterator>
				</table>
			</div>	
		</div>	
	   </div>
	   </section>	
	   	<div class="paginas" align="center">
				<table>
					<td><a href="">Pagina1</a></td>
					<td><a href="">Pagina2</a></td>
					<td><a href="">Pagina3</a></td>
				</table>
			</div>
		</div>
    
</body>
</html>