class Prenda{
	var property categoria; // ej:parte superior
	var property tipo; // ej:camisa
	var property tela;
	var property colorPrimario;
	var property colorSecundario; //opcional
		
}

class Usuario{
	const guardaropas = [];
	

	method agregarPrenda(categoriaPrenda, tipoPrenda, telaPrenda , colorPrimarioPrenda){			
		var prenda =  new Prenda(categoria = categoriaPrenda, tipo = tipoPrenda, tela = telaPrenda, colorPrimario = colorPrimarioPrenda, colorSecundario = "");
		guardaropas.add(prenda);
	}
}

class TipoPrenda{
	//aca puedo tener objetos que sean las prendas o constantes
	
	const property remera = "remera";
	const property pantalon = "pantalon";
	const property zapatillas = "zapatillas";
}


//en el caso de la categoria la pense de 2 formas, una donde la prenda tiene una categoria y otra en dondel el TipoPrenda tiene una categoria

enum Categoria{
	parteSuperior,parteInferior,calzado,accesorio;
}

//para el color como un enum o con clase

enum Color{
	amarillo,azul,blanco,negro,rojo,azul;
}

class Color{
	const property amarillo = "amarillo";
	const property azul = "azul";
	const property blanco = "blanco";
	const property negro = "negro";
	const property rojo = "rojo";
	const property azul = "azul";
}
	
