package frsf.cidisi.exercise.agente.search.actions;

import domain.Nodo;
import domain.NodoEscalera;
import frsf.cidisi.exercise.agente.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class UsarEscalera extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoAgente agState = (EstadoAgente) s;
        
        if(agState.getPosicion()instanceof NodoEscalera){
        	
        	NodoEscalera nodoEscalera = (NodoEscalera) agState.getPosicion();
        	if(nodoEscalera.getEscalera().hayLuz() && !nodoEscalera.getEscalera().hayObstaculo()){
//        		agState.setEnergiaDisponible(agState.getEnergiaDisponible()-
//     				   nodoEscalera.calcularDistanciaEntreNodos(nodoEscalera.getEscalera()));
        		agState.setPosicion(nodoEscalera.getEscalera());
        		return agState;
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

        if(agState.getPosicion()instanceof NodoEscalera){
        	
        	NodoEscalera nodoEscalera = (NodoEscalera) agState.getPosicion();
        	if(nodoEscalera.getEscalera().hayLuz() && !nodoEscalera.getEscalera().hayObstaculo()){
        		agState.setEnergiaDisponibleConOperadorUsarEscalera(agState.getEnergiaDisponible()-
     				   nodoEscalera.calcularDistanciaEntreNodos(nodoEscalera.getEscalera()));
        		agState.setPosicion(nodoEscalera.getEscalera());
        		environmentState.setPosicionAgente(agState.getPosicion());
        		return environmentState;
        	}
        }     
               
        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost(Object nodo) {
    	NodoEscalera nodoE = (NodoEscalera)nodo;
        return  nodoE.calcularDistanciaEntreNodos(nodoE.getEscalera());
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "UsarEscalera";
    }
    
    
}