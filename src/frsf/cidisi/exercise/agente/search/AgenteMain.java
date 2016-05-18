package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;
import interfaz.Frame;

public class AgenteMain {
    private Frame frame;
    public AgenteMain(){
        Agente agent = new Agente();

        Facultad environment = new Facultad();
        EstadoAgente estadoAgente= (EstadoAgente) agent.getAgentState();
        frame= new Frame(estadoAgente.getMapa(),this);
        environment.getEnvironmentState().setFrame(frame);

        
    }

    public static void main(String[] args) throws PrologConnectorException {
        
        new AgenteMain();
        
        
    }
    
    public void simulatorStart(){
        Agente agent = new Agente();

        Facultad environment = new Facultad();
        
        environment.getEnvironmentState().setFrame(frame);

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        simulator.start();
    }

}
