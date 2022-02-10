/* ***********************DOCUMENTACION***********************
- Programa: Practica 1
- Version: Martes 16 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Ganado que contiene los constructores para
  el ganado, el metodo para su compra y los setters y getters para
  los totales de cada ganado y su localidad.  
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class Ganado {
		private String namelocalidad= new String();//estas son variables de instancia de la clase Ganado
		private int no_becerros=0;
		private int no_lecheras=0;
		private int no_toros=0;
		private int total=0;
		
		static final int BECERROS=1;
		static final int LECHERAS=2;
		static final int TOROS=3;

		public Ganado() {
			namelocalidad= "";
			no_becerros=0;
			no_lecheras=0;
			no_toros=0;
			total=0;
		}
		
		public Ganado(String namelocalidad, int no_becerros, int no_lecheras, int no_toros) {
			this.namelocalidad= namelocalidad;
			this.no_becerros= no_becerros;
			this.no_lecheras= no_lecheras;
			this.no_toros= no_toros;
			this.total= no_becerros + no_lecheras + no_toros;
		}
		
		void compra(int num, int tipo) {//metodo-procedimiento para realizar la comprar de algun tipo de ganado 
			switch(tipo) {
			case BECERROS: no_becerros= no_becerros + num; 
			break;
			case LECHERAS: no_lecheras= no_lecheras + num; 
			break;
			case TOROS: no_toros= no_toros + num; 
			break;
			default: System.out.println("ERROR. Tipo de ganado invalido");
			}
			
			total= total + num;
		}
		
		void setLocalidad(String namelocalidad) {//metodo-procedimiento para asignar una localidad a la variable de instancia string namelocalidad
			this.namelocalidad= namelocalidad;
		}
		
		String getLocalidad() {//metodo-funcion que regresa el string guardado en la variable de instancia namelocalidad
			return namelocalidad;
		}
		
		int getTotal_ganado() {
			return total;
		}

		int getNum_becerros() {
			return no_becerros;
		}
		
		int getNum_lecheras() {
			return no_lecheras;
		}
		
		int getNum_toros() {
			return no_toros;
		}
}

