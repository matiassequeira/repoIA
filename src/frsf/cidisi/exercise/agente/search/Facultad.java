package frsf.cidisi.exercise.agente.search;

import java.util.ArrayList;
import java.util.List;

import domain.Nodo;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;
import frsf.cidisi.faia.state.AgentState;

public class Facultad extends Environment {
    
    public Facultad() {
        // Create the environment state
        this.environmentState = new EstadoFacultad();
    }

    public EstadoFacultad getEnvironmentState() {
        return (EstadoFacultad) environmentState;
    }
    /**
     * This method is called by the simulator. Given the Agent, it creates
     * a new perception reading, for example, the agent position.
     * @param agent
     * @return A perception that will be given to the agent by the simulator.
     */
    @Override
    public  AgentePerception getPercept() {
        // Create a new perception to return
         AgentePerception perception = new AgentePerception();
		
         perception.setAscensorFueraServicio(this.getEnvironmentState().getAscensoresFueraServicio());
         perception.setEnergiaElectrica(this.getEnvironmentState().getEnergiaElectrica());
         
         
         Nodo posicionAgente= this.getEnvironmentState().getPosicionAgente();
         List<Nodo> luminosidadBajaNodosAdyacentes= new ArrayList<Nodo>();
         for (Nodo nodoSinLuminosidad : this.getEnvironmentState().getLuminosidad()) {
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
         perception.setLuminosidadBajaNodosAdyacentes(luminosidadBajaNodosAdyacentes);
         
         List<Nodo> nodosAdyacentesConObstaculos= new ArrayList<Nodo>();
         for (Nodo nodoConObstaculo : this.getEnvironmentState().getListaObstaculos()) {
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
        perception.setNodosAdyacentesConObstaculos(nodosAdyacentesConObstaculos);

        this.getEnvironmentState().getFrame().setPerception(posicionAgente);
        return perception;
    }

    
    public String toString() {
        return environmentState.toString();
    }

    
    public boolean agentFailed(AgentState agState) {

    	EstadoAgente estAgente= (EstadoAgente) agState;
        if(estAgente.getEnergiaDisponible()<=0)
        	return true;

        return false;
    }

	//: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
    
}
