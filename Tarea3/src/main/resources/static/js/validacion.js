/*windows.onload = validate;

function validate(){
	if(document.getElementById('nombre').value.length < 5) {
		alert('El campo debe tener al menos 5 carácteres.');
		e.preventDefault();
	}
	else{
		document.getElementById('form').submit();
		
	}
	
	
}
	*/

var formulario = document.forms["formulario"];

window.onload = iniciar;

function iniciar(){
	document.getElementById("btn").addEventListener('click', validar,false);
	
}

function validaNombre(){
	var elemento = document.getElementById("nombre")
	if(elemento.value == 0){
		alert(" El campo no puede ser vacion");
		return false;
	}else{
		return true;
	}
}

function validar(e){
	if(validaNombre() && confirm("Hola")){
		
		return true;
	}else{
		return false;
		e.preventDefault();
	}
}

