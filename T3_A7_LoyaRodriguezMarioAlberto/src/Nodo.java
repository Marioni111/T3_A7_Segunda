public class Nodo {

	private int dato;
	private Nodo adelante;
	private Nodo atras;

	public Nodo(int dato) {
		this.dato = dato;
		adelante = atras = null;

	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getAdelante() {
		return adelante;
	}

	public void setAdelante(Nodo adelante) {
		this.adelante = adelante;
	}

	public Nodo getAtras() {
		return atras;
	}

	public void setAtras(Nodo atras) {
		this.atras = atras;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", adelante=" + adelante + ", atras=" + atras + "]";
	}
}