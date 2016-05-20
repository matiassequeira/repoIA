package frsf.cidisi.exercise.agente.search.actions;

import domain.Nodo;
import domain.NodoAscensor;
import frsf.cidisi.exercise.agente.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class UtilizarAscensorAPiso0 extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
    	EstadoAgente agState = (EstadoAgente) s;
        
        if(agState.getPosicion()instanceof NodoAscensor){
        	
        	NodoAscensor nodoAscensor = (NodoAscensor) agState.getPosicion();
        	
        	if(nodoAscensor.getAscensor0()!=null){
        		if(!nodoAscensor.isFueraDeServicio() && agState.hayEnergiaElectrica()){
//	         		agState.setEnergiaDisponible(agState.getEnergiaDisponible()-
//	      				   nodoAscensor.calcularDistanciaEntreNodos(nodoAscensor.getAscensor0()));
	         		agState.setPosicion(nodoAscensor.getAscensor0());
	         		return agState;
	         	}
        	}	
        }     
               
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoFacultad environmentState = (EstadoFacultad) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        if(agState.getPosicion()instanceof NodoAscensor){
        	
        	NodoAscensor nodoAscensor = (NodoAscensor) agState.getPosicion();
        	
        	if(nodoAscensor.getAscensor0()!=null){
	         	if(!nodoAscensor.isFueraDeServicio() && agState.hayEnergiaElectrica()){
	         		agState.setEnergiaDisponible(agState.getEnergiaDisponible()-
		      				   nodoAscensor.calcularDistanciaEntreNodos(nodoAscensor.getAscensor0()));
	         		agState.setPosicion(nodoAscensor.getAscensor0());
	         		environmentState.setPosicionAgente(agState.getPosicion());
	         		return environmentState;
	         	}
        	}	
        }     
               
        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost(Object nodo) {
    	NodoAscensor nodoA = (NodoAscensor)nodo;
        return  nodoA.calcularDistanciaEntreNodos(nodoA.getAscensor0());
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "UtilizarAscensorAPiso2";
    }
}