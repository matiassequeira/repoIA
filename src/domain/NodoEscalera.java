package domain;

public class NodoEscalera extends Nodo {
	
	public NodoEscalera(Punto ubicacion, String descripcion) {
		super(ubicacion, descripcion);
		
	}
	Nodo escalera;

	public Nodo getEscalera() {
		return escalera;
	}

	public void setEscalera(Nodo escalera) {
		this.escalera = escalera;
	}

	public NodoEscalera clone(){
		NodoEscalera clon = new NodoEscalera(this.getUbicacion(),this.getDescripcion());
		
		clon=(NodoEscalera) super.clone();
		
		clon.setEscalera(this.escalera);
		
		return clon;
	}
	public Double calcularDistanciaEntreNodos(Nodo nodo2){
    	
    	
    	return new Double(5);
    }
	
	public Double getCostoUsarEscalera(){
		if(this.getUbicacion().getZ()<escalera.getUbicacion().getZ()){
			//sube
			return new Double(5);
		}
		//baja
		return new Double(1);
		
			
	}
}
