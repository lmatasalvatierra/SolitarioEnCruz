import java.util.ArrayList;

/**
 * Esta es la clase principal (aplicacion) del juego del solitario en cruz resuelto mediante el esquema de backtracking.
 * @version 1.0, (c)2015
 * @author Algoritmica Y Complejidad (Plan 2014)
 */

public class Solitario {

	/**
	 * El constructor de esta clase crea el Tablero con la situación inicial del juego, crea la estructura de datos
	 * ArrayList de objetos Movimiento donde deberá devolverse la solución del juego (si se encuentra), hace la llamada al
	 * método de backtracking que busca la solucion y, finalmente imprime el tiempo empleado por el método de backtracking y
	 * los movimientos y los distintos tableros por los que se ha llegado a la solución (si se ha encontrado).
	 */
	public Solitario(){
		Tablero tablero = new Tablero();
		ArrayList<Movimiento> solucion = new ArrayList<Movimiento>();
		Booleano exito = new Booleano(false);
		//tablero.imprimirTablero();


		long t1 = System.currentTimeMillis();		
		buscarSolucion(tablero, solucion, exito);
		long t2 = System.currentTimeMillis();		
		
		if(exito.getValor()){
			System.out.print("Solucion encontrada en " + (t2 - t1) + " [ms], ");
			System.out.println("con " + solucion.size()+" movimientos:");
			System.out.println();
			imprimirSolucion(solucion);
		} else {
			System.out.println("Solucion no encontrada");
		}
	}

	/**
	 * Metodo que busca la solucion del solitario en cruz mediante el esquema de backtracking
	 * @param tablero estado actual del tablero de juego
	 * @param solucion Lista que mantiene los movimientos que forman parte de la solucion del solitario
	 * @param exito indicará si se ha encontrado solucion del solitario
	 */
	private void buscarSolucion(Tablero tablero, ArrayList<Movimiento> solucion, Booleano exito){
		ArrayList<Movimiento> posiblesMovimientos = tablero.obtenerMovimientos();
		Movimiento candidato;
		do{
			candidato = posiblesMovimientos.remove(0);
			if(tablero.esMovimientoValido(candidato)){
				tablero.anotarMovimiento(candidato);
				solucion.add(candidato);
				if (tablero.esSolucion())
					exito.setValor(true);
				else {
					buscarSolucion(tablero, solucion, exito);
					if (!exito.getValor()) {
						tablero.desanotarMovimiento(candidato);
						solucion.remove(candidato);
					}
				}

			}
		}while ((!exito.getValor()) && posiblesMovimientos.size()>0);
	}

	/**
	 * Dado el tablero origen del solitario, y la lista de pasos que llevan a solucionarlo, este método
	 * imprime por consola los pasos y todos y cada uno de los tableros intermedios que nos llevan a la
	 * solucion.
	 * @param solucion Lista que contiene los Movimientos encontrados para solucionar el solitario en cruz
	 */
	private void imprimirSolucion(ArrayList<Movimiento> solucion){
		Tablero tablero = new Tablero(); // generamos de nuevo el tablero origen

		System.out.println("Tablero inicial:");
		tablero.imprimirTablero();

		for (int m=0; m<solucion.size(); m++){
			tablero.anotarMovimiento(solucion.get(m));
			System.out.println("movimiento " + (m+1) + ": " + solucion.get(m));
			tablero.imprimirTablero();
		}

	}

	/**
	 * Metodo principal del juego del solitario en cruz
	 * @param args argumentos de ejecucion. No se usan en esta aplicacion
	 */
	public static void main(String[] args) {
		new Solitario();
	}
}
