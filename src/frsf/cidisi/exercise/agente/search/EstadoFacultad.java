package frsf.cidisi.exercise.agente.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import datos.DatosMapa;
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
		 energiaElectrica=true;
         this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

    	
      	
      	posicionAgente=DatosMapa.getPosicion();
      	destinoAgente=DatosMapa.getDestino();
      	
      	ascensoresFueraServicio=false;
      	energiaElectrica=true;
     	
      	listaObstaculos=DatosMapa.getObstaculos();
      	//listaObstaculos.add(hall);
      	luminosidad=DatosMapa.getNodosSinLuz();
        
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

