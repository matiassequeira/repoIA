package frsf.cidisi.exercise.agente.search;

import java.util.ArrayList;
import java.util.List;

import domain.Nodo;
import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class AgentePerception extends Perception {

	//: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//Setup Sensors
	private boolean ascensorFueraServicio;
	private Nodo posicionAgente;
	private boolean energiaElectrica;
	private List<Nodo> luminosidadBajaNodosAdyacentes;
	private Nodo destino;
	private List<Nodo> nodosAdyacentesConObstaculos;
	
 

    public  AgentePerception() {
    	//: Complete Method
    }

    public AgentePerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	System.out.println("initPerception: creemos que aca no entra");
    }
    /*	//: Complete Method
        
        Agente agent = (Agente) agentIn;
        Facultad environment = (Facultad) environmentIn;
        EstadoFacultad environmentState = environment.getEnvironmentState();
       
        destino= environmentState.getDestinoAgente();
        posicionAgente = environmentState.getPosicionAgente();
        ascensorFueraServicio= environmentState.getAscensoresFueraServicio();
        energiaElectrica= environmentState.getEnergiaElectrica();
        luminosidadBajaNodosAdyacentes=new ArrayList<Nodo>();
        nodosAdyacentesConObstaculos=new ArrayList<Nodo>();
        
        for (Nodo nodoSinLuminosidad : environmentState.getLuminosidad()) {
			if(nodoSinLuminosidad.equals(posicionAgente.getEste())
				||nodoSinLuminosidad.equals(posicionAgente.getNoreste())
				||nodoSinLuminosidad.equals(posicionAgente.getNorte())
				||nodoSinLuminosidad.equals(posicionAgente.getNoroeste())
				||nodoSinLuminosidad.equals(posicionAgente.getOeste())
				||nodoSinLuminosidad.equals(posicionAgente.getSuroeste())
				||nodoSinLuminosidad.equals(posicionAgente.getSur())
				||nodoSinLuminosidad.equals(posicionAgente.getSureste()))
				luminosidadBajaNodosAdyacentes.add(nodoSinLuminosidad);
        }
        
        for (Nodo nodoConObstaculo : environmentState.getListaObstaculos()) {
			if(nodoConObstaculo.equals(posicionAgente.getEste())
				||nodoConObstaculo.equals(posicionAgente.getNoreste())
				||nodoConObstaculo.equals(posicionAgente.getNorte())
				||nodoConObstaculo.equals(posicionAgente.getNoroeste())
				||nodoConObstaculo.equals(posicionAgente.getOeste())
				||nodoConObstaculo.equals(posicionAgente.getSuroeste())
				||nodoConObstaculo.equals(posicionAgente.getSur())
				||nodoConObstaculo.equals(posicionAgente.getSureste()))
				nodosAdyacentesConObstaculos.add(nodoConObstaculo);
        }
				
		
       
     
        
    }*/
    
    @Override
    public String toString() {
        String str="";
        
        if(posicionAgente!=null)
        	str+= "Posicion agente: "+posicionAgente.toString()+'\n';
        if(destino!=null)
        	str+="Destino: "+destino.toString()+'\n';
        if(ascensorFueraServicio)
        	str+="Ascensor fuera de servicio" +'\n';
        if(!energiaElectrica)
        	str+="No hay energía electrica"+'\n';
        if(!luminosidadBajaNodosAdyacentes.isEmpty()){
        	str+= "Nodos adyacentes sin luz:"+'\n';
        	for(Nodo nodoLuzBaja : luminosidadBajaNodosAdyacentes)
        		str+= nodoLuzBaja.toString()+'\n';
        }
        if(!nodosAdyacentesConObstaculos.isEmpty()){
        	str+= "Nodos adyacentes obstaculizados:"+'\n';
        	for(Nodo nodoObstaculos: nodosAdyacentesConObstaculos)
        		str+=nodoObstaculos.toString()+'\n';
        }

        

        return str;
    }

    // The following methods are agent-specific:
    //T: Complete this section with the agent-specific methods
	
     
     public List<Nodo> getLuminosidadBajaNodosAdyacentes(){
        return luminosidadBajaNodosAdyacentes;
     }
     public void setLuminosidadBajaNodosAdyacentes(List<Nodo> arg){
        this.luminosidadBajaNodosAdyacentes = arg;
     }
     
     public List<Nodo> getNodosAdyacentesConObstaculos(){
        return nodosAdyacentesConObstaculos;
     }
     public void setNodosAdyacentesConObstaculos(List<Nodo> arg){
        this.nodosAdyacentesConObstaculos = arg;
     }

	public boolean isAscensorFueraServicio() {
		return ascensorFueraServicio;
	}

	public void setAscensorFueraServicio(boolean ascensorFueraServicio) {
		this.ascensorFueraServicio = ascensorFueraServicio;
	}

	public Nodo getPosicionAgente() {
		return posicionAgente;
	}

	public void setPosicionAgente(Nodo posicionAgente) {
		this.posicionAgente = posicionAgente;
	}

	public boolean isEnergiaElectrica() {
		return energiaElectrica;
	}

	public void setEnergiaElectrica(boolean energiaElectrica) {
		this.energiaElectrica = energiaElectrica;
	}

	public Nodo getDestino() {
		return destino;
	}

	public void setDestino(Nodo destino) {
		this.destino = destino;
	}

	
   
}
