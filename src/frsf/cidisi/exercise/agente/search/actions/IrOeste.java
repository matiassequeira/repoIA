package frsf.cidisi.exercise.agente.search.actions;

import domain.Nodo;
import frsf.cidisi.exercise.agente.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class IrOeste extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
	@Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
       EstadoAgente agState = (EstadoAgente) s;
       Nodo nodoActual = agState.getPosicion();
       
       if (nodoActual.getOeste()!=null){
    	   if(nodoActual.getOeste().hayLuz() && !nodoActual.getOeste().hayObstaculo()){
    		   agState.setPosicion(nodoActual.getOeste());
//    		   agState.setEnergiaDisponible(agState.getEnergiaDisponible()-
//    				   nodoActual.calcularDistanciaEntreNodos(nodoActual.getOeste()));
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

        Nodo nodoActual = agState.getPosicion();
        
        if (nodoActual.getOeste()!=null){
     	   if(nodoActual.getOeste().hayLuz() && !nodoActual.getOeste().hayObstaculo()){
     		   agState.setPosicion(nodoActual.getOeste());
//     		   agState.setEnergiaDisponible(agState.getEnergiaDisponible()-
//     				   nodoActual.calcularDistanciaEntreNodos(nodoActual.getOeste()));
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
        return  ((Nodo) nodo).calcularDistanciaEntreNodos(((Nodo) nodo).getOeste());
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "IrOeste";
    }
}