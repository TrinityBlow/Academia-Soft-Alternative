function formularioCambiar(){
    var casados = document.getElementById("casados");
    var civil = document.getElementById("civil");
    if (civil.value === "casado") {
        casados.style.display = "block";
    } else {
        casados.style.display = "none";
    }
}
