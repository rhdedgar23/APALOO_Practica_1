/* ***********************DOCUMENTACION***********************
- Programa: Practica 1
- Version: Martes 16 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion:  Clase Costos en la que se establecen los precios
  para cada tipo de animal y metodos para regresar el costo de 
  cierto numero de ganada (pasado como parametro). 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Costos {

	static float costoL=18000;
	static float costoB=15000;
	static float costoT=12000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static float getCostoBecerros(int num) {
		float costo= costoB*num;
		return costo;
	}
	
	public static float getCostoLecheras(int num) {
		float costo= costoL*num;
		return costo;
	}
	
	public static float getCostoToros(int num) {
		float costo= costoT*num;
		return costo;
	}
}
