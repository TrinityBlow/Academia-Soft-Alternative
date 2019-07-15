
$(function() {
	
	$( "#practicaListener" ).change(function () {
		pruebaTest();
	});
	
	function pruebaTest(){
		  var value = $( "#practicaListener" ).val();
		  var dataObj = {"data": value};
		  var data = JSON.stringify(dataObj);

		if( value != -1){
			  $.ajax({
				  type: "POST",
				  data: data,
			      dataType: 'json',
			      contentType: 'application/json',
				  url: "ajax/getPrestadoresByPractica",
				  success : function (response)
		            	{
					  		$('#prestadoresListener')
								.find('option')
								.remove()
								.end()
								.append(optionsPrestadores(response))
								.val('whatever')
							;	 
					  		$('#horariosListener')
								.find('option')
								.remove()
								.end()
							;	
		            	}
				});
		} else{
	  		$('#prestadoresListener')
				.find('option')
				.remove()
				.end()
			;	 
	  		$('#horariosListener')
				.find('option')
				.remove()
				.end()
			;	
		}
	}

	function optionsPrestadores(response){
		var listResponse = JSON.parse(response);
		var options = '';
		var prestador;
		for(var i = 0; i < listResponse.length; i++) {
		    prestador = listResponse[i];
			options += '<option value="';
			options += prestador.id;
			options += '">';
			options += prestador.nombre;
			options += '</option><br>';
		}
		return options;
	}


	pruebaTest();
	
});







