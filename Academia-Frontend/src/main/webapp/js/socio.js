function noMostrar(){
	$('#casados').hide("true");
}

function formularioCambiar(){
    var civil = document.getElementById("civil");
    if (civil.value === "casado") {
        $('#casados').show("true");
    } else {
        $('#casados').hide("true");
    }
}