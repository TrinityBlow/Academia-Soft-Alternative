<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Lista de Socios</title>
	
	<link rel="stylesheet" href="socio/listarSocios.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  </head>
  <body>
    <div class="contenedor">
    <br><br>
	<a href="./nuevo.jsp">
		<button>
	    	Nuevo Socio
		</button>
	</a>
	<br><br>
    <header>
		<form action="buscar.html">
			<input id="buscar" type="search" value="Search">
		</form>
    </header>

    	<section class="boxMain">

			<div class="Pacientes">
				<div class="tituloPacientes"> Pacientes </div>
				<div class="paciente">
					<div class="tablaPaciente">
						<table>
							<tr class="titulosPaciente">
							    <td>Numero Socio</td>
							    <td>Nombre</td>
								<td>Apellido</td>
							    <td>Sexo</td>
							    <td>Estado Civil</td>
							    <td>Nombre Conyuge</td>
							    <td>Cantidad de Hijos</td>
							    <td>DNI</td>
							    <td>Telefono</td>
							    <td>Direccion</td>
							    <td>Plan</td>
							    <td>acciones</td>
							  </tr>
							<s:iterator value="listaSociosDTO" status="socio">
							  <tr>
								<td> <s:property value="numeroSocio"/><br/>  </td> 
								<td> <s:property value="nombre"/><br/>  </td> 
								<td> <s:property value="apellido"/><br/>  </td> 
								<td> <s:property value="sexo"/><br/>  </td> 
								<td> <s:property value="estadoCivil"/><br/>  </td> 
								<td> <s:property value="nombreConyuge"/><br/>  </td> 
								<td> <s:property value="cantidadHijos"/><br/>  </td> 
								<td> <s:property value="dni"/><br/>  </td> 
								<td> <s:property value="telefono"/><br/>  </td> 
								<td> <s:property value="direccion"/><br/>  </td> 
								<td> <s:property value="planDTO.getDescripcion()"/><br/>  </td> 
								<td>
									<div class="accionesPaciente">
										<div>
											<s:a action="./deleteSocio"><s:param name="idSocio" value="id"/> 
												<img class="accion" src="menos.png">eliminar</img> 
											</s:a>
										</div>
										<div>
											<s:a action="./getSocio"><s:param name="idSocio" value="id"/> 
												<img class="accion" src="modificar.png">modificar</img> 
											</s:a>
										</div>
									</div>
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
					<td><a href="listarSocios.html">Pagina1</a></td>
					<td><a href="listaSocios.html">Pagina2</a></td>
					<td><a href="listaSocios.html">Pagina3</a></td>
				</table>
			</div>
		</div>
	</body>
</html>