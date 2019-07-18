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
	<link rel="stylesheet" href="././css/socio.css">
    <title>Lista de Socios</title>
	<sx:head />
</head>
<body>
<div class="contenedor">
	   
      <header>
		<fieldset>
			<s:form id="form" action="listSocios" theme="simple" cssClass="yform">
				<legend>Buscadores</legend>
				<label>Nombre Socio: </label>
	   			<sj:autocompleter class="inputCss" list="%{listaNombres}" name="nombreB"/>
	   			
				<label>Apellido Socio: </label>
	   			<sj:autocompleter class="inputCss"  list="%{listaApellidos}" name="apellidoB"/>
				
				<label>DNI Socio: </label>
	   			<sj:autocompleter class="inputCss"  list="%{listaDNI}" name="dniB"/>
	   			
	   			<br><br>
	   			
	   			<s:submit value="Buscar"></s:submit>
				
	   			<br><br>
			</s:form>
		</fieldset>
      </header>
	<br><br>
   	<h2>Struts 2 pagination using display tag</h2>
   	
       <section class="boxMain">
		<div class="Pacientes">
			<div class="tituloPacientes"> Socios </div>
				<br><br>
				<s:a action="nuevoSocio"> <s:param name="idSocio" value="id"/>
					<button> Nuevo Socio</button>
				</s:a>
				<br><br>
				
		<div class="paciente">
			<div class="tablaPaciente">
				<display:table name="listaSociosDTO" pagesize="10" requestURI="/listSociosRefresh" uid="row">
				    <display:column property="numeroSocio" title="Nro de Socio" sortable="true"/>
					<display:column property="nombre" title="Nombre" sortable="true"/>
					<display:column property="apellido" title="Apellido" sortable="true"/>
					<display:column property="sexo" title="Sexo" sortable="true"/>
					<display:column property="estadoCivil" title="Estado Civil" sortable="true"/>
					<display:column property="nombreConyuge" title="Nombre Pareja" sortable="true"/>
					<display:column property="cantidadHijos" title="Cantidad de Hijos" sortable="true"/>
					<display:column property="dni" title="DNI" sortable="true"/>
					<display:column property="telefono" title="Telefono" sortable="true"/>
					<display:column property="direccion" title="Direccion" sortable="true"/>
					<display:column property="planDTO.descripcion" title="Plan" sortable="true"/>
					<display:column title="Aciones">
						<s:a action="deleteSocio"><s:param name="idSocio" value="%{#attr.row.id}"/> 
							<img class="accion" src="img/menos.PNG"/>
						</s:a>
						<s:a action="getSocio"><s:param name="idSocio" value="%{#attr.row.id}"/> 
							<img class="accion" src="img/modificar.PNG"/>
						</s:a>
						<s:a action="listarTurnosSocio"> <s:param name="idSocio" value="%{#attr.row.id}"/>
							<img class="accion" src="img/eye.JPG"/>
						</s:a>
					</display:column>
				</display:table>
			</div>
		</div>
	</section>
		
</body>
</html>