/* ***********************DOCUMENTACION***********************
- Programa: Practica 1
- Version: Martes 16 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion:  Clase principal en la que se hace una compra de
  ganado y al final regresa el total de ganado. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */


public class Principal {
	
	public static void main(String[] args) {
		
		Ganado ganCH = new Ganado();//creamos un nuevo objeto llamado ganCH de la clase Ganado

		Estado(ganCH);
		
		ganCH.namelocalidad = "Chiapas";
		Estado(ganCH);
		
		Compra(ganCH, 1, 100);
		Compra(ganCH, 2, 500);
		Compra(ganCH, 3, 50);
		Estado(ganCH);
		
		Compra(ganCH, 1, 10);
		Compra(ganCH, 2, 200);
		Compra(ganCH, 3, 10);
		Estado(ganCH);
		
		System.out.println("El total de ganado en Chiapas es de " + ganCH.total + ".");
	}
	
	//metodo-procedimiento para desplegar estado (localidad, numero de animales, total de animales)
	public static void Estado(Ganado ganCH) {
		
		System.out.println("Localidad: " + ganCH.namelocalidad);
		System.out.println("Numero de becerros: " + ganCH.no_becerros);
		System.out.println("Numero de lecheras: " + ganCH.no_lecheras);
		System.out.println("Numero de toros: " + ganCH.no_toros);
		System.out.println("Total de ganado: " + ganCH.total + "\n");
	}
	
	//metodo para comprar
	public static void Compra(Ganado ganCH, int animal, int cantidad) {
		//1> becerros
		//2> lecheras
		//3> toros
		
		switch(animal) {
			case 1:
				ganCH.no_becerros= ganCH.no_becerros + cantidad;
				break;
			case 2:
				ganCH.no_lecheras= ganCH.no_lecheras + cantidad;
				break;
			case 3:
				ganCH.no_toros= ganCH.no_toros + cantidad;
				break;
			default: 
				System.out.println("ERROR. Tipo de ganado invalido");
		}
		
		ganCH.total= ganCH.total + cantidad;
	}

	
}
