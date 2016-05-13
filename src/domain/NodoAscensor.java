package domain;

public class NodoAscensor extends Nodo{

	public NodoAscensor(Punto ubicacion, String descripcion) {
		super(ubicacion, descripcion);
		
	}

	NodoAscensor ascensor0;
	NodoAscensor ascensor1;
	NodoAscensor ascensor2;
	NodoAscensor ascensor3;
	boolean fueraDeServicio;

	public boolean isFueraDeServicio() {
		return fueraDeServicio;
	}

	public void setFueraDeServicio(boolean fueraDeServicio) {
		this.fueraDeServicio = fueraDeServicio;
	}

	
	public NodoAscensor clone(){
		Punto ubicacion = new Punto(this.ubicacion.getX(), this.ubicacion.getY(), this.ubicacion.getZ());
		NodoAscensor clon = new NodoAscensor(ubicacion,this.getDescripcion());	
		
		clon.setEste(this.getEste());
		clon.setOeste(this.getOeste());
		clon.setSur(this.getSur());
		clon.setNorte(this.getNorte());
		clon.setNoreste(this.getNoreste());
		clon.setNoroeste(this.getNoroeste());
		clon.setSureste(this.getSureste());
		clon.setSuroeste(this.getSuroeste());
		clon.setAscensor0(this.getAscensor0());
		clon.setAscensor1(this.getAscensor1());
		clon.setAscensor2(this.getAscensor2());
		clon.setAscensor3(this.getAscensor3());
		
		return clon;
	}
	public Double calcularDistanciaEntreNodos(Nodo nodo2){
    	
    	return new Double(1);
    }

	public NodoAscensor getAscensor0() {
		return ascensor0;
	}

	public void setAscensor0(NodoAscensor ascensor0) {
		this.ascensor0 = ascensor0;
	}

	public NodoAscensor getAscensor1() {
		return ascensor1;
	}

	public void setAscensor1(NodoAscensor ascensor1) {
		this.ascensor1 = ascensor1;
	}

	public NodoAscensor getAscensor2() {
		return ascensor2;
	}

	public void setAscensor2(NodoAscensor ascensor2) {
		this.ascensor2 = ascensor2;
	}

	public NodoAscensor getAscensor3() {
		return ascensor3;
	}

	public void setAscensor3(NodoAscensor ascensor3) {
		this.ascensor3 = ascensor3;
	}

	
}
