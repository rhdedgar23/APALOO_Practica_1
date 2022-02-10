/* ***********************DOCUMENTACION***********************
- Programa: Practica 1
- Version: Martes 16 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion:  Clase Principal2 en la que se hace una compra de
  ganado y al final regresa el total de ganado. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Principal2 {
	
	public static void main(String[] args) {
		
		Ganado ganCH = new Ganado();//creamos un nuevo objeto llamado ganCH de la clase Ganado

		Estado(ganCH);
		
		ganCH.setLocalidad("Chiapas");
		Estado(ganCH);
		
		ganCH.compra(100, Ganado.BECERROS);
		ganCH.compra(500, Ganado.LECHERAS);
		ganCH.compra(50, Ganado.TOROS);
		Estado(ganCH);
		
		ganCH.compra(10, Ganado.BECERROS);
		ganCH.compra(200, Ganado.LECHERAS);
		ganCH.compra(10, Ganado.TOROS);
		Estado(ganCH);
		
		System.out.println("El total de ganado en Chiapas es de " + ganCH.getTotal_ganado() + ".");
		CostoTotal_Chiapas(ganCH);
	}
	
	public static void Estado(Ganado ganCH) {
		System.out.println("Localidad: " + ganCH.getLocalidad());
		System.out.println("Numero de becerros: " + ganCH.getNum_becerros());
		System.out.println("Numero de lecheras: " + ganCH.getNum_lecheras());
		System.out.println("Numero de toros: " + ganCH.getNum_toros());
		System.out.println("Total de ganado: " + ganCH.getTotal_ganado() + "\n");

	}
	
	public static void CostoTotal_Chiapas( Ganado localidad) {
		float costoTotal= Costos.getCostoBecerros(localidad.getNum_becerros()) + Costos.getCostoLecheras(localidad.getNum_lecheras()) + Costos.getCostoToros(localidad.getNum_toros());
	
		System.out.println("El costo total del ganado es de " + costoTotal + ".");
	}
	
	
}
