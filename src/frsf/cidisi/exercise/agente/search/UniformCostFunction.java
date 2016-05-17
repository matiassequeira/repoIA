package frsf.cidisi.exercise.agente.search;

import domain.NodoEscalera;
import frsf.cidisi.faia.solver.search.IStepCostFunction;
import frsf.cidisi.faia.solver.search.NTree;
import frsf.cidisi.faia.state.AgentState;

/**
 * This class can be used in any search strategy like
 * Uniform Cost.
 */
public class UniformCostFunction implements IStepCostFunction {

    /**
     * This method calculates the cost of the given NTree node.
     */
    
    public double calculateCost(NTree node) {
        
    	if(node.getAction().toString().equals("UsarEscalera")){
    		EstadoAgente state = ((EstadoAgente) node.getParent().getAgentState());
    		NodoEscalera nodoEscalera= (NodoEscalera) state.getPosicion();
    		return nodoEscalera.getCostoUsarEscalera()*10;
    	}
    	
    	return new Double(10);    	
    }
}
