package frsf.cidisi.exercise.agente.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.Map.Entry;

import sun.net.idn.Punycode;

import datos.DatosMapa;
import domain.Nodo;
import domain.NodoEscalera;
import domain.Punto;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.solver.search.AStarSearch;
import frsf.cidisi.faia.solver.search.BreathFirstSearch;
import frsf.cidisi.faia.solver.search.DepthFirstSearch;
import frsf.cidisi.faia.solver.search.NTree;
import frsf.cidisi.faia.solver.search.UniformCostSearch;
import interfaz.Frame;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
    private Nodo posicion;
    private Nodo destino;
    private Double energiaDisponible;
    private Map<Punto, Nodo> mapa;
    private boolean hayEnergiaElectrica;
    private Vector<NTree> ramaExpandidaAObjetivo;
    
    private static int searchStrategy;
	public  static final int PROFUNDIDAD=1;
	public  static final int ANCHURA=2;
	public  static final int COSTO_UNIFORME=3;
	public static final int A_ASTERISCO=4;
    

   

	

	public EstadoAgente() {
    
    	/*
			// posicion = initData0;
			// destino = initData1;
			// energiaDisponible = initData2;
			// mapa = initData3;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        EstadoAgente newState= new EstadoAgente();
        
        newState.setEnergiaDisponible(this.getEnergiaDisponible());
        
        newState.setPosicion(this.getPosicion().clone());
        newState.setDestino(this.getDestino().clone());
        
//        Map<Punto, Nodo> mapaCopia = new HashMap<Punto, Nodo>();
//        for (Map.Entry<Punto, Nodo> elementoMapa : this.getMapa().entrySet()){
//        	mapaCopia.put(elementoMapa.getKey(), elementoMapa.getValue().clone());
//        }
        newState.setMapa(mapa);
        newState.setHayEnergiaElectrica(this.hayEnergiaElectrica);
		
        return newState;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        AgentePerception percepcion = (AgentePerception) p;
//        
//        switch(searchStrategy){
//    	case(PROFUNDIDAD): 
//    		energiaDisponible= energiaDisponible-posicion.calcularDistanciaEntreNodos(percepcion.getPosicionAgente());
//    		break;
//    	case(ANCHURA):
//    		energiaDisponible= energiaDisponible-posicion.calcularDistanciaEntreNodos(percepcion.getPosicionAgente());
//    		break;
//    	case(COSTO_UNIFORME):
//    		if(this.getPosicion() instanceof NodoEscalera && percepcion.getPosicionAgente() instanceof NodoEscalera)
//    			energiaDisponible-= ((NodoEscalera) this.getPosicion()).getCostoUsarEscalera()*10;
//    		else
//    			energiaDisponible-=10;
//    		break;
//    	case(A_ASTERISCO):
//    		energiaDisponible= energiaDisponible-posicion.calcularDistanciaEntreNodos(percepcion.getPosicionAgente());
//    		
//    		break;
//    	}
//        
//        
//        
//        this.posicion=mapa.get(percepcion.getPosicionAgente().getUbicacion());
        
        
        this.hayEnergiaElectrica=percepcion.isEnergiaElectrica();
        if (percepcion.isAscensorFueraServicio()){
        	//TODO buscar los ascensores en el mapa y ponerlos en fuera de servicio
        }
        if(!percepcion.getLuminosidadBajaNodosAdyacentes().isEmpty()){
        	for (Nodo nodoSinLuz : percepcion.getLuminosidadBajaNodosAdyacentes()) {
				mapa.get(nodoSinLuz.getUbicacion()).hayLuz(false);
			}
        }
        if(!percepcion.getNodosAdyacentesConObstaculos().isEmpty()){
        	for (Nodo nodoConObstaculo : percepcion.getNodosAdyacentesConObstaculos()) {
        		Nodo nodoASetearObstaculo=mapa.get(nodoConObstaculo.getUbicacion());
        		
				nodoASetearObstaculo.hayObstaculo(true);
				System.out.println("borrarenestadoagente"+ mapa.get(nodoConObstaculo.getUbicacion()).hayObstaculo());
			}
        }
        
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
     
    	energiaDisponible= new Double(300);
    	hayEnergiaElectrica=true;
    	mapa = DatosMapa.cargarDatos();
      	posicion=DatosMapa.getPosicion();
      	destino=DatosMapa.getDestino();
    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        
        str+= "Posicion agente:"+posicion+'\n'
        + "Destino: "+destino.toString()+'\n'
        + "Energia disponible:" +energiaDisponible+'\n';
        if(!hayEnergiaElectrica)
        	str+="No hay energia electrica"+'\n';

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
    	
    	//TODO mirar si solamente hay que comparar eso
       
       EstadoAgente estadoComparado = (EstadoAgente) obj;
       boolean mismaPosicion = estadoComparado.getPosicion().equals(this.getPosicion());
       
       return mismaPosicion;
    }
    
  /*  public boolean hayBucle(Nodo nodoNuevoEstado){
    	Boolean hayBucle= false;
    	List<Nodo> primerCiclo = new ArrayList<Nodo>();
    	List<Nodo> segundoCiclo = new ArrayList<Nodo>();
    	
    	Stack<Nodo> nodosRecorridosCopia = (Stack<Nodo>) nodosRecorridos.clone();
    	boolean existeNodoEnPila = false;
    	
    	for(int i= 0; i< nodosRecorridosCopia.size();i++){
    		Nodo nodoRecorridoCopia = nodosRecorridosCopia.pop();
    		
    		if(nodoRecorridoCopia.equals(nodoNuevoEstado)&& !existeNodoEnPila){
    			existeNodoEnPila=true;
    		}
    		
    		else if (nodoRecorridoCopia.equals(nodoNuevoEstado)&& existeNodoEnPila){
    			for(Nodo nodoPrimerCiclo : primerCiclo){
    				for(Nodo nodoSegundoCiclo: segundoCiclo){
    					if(!nodoPrimerCiclo.equals(nodoSegundoCiclo)){
    						
    					}
    				}
    			}
    			if(primerCiclo.equals(segundoCiclo)){
    				hayBucle=true;
    				break;
    			}
    			primerCiclo.add()
    		}
    		
    		else{
    			if(!existeNodoEnPila){
    				primerCiclo.add(nodoRecorridoCopia);
    			}
    			else
    				segundoCiclo.add(nodoRecorridoCopia);
    		}
    		
    	}
    	
    	return true;
    }*/
    
   	
     public boolean hayEnergiaElectrica() {
		return hayEnergiaElectrica;
	}

	public void setHayEnergiaElectrica(boolean hayEnergiaElectrica) {
		this.hayEnergiaElectrica = hayEnergiaElectrica;
	}

	public Nodo getPosicion(){
        return posicion;
     }
     public void setPosicion(Nodo arg){
        posicion = arg;
     }
     public Nodo getDestino(){
        return destino;
     }
     public void setDestino(Nodo arg){
        destino = arg;
     }
     public Double getEnergiaDisponible(){
        return energiaDisponible;
     }
     public void setEnergiaDisponible(Double arg){
    	 if(searchStrategy==COSTO_UNIFORME)
    		 energiaDisponible-=10;
    	 else
    		 energiaDisponible=arg;
         double e = energiaDisponible;
         Frame.updateEnergia((int)e);
         
         
     }
   
     public Map<Punto,Nodo> getMapa(){
        return mapa;
     }
     public void setMapa(Map<Punto,Nodo> arg){
        mapa = arg;
     }

	public void setRamaExpandidaAObjetivo(Vector<NTree> ramaExpandidaAObjetivo) {
		this.ramaExpandidaAObjetivo = ramaExpandidaAObjetivo;
	}

	public Vector<NTree> getRamaExpandidaAObjetivo() {
		return ramaExpandidaAObjetivo;
	}

	public void setEnergiaDisponibleConOperadorUsarEscalera(double arg) {
		// TODO Auto-generated method stub
		 if(searchStrategy==COSTO_UNIFORME)
			 energiaDisponible-= ((NodoEscalera) this.getPosicion()).getCostoUsarEscalera()*10;
                else
                         energiaDisponible=arg;
                 double e = energiaDisponible;
                Frame.updateEnergia((int)e);
                 
	}
	public static void setSearchStrategy(int searchStrategy) {
		EstadoAgente.searchStrategy = searchStrategy;
	}
}

