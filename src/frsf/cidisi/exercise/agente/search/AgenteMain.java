package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;
import interfaz.Frame;

public class AgenteMain {

    public static void main(String[] args) throws PrologConnectorException {
        Agente agent = new Agente();

        Facultad environment = new Facultad();

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        EstadoAgente estadoAgente= (EstadoAgente) agent.getAgentState();
        new Frame(estadoAgente.getMapa());
        simulator.start();
    }

}
