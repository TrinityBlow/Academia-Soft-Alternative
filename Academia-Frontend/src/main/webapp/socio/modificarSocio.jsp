<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Modificar Socio</title>
 <link rel="stylesheet" type="text/css" href="./css/style-soc.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="./js/socio.js"></script> 
</head>

<body>
	<h2 id="titulo"> Modificar de Socio </h2>
	<s:form id="target" action="/updateSocio" namespace="/" name="target" method="post">
	    <s:radio label="Sexo" name="socioDTO.sexo" list="#{ 'Masculino': 'masculino', 'Femenino': 'femenino'}" required="required"/>
	    <s:select label="Estado Civil:" name="socioDTO.estadoCivil" list="#{ 'Soltero': 'soltero', 'Casado': 'casado'}" onchange="formularioCambiar()" required="required"/>
	    <div id="casados" >
		    <s:textfield label="Nombre y Apellido de Paraje:" type="text" name="socioDTO.nombreConyuge" required="required"/>
		    <s:textfield label="Cantidad Hijos:" type="number" name="socioDTO.cantidadHijos" required="required"/>
	    </div>
	    <s:textfield label="Email" type="email" name="socioServiceDTO.email" required="required"/>
	    <s:textfield label="Telefono:" type="number" name="socioDTO.telefono" required="required"/>
	    <s:textfield label="Direccion:" type="text" name="socioDTO.direccion" required="required"/>
  		<s:select label="Planes:" 
			list="listaPlanesDTO" listKey="id" listValue="descripcion"
        	name="socioDTO.planDTO.id" key="name">
        </s:select>
	    <br><br>
	    <s:submit label="Registrar Socio"></s:submit>
	</s:form> 
	<a href="./listSocios"><button> Volver </button></a>
</body>
</html>