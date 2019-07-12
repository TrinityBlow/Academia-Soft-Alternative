
$(function() {
	$( "#practicaListener" ).change(function () {
		  console.log(window.location.protocol + "//" + window.location.host + "/Academia-Frontend/ajax/getPrestadoresByPractica");
		  var dataObj = {"data": $( "#practicaListener" ).val()};
		  var data = JSON.stringify(dataObj);
		  console.log(dataObj);
		  console.log(data);
		  $.ajax({
			  type: "POST",
			  data: data,
		      dataType: 'json',
		      contentType: 'application/json',
			  url: window.location.protocol + "//" + window.location.host + "/Academia-Frontend/ajax/getPrestadoresByPractica",
			  success : function (response)
	            	{
				  		console.log(response);
	            	}
			});
	});
});




