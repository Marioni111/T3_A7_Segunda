import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ListaDobleEnlazada le = new ListaDobleEnlazada();
		ListaCircular lc = new ListaCircular();
		
		le.insertarCabezaLista(2);
		le.insertarCabezaLista(6);
		le.insertarCabezaLista(8);
		le.insertarCabezaLista(15);
		le.insertarCabezaLista(9);
		le.insertarCabezaLista(2);
		
		lc.insertarElemento(2);
		lc.insertarElemento(6);
		lc.insertarElemento(8);
		lc.insertarElemento(15);
		lc.insertarElemento(9);
		lc.insertarElemento(2);
		
		System.out.println("Selecciona: \n1)Lista doblemente enlazada \n2)Lista circular");
		int op = entrada.nextInt();
		int cont = 0;
		int elemento = 0;
		
		if(op==1){
			do{
				System.out.println("1)Mostrar elementos \n2)Agregar elementos \n3)Eliminar elemento \n4)Salir \n-----------------------------");
				op = entrada.nextInt();
				switch(op) {
					
					case 1 :
						le.mostrarElementos();
						break;
					case 2 :
						System.out.println("Ingresa el elemento que deseas agregar");
						elemento = entrada.nextInt();
						le.insertarCabezaLista(elemento);
						break;
					case 3 :
						System.out.println("Ingresa el elemento que deseas eliminar");
						elemento = entrada.nextInt();
						le.eliminarElemento(elemento);
						break;
					case 4 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==2){
			do{
				System.out.println("1)Mostrar elementos \n2)Agregar elementos \n3)Eliminar elemento \n4)Salir \n-----------------------------");
				op = entrada.nextInt();
				switch(op) {
				
					case 1 :
						lc.mostrarElementos();
						break;
					case 2 :	
						System.out.println("Ingresa el elemento que deseas agregar");
						elemento = entrada.nextInt();
						lc.insertarElemento(elemento);
						break;
					case 3 :
						System.out.println("Ingresa el elemento que deseas eliminar");
						elemento = entrada.nextInt();
						lc.eliminarElemento(elemento);
						break;
					case 4 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==3){
			System.out.println("Salir");
		}
		
	}

	
}
