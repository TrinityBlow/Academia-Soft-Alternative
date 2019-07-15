
$(function() {

	$( "#prestadoresListener" ).change(function () {
		  var dataObj = {"data": $( "#prestadoresListener" ).val()};
		  var data = JSON.stringify(dataObj);
		  $.ajax({
			  type: "POST",
			  data: data,
		      dataType: 'json',
		      contentType: 'application/json',
			  url: "ajax/getHorarioByPrestador",
			  success : function (response)
	            	{
				  		$('#horariosListener')
							.find('option')
							.remove()
							.end()
							.append(optionsHorario(response))
							.val('whatever')
						;	
	            	}
			});
	});


	function optionsHorario(response){
		var listResponse = JSON.parse(response);
		var options = '';
		var horario;
		for(var i = 0; i < listResponse.length; i++) {
			horario = listResponse[i];
			options += '<option value="';
			options += horario.id;
			options += '">';
			options += (horario.horaInicio + ' a '+ horario.horarioFin);
			options += '</option><br>';
		}
		return options;
	}
});







