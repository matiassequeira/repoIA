package frsf.cidisi.exercise.agente.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import domain.Nodo;
import domain.Punto;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoFacultad extends EnvironmentState {
	

    private Nodo posicionAgente;
    private List<Nodo> listaObstaculos;
    private boolean energiaElectrica;
    private boolean ascensoresFueraServicio;
    private List<Nodo> luminosidad;
    private Nodo destinoAgente;
	
    public EstadoFacultad() {
    		 posicionAgente = new Nodo(null, null);
			 listaObstaculos =  new ArrayList<Nodo>();
			 luminosidad = new ArrayList<Nodo>();
			 destinoAgente = new Nodo(null, null);
        
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

    	Punto puntoAux1;
    	puntoAux1= new Punto(108,39,0);
    	Nodo hall = new Nodo(puntoAux1, "hall");
    	

    	Punto puntoAux4;
    	puntoAux4= new Punto(140,30,0);
    	Nodo fagdut = new Nodo(puntoAux4, "fagdut");
    	
    	Punto puntoAux2 = new Punto(0,2,0);
    	Nodo biblioteca = new Nodo(puntoAux2, "biblioteca");
    	
    	Punto puntoAux3= new Punto(110, 30, 0);
    	Nodo aula1 = new Nodo(puntoAux3, "aula1");
    	
    	
    	
    	hall.setSuroeste(biblioteca);
    	hall.setNoreste(aula1);
    	hall.setNorte(fagdut);
    	
    	aula1.setOeste(fagdut);   
    	
    	fagdut.setSuroeste(biblioteca);
      	
      	posicionAgente=aula1;
      	destinoAgente=biblioteca;
      	ascensoresFueraServicio=false;
      	energiaElectrica=true;
     	listaObstaculos=new ArrayList<Nodo>();
      	//listaObstaculos.add(hall);
      	luminosidad=new ArrayList<Nodo>();
        
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";
        str+= "Posicion agente:"+posicionAgente+'\n';
        if(!energiaElectrica)
        	str+="No hay energia electrica"+'\n';
        if(ascensoresFueraServicio)
        	str+="Ascensores fuera de servicio"+'\n';
        
        if(!luminosidad.isEmpty()){
        	
        	str+= "Lugares sin luz:"+'\n';
        	for(Nodo nodoLuzBaja : luminosidad)
        		str+= nodoLuzBaja.toString()+'\n';
        }
       if(!listaObstaculos.isEmpty()){
        	str+= "Lugares obstaculizados:"+'\n';
        	for(Nodo nodoObstaculos: listaObstaculos)
        		str+=nodoObstaculos.toString()+'\n';
        }
        return str;
    }

	//Complete this section with agent-specific methods
    // The following methods are agent-specific:
	
     public Nodo getPosicionAgente(){
        return posicionAgente;
     }
     public void setPosicionAgente(Nodo arg){
        posicionAgente = arg;
     }
     public List<Nodo> getListaObstaculos(){
        return listaObstaculos;
     }
     public void setListaObstaculos(List<Nodo> arg){
        listaObstaculos = arg;
    }
     public boolean getEnergiaElectrica(){
        return energiaElectrica;
     }
     public void setEnergiaElectrica(boolean arg){
        energiaElectrica = arg;
     }
     public boolean getAscensoresFueraServicio(){
        return ascensoresFueraServicio;
     }
     public void setAscensoresFueraServicio(boolean arg){
        ascensoresFueraServicio = arg;
     }
     
     public List<Nodo> getLuminosidad(){
        return luminosidad;
     }
     public void setLuminosidad(List<Nodo> lista){
        if(luminosidad==null)
        	luminosidad=lista;
        else
        	luminosidad.addAll(lista);
     }
     public Nodo getDestinoAgente(){
        return destinoAgente;
     }
     public void setDestinoAgente(Nodo arg){
        destinoAgente = arg;
     }
	

}

