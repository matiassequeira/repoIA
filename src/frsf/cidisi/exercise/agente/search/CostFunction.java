package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.solver.search.IStepCostFunction;
import frsf.cidisi.faia.solver.search.NTree;
import frsf.cidisi.faia.state.AgentState;

/**
 * This class can be used in any search strategy like
 * Uniform Cost.
 */
public class CostFunction implements IStepCostFunction {

    /**
     * This method calculates the cost of the given NTree node.
     */
    
    public double calculateCost(NTree node) {
        
    	
    	EstadoAgente state = (EstadoAgente) node.getParent().getAgentState();
        return node.getAction().getCost(state.getPosicion());
    }
}
