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
		
		NodoAscensor clon = new NodoAscensor(this.getUbicacion(),this.getDescripcion());	
		
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
		
		if(this.getAscensor0()!=null)
			clon.setAscensor0(this.getAscensor0());
		if(this.getAscensor1()!=null)
			clon.setAscensor1(this.getAscensor1());
		if(this.getAscensor2()!=null)
			clon.setAscensor2(this.getAscensor2());
		if(this.getAscensor3()!=null)
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
