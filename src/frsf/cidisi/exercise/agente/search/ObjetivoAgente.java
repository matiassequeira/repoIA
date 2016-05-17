

package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    
    	
    	EstadoAgente estAgente = (EstadoAgente) agentState;
    	
        if  (estAgente.getPosicion().equals(estAgente.getDestino())){
            return true;
        }
        return false;
	}
}