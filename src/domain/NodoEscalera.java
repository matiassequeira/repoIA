package domain;

public class NodoEscalera extends Nodo {
	
	public NodoEscalera(Punto ubicacion, String descripcion) {
		super(ubicacion, descripcion);
		
	}
	NodoEscalera escalera;

	public NodoEscalera getEscalera() {
		return escalera;
	}

       	public void setEscalera(NodoEscalera escalera) {
		this.escalera = escalera;
                if(escalera.getEscalera()==null)
                    escalera.setEscalera(this);
	}

	public NodoEscalera clone(){
		NodoEscalera clon = new NodoEscalera(this.getUbicacion(),this.getDescripcion());
				
		if(this.getEste()!=null)
			clon.setEste(this.getEste());
		if(this.getOeste()!=null)
			clon.setOeste(this.getOeste());
		if(this.getSur()!=null)
			clon.setSur(this.getSur());
		if(this.getNorte()!=null)
			clon.setNorte(this.getNorte());
		if(this.getNoreste()!=null)
			clon.setNoreste(this.getNoreste());
		if(this.getNoroeste()!=null)
			clon.setNoroeste(this.getNoroeste());
		if(this.getSureste()!=null)
			clon.setSureste(this.getSureste());
		if(this.getSuroeste()!=null)
			clon.setSuroeste(this.getSuroeste());
		
		clon.hayLuz(hayLuz);
		clon.hayObstaculo(hayObstaculo);
		
		clon.setEscalera(this.escalera);
		
		return clon;
	}
	public Double calcularDistanciaEntreNodos(Nodo nodo2){
    	
    	
    	return new Double(20);
    }
	
	public Double getCostoUsarEscalera(){
		if(this.getUbicacion().getZ()<escalera.getUbicacion().getZ()){
			//sube
			return new Double(50);
		}
		//baja
		return new Double(1);
		
			
	}
}
