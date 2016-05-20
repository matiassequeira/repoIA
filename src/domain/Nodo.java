package domain;

public class Nodo {
	Nodo sur;
	Nodo norte;
	Nodo este;
	Nodo oeste;
	Nodo sureste;
	Nodo noreste;
	Nodo noroeste;
	Nodo suroeste;
	Punto ubicacion;
	String descripcion="";
	boolean hayObstaculo;
	boolean hayLuz;
        
	
	public boolean hayLuz() {
		return hayLuz;
	}
	public void hayLuz(boolean hayLuz) {
		this.hayLuz = hayLuz;
	}
	public boolean hayObstaculo() {
		return hayObstaculo;
	}
	public void hayObstaculo(boolean hayObstaculo) {
		this.hayObstaculo = hayObstaculo;
	}
	
	public Nodo (Punto ubicacion, String descripcion){
		this.ubicacion=ubicacion;
		this.descripcion=descripcion;
		this.hayLuz=true;
		this.hayObstaculo=false;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Nodo getSur() {
		return sur;
	}
	public void setSur(Nodo nodoSur) {
		this.sur = nodoSur;
		if(nodoSur.getNorte()==null)
			nodoSur.setNorte(this);
	}
	public Nodo getNorte() {
		return norte;
	}
	public void setNorte(Nodo nodoNorte) {
		this.norte = nodoNorte;
		if(nodoNorte.getSur()==null)
			nodoNorte.setSur(this);
	}
	public Nodo getEste() {
		return este;
	}
	public void setEste(Nodo nodoEste) {
		this.este = nodoEste;
		if(nodoEste.getOeste()==null)
			nodoEste.setOeste(this);
	}
	public Nodo getOeste() {
		return oeste;
	}
	public void setOeste(Nodo nodoOeste) {
		this.oeste = nodoOeste;
		if(nodoOeste.getEste()==null)
			nodoOeste.setEste(this);
	}
	public Nodo getSureste() {
		return sureste;
	}
	public void setSureste(Nodo nodoSureste) {
		this.sureste = nodoSureste;
		if(nodoSureste.getNoroeste()==null)
			nodoSureste.setNoroeste(this);
	}
	public Nodo getNoreste() {
		return noreste;
	}
	public void setNoreste(Nodo nodoNoreste) {
		this.noreste = nodoNoreste;
		if(nodoNoreste.getSuroeste()==null)
			nodoNoreste.setSuroeste(this);
	}
	public Nodo getNoroeste() {
		return noroeste;
	}
	public void setNoroeste(Nodo nodoNoroeste) {
		this.noroeste = nodoNoroeste;
		if(nodoNoroeste.getSureste()==null)
			nodoNoroeste.setSureste(this);
	}
	public Nodo getSuroeste() {
		return suroeste;
	}
	public void setSuroeste(Nodo nodoSuroeste) {
		this.suroeste = nodoSuroeste;
		if(nodoSuroeste.getNoreste()==null)
			nodoSuroeste.setNoreste(this);
	}
	public Punto getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Punto ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((ubicacion == null) ? 0 : ubicacion.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (ubicacion == null) {
			if (other.ubicacion != null)
				return false;
		} else if (!ubicacion.equals(other.ubicacion))
			return false;
		return true;
	}
	public Nodo clone(){
		
		
		Punto ubicacion = new Punto(this.ubicacion.getX(),this.ubicacion.getY(),this.ubicacion.getZ());
		
		Nodo clon= new Nodo(ubicacion, descripcion);
		
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
		return clon;
	}
	
	public String toString(){
		String retorno= this.descripcion+"  En el punto: "+this.ubicacion.getX()+", "+this.ubicacion.getY()+", "+this.ubicacion.getZ();
		return retorno;
	}
	public Double calcularDistanciaEntreNodos(Nodo nodo2){
    	int xn1= this.getUbicacion().getX();
    	int yn1= this.getUbicacion().getY();
    	
    	int xn2= nodo2.getUbicacion().getX();
    	int yn2= nodo2.getUbicacion().getY();
    	       System.out.println("entra");
    	Double calculo= Math.sqrt(Math.pow(xn1-xn2, 2)+Math.pow(yn1-yn2, 2));
    	
    	return calculo;
    }
	public Double funcionHeuristica(Nodo nodo2){
    	int xn1= this.getUbicacion().getX();
    	int yn1= this.getUbicacion().getY();
    	int zn1= this.getUbicacion().getZ();
    	
    	int xn2= nodo2.getUbicacion().getX();
    	int yn2= nodo2.getUbicacion().getY();
    	int zn2= nodo2.getUbicacion().getZ();
    	
    	Double calculo= Math.sqrt(Math.pow(xn1-xn2, 2)+Math.pow(yn1-yn2, 2)+Math.pow(zn1-zn2, 2));
    	
    	return calculo;
    }
}
