public class ListaDobleEnlazada {

	private Nodo nodoInicio;
	private Nodo nodoFin;

	public ListaDobleEnlazada() {

		nodoFin = nodoInicio = null;

	}

	public void insertarCabezaLista(int dato) {
		Nodo nuevo;
		nuevo = new Nodo(dato);
		nuevo.setAdelante(nodoInicio);
		if (nodoInicio != null)
			nodoInicio.setAtras(nuevo);
		nodoInicio = nuevo;

	}

	public void mostrarElementos() {
		Nodo nodoActual = nodoInicio;

		while (nodoActual != null) {
			System.out.print("[" + nodoActual.getDato() + "]-->");
			nodoActual = nodoActual.getAdelante();
			
		}
		System.out.println();
	}

	public void eliminarElemento(int dato) {
		Nodo actual = nodoInicio;
		boolean en = false;

		while ((actual != null) && (!en)) {
			en = (actual.getDato() == dato);
			if (!en) {
				actual = actual.getAdelante();
			}
		}

		if (actual != null) {
			if (actual == nodoInicio) {
				
				nodoInicio = actual.getAdelante();
				if (actual.getAdelante() != null) {
					actual.getAdelante().setAtras(null);
				}
			} else if (actual.getAdelante() != null) {
				
				actual.getAtras().setAdelante(actual.getAdelante());
				actual.getAdelante().setAtras(actual.getAtras());
			} else {
				
				actual.getAtras().setAdelante(null);
				actual = null;
			}
		}

	}
}