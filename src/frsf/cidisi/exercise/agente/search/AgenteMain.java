package frsf.cidisi.exercise.agente.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;
import interfaz.Frame;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AgenteMain {
    private Frame frame;
    public AgenteMain() throws IOException{
        Agente agent = new Agente();

        Facultad environment = new Facultad();
        EstadoAgente estadoAgente= (EstadoAgente) agent.getAgentState();
        frame= new Frame(estadoAgente.getMapa(),this); //Se envia agenteMain para ejecutar start()
        // 1. create the pipes
        PipedInputStream inPipe = new PipedInputStream();
        PipedInputStream outPipe = new PipedInputStream();

        // 2. set the System.in and System.out streams
        System.setIn(inPipe);
        System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));


        PrintWriter inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);

        
        
        frame.addConsola(outPipe, inWriter);
        

        

        
        //Se setea la ventana para graficar el movimiento del agente en tiempo real
        environment.getEnvironmentState().setFrame(frame);

        // 5. get some input (from JTextArea)
        Scanner s = new Scanner(System.in);
    }

    public static void main(String[] args) throws PrologConnectorException, IOException {
        
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
