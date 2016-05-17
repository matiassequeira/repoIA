package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.exercise.agente.search.actions.Apagar;
import frsf.cidisi.exercise.agente.search.actions.UsarEscalera;
import frsf.cidisi.exercise.agente.search.actions.UtilizarAscensorAPiso0;
import frsf.cidisi.exercise.agente.search.actions.UtilizarAscensorAPiso2;
import frsf.cidisi.exercise.agente.search.actions.UtilizarAscensorAPiso3;
import frsf.cidisi.exercise.agente.search.actions.IrSur;
import frsf.cidisi.exercise.agente.search.actions.IrEste;
import frsf.cidisi.exercise.agente.search.actions.IrNorte;
import frsf.cidisi.exercise.agente.search.actions.IrOeste;
import frsf.cidisi.exercise.agente.search.actions.IrSureste;
import frsf.cidisi.exercise.agente.search.actions.IrSuroeste;
import frsf.cidisi.exercise.agente.search.actions.IrNoreste;
import frsf.cidisi.exercise.agente.search.actions.IrNoroeste;
import frsf.cidisi.exercise.agente.search.actions.UtilizarAscensorAPiso1;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.Problem;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.solver.search.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class Agente extends SearchBasedAgent {
	
	private int searchStrategy=3;
	public  static final int PROFUNDIDAD=1;
	public  static final int ANCHURA=2;
	public  static final int COSTO_UNIFORME=3;
	public static final int A_ASTERISCO=4;
	
    public Agente() {

        // The Agent Goal
        ObjetivoAgente agGoal = new ObjetivoAgente();

        // The Agent State
        EstadoAgente agState = new EstadoAgente();
        this.setAgentState(agState);
        agState.setSearchStrategy(searchStrategy);

        // Create the operators
        Vector<SearchAction> operators = new Vector<SearchAction>();
        operators.addElement(new UsarEscalera());
        operators.addElement(new UtilizarAscensorAPiso0());	
        operators.addElement(new UtilizarAscensorAPiso1());	
        operators.addElement(new UtilizarAscensorAPiso2());	
        operators.addElement(new UtilizarAscensorAPiso3());	
        operators.addElement(new IrSur());	
        operators.addElement(new IrEste());	
        operators.addElement(new IrNorte());	
        operators.addElement(new IrOeste());	
        operators.addElement(new IrSureste());	
        operators.addElement(new IrSuroeste());	
        operators.addElement(new IrNoreste());	
        operators.addElement(new IrNoroeste());	
        
        	
        operators.addElement(new Apagar());

        // Create the Problem which the agent will resolve
        Problem problem = new Problem(agGoal, agState, operators);
        this.setProblem(problem);
    }

    /**
     * This method is executed by the simulator to ask the agent for an action.
     */
    @Override
    public Action selectAction() {

        // Create the search strategy
       Strategy strategy = null;
       switch(searchStrategy){
    	case(PROFUNDIDAD): 
    		if ( ((EstadoAgente) this.getAgentState()).getRamaExpandidaAObjetivo() != null){
    			EstadoAgente estadoAgenteClonado = (EstadoAgente) ((EstadoAgente) this.getAgentState()).clone();
    			Vector<NTree> vectorRama =((EstadoAgente) this.getAgentState()).getRamaExpandidaAObjetivo();
    			SearchAction accionRamaExpandida = vectorRama.remove(0).getAction();
    			if(accionRamaExpandida.execute(estadoAgenteClonado)!= null)
    				
    				return accionRamaExpandida;
    		}
    		strategy= new DepthFirstSearch();
    		break;
    	case(ANCHURA):
    		strategy= new BreathFirstSearch();
    		break;
    	case(COSTO_UNIFORME):
    		strategy = new UniformCostSearch(new UniformCostFunction());
    		break;
    	case(A_ASTERISCO):
    		strategy = new AStarSearch(new CostFunction(), new Heuristic());
    		break;
    	}
        // Create a Search object with the strategy
        Search searchSolver = new Search(strategy);

        /* Generate an XML file with the search tree. It can also be generated
         * in other formats like PDF with PDF_TREE */
        searchSolver.setVisibleTree(Search.GRAPHVIZ_TREE);

        // Set the Search searchSolver.
        this.setSolver(searchSolver);

        // Ask the solver for the best action
        Action selectedAction = null;
        try {
            selectedAction =
                    this.getSolver().solve(new Object[]{this.getProblem()});
            if (strategy instanceof DepthFirstSearch){
            	Vector<NTree> vectorRama =((DepthFirstSearch) strategy).getRamaExpandida();
            	vectorRama.remove(0);
            	((EstadoAgente) this.getAgentState()).setRamaExpandidaAObjetivo(vectorRama);
            }	
            
        } catch (Exception ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Return the selected action
        return selectedAction;

    }

    /**
     * This method is executed by the simulator to give the agent a perception.
     * Then it updates its state.
     * @param p
     */
    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }
}
