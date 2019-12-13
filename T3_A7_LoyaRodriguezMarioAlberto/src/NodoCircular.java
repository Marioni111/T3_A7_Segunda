public class NodoCircular {
	private int dato;
	private NodoCircular enlace;

	public NodoCircular(int entrada) {
		dato = entrada;
		enlace = this;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public NodoCircular getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoCircular enlace) {
		this.enlace = enlace;
	}

	@Override
	public String toString() {
		return "NodoC [dato=" + dato + ", enlace=" + enlace + "]";
	}
}