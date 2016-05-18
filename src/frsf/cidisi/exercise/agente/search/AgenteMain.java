package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;
import interfaz.Frame;

public class AgenteMain {

    public static void main(String[] args) throws PrologConnectorException {
        Agente agent = new Agente();

        Facultad environment = new Facultad();
        EstadoAgente estadoAgente= (EstadoAgente) agent.getAgentState();
        Frame frame= new Frame(estadoAgente.getMapa());
        environment.getEnvironmentState().setFrame(frame);

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        
        
        simulator.start();
    }

}
