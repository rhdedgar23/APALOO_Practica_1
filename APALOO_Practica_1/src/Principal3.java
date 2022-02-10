/* ***********************DOCUMENTACION***********************
- Programa: Practica 1
- Version: Martes 16 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion:  Clase Principal3 en la que se implementa un menu
  de donde se puede comprar ganado y desplegar informacion del 
  ganada en cierta entidad (Chiapas, Sinaloa).  
- Datos de entrada: Tipo de animal a comprar y numero de animales
  a comprar.
- Datos de salida: Menu, mensajes de notificacion (de compra, por
  ejemplo), total de ganado.
**************************DOCUMENTACION*********************** */

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		//instanciamos dos veces la clase Ganado mediante la creacion de los objetos ganCH y ganSin
		Ganado ganCH= new Ganado();
		Ganado ganSin= new Ganado("Sinaloa", 300, 550, 100);
		
		DesplegarMenu();
		MenuSelect(ganCH, ganSin);
	}
	
	public static void DesplegarMenu() {
		System.out.println("1> Comprar ganado en Chiapas");
		System.out.println("2> Comprar ganado en Sinaloa");
		System.out.println("3> Desplegar informacion del ganado en Chiapas");//estado de ganCH
		System.out.println("4> Desplegar informacion del ganado en Sinaloa");//estado de ganSin
		System.out.println("5> Desplegar los costos del ganado en Chiapas, en Sinaloa, y los totales");
		System.out.println("6> Desplegar el numero total de animales en todos los ganados");
		System.out.println("7> Salir del programa");
	}
	
	public static void MenuSelect(Ganado ganCH, Ganado ganSin) {
		try (Scanner lector = new Scanner(System.in)) {
			System.out.println("Ingresa la opcion del menu deseada: ");
			int opcion= lector.nextInt();
			
			MenuSwitch(opcion, ganCH, ganSin);
		}
	}
	
	public static void MenuSwitch(int opcion, Ganado ganCH, Ganado ganSin) {
		try (Scanner lector = new Scanner(System.in)) {
			switch(opcion) {
			case 1:
				System.out.println("Que tipo de animal quieres comprar en Chiapas?: ");
				System.out.println("1> Borregos");
				System.out.println("2> Lecheras");
				System.out.println("3> Toros");
				int tipoAnimal= lector.nextInt();
				System.out.println("Cuantos de estos animales quieres comprar?");
				int numAnimales= lector.nextInt();
				
				ganCH.compra(numAnimales, tipoAnimal);
				System.out.println("Listo. Tu compra fue exitosa.\n");
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 2:
				System.out.println("Que tipo de animal quieres comprar en Sinaloa?: ");
				System.out.println("1> Borregos");
				System.out.println("2> Lecheras");
				System.out.println("3> Toros");
				int tipoAnimal_Sin= lector.nextInt();
				System.out.println("Cuantos de estos animales quieres comprar?");
				int numAnimales_Sin= lector.nextInt();
				
				ganSin.compra(numAnimales_Sin, tipoAnimal_Sin);
				System.out.println("Listo. Tu compra fue exitosa.\n");
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 3:
				ganCH.setLocalidad("Chiapas");
				Estado(ganCH);
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 4:
				Estado(ganSin);
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 5:
				System.out.println("Para la localidad de Chiapas, el costo por la compra de: ");
				System.out.println(ganCH.getNum_becerros() + " becerros es de " + "$" + Costos.getCostoBecerros(ganCH.getNum_becerros()));
				System.out.println(ganCH.getNum_lecheras() + " lecheras es de " + "$" + Costos.getCostoLecheras(ganCH.getNum_lecheras()));
				System.out.println(ganCH.getNum_toros() + " toros es de " + "$" + Costos.getCostoToros(ganCH.getNum_toros()));
				System.out.println("El costo total del ganado en Chiapas es de " + "$" + CostoTotal(ganCH) + "\n");
				
				System.out.println("Para la localidad de Sinaloa, el costo por la compra de: ");
				System.out.println(ganSin.getNum_becerros() + " becerros es de " + "$" + Costos.getCostoBecerros(ganSin.getNum_becerros()));
				System.out.println(ganSin.getNum_lecheras() + " lecheras es de " + "$" + Costos.getCostoLecheras(ganSin.getNum_lecheras()));
				System.out.println(ganSin.getNum_toros() + " toros es de " + "$" + Costos.getCostoToros(ganSin.getNum_toros()));
				System.out.println("El costo total del ganado en Sinaloa es de " + "$" + CostoTotal(ganSin) + "\n");
				
				float GrandTotal= CostoTotal(ganCH) + CostoTotal(ganSin);
				System.out.println("Entonces, el monto total a pagar por el ganado en ambas localidades es de: $" + GrandTotal + "\n");
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 6:
				float TotalFinal= ganCH.getTotal_ganado() + ganSin.getTotal_ganado();
				
				System.out.println("Total de animales en Chiapas: " + ganCH.getTotal_ganado());
				System.out.println("Total de animales en Sinaloa: " + ganSin.getTotal_ganado());
				System.out.println("Total de animales en ambas localidades: " + TotalFinal + "\n");
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			case 7:
				System.out.println("Hasta Luego!");
				System.exit(0);
				break;
			default:
				System.out.println("ERROR! Ingresa una opcion correcta!");
				DesplegarMenu();
				MenuSelect(ganCH, ganSin);
				break;
			}
		}
	}
	
	public static void Estado(Ganado Localidad) {
		System.out.println("Localidad: " + Localidad.getLocalidad());
		System.out.println("Numero de becerros: " + Localidad.getNum_becerros());
		System.out.println("Numero de lecheras: " + Localidad.getNum_lecheras());
		System.out.println("Numero de toros: " + Localidad.getNum_toros());
		System.out.println("Total de ganado: " + Localidad.getTotal_ganado() + "\n");
	}
	
	public static float CostoTotal( Ganado localidad) {
		float costoTotal= Costos.getCostoBecerros(localidad.getNum_becerros()) + Costos.getCostoLecheras(localidad.getNum_lecheras()) + Costos.getCostoToros(localidad.getNum_toros());
	
		return costoTotal; 
	}
}
