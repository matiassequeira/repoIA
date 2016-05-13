package datos;

import domain.Nodo;
import domain.Punto;

public class DatosMapa {
	
	public void datos(){
		
		Punto puntoHall_108_39_0= new Punto(108, 39, 0);
		Nodo hall_108_39_0 = new Nodo(puntoHall_108_39_0, "HALL");

		Punto puntoIngreso_102_40_0= new Punto(102, 40, 0);
		Nodo ingreso_102_40_0 = new Nodo(puntoIngreso_102_40_0, "INGRESO");


		Punto puntoFagdut_104_30_0= new Punto(104,30, 0);
		Nodo fagdut_104_30_0 = new Nodo(puntoFagdut_104_30_0, "FAGDUT");
		
		Punto puntoAula1_110_30_0 = new Punto(110,30,0);
		Nodo aula1_110_30_0= new Nodo(puntoAula1_110_30_0,"AULA1");
	}

}
