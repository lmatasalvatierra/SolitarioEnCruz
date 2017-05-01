/**
 * La clase Movimiento representa un movimiento del solitario en cruz, mantenido éste como
 * la celda origen, la celda que se salta y la celda destino.
 * @version 1.0, (c)2015
 * @author Algoritmica Y Complejidad (Plan 2014)
 */

public class Movimiento {
	private Posicion origen;
	private Posicion salto;
	private Posicion destino;

	/**
	 * Construye e inicializa un objeto Movimiento con los valores origen, salto y destino indicados como parámetros
	 * @param origen objeto Posicion que identifica la celda origen del salto
	 * @param salto objeto Posicion que identifica la celda que se salta
	 * @param destino objeto Posicion que identica la celda destino del salto
	 */
	public Movimiento(Posicion origen, Posicion salto, Posicion destino) {
		this.origen = origen;
		this.salto = salto;
		this.destino = destino;
	}

	/**
	 * Devuelve el la posicion origen de este Movimiento
	 * @return la Posicion origen asociada a este objeto Movimiento
	 */
	public Posicion getOrigen() {
		return origen;
	}

	/**
	 * Devuelve el la posicion que se salta en este Movimiento
	 * @return la Posicion que se salta asociada a este objeto Movimiento
	 */
	public Posicion getSalto() {
		return salto;
	}

	/**
	 * Devuelve el la posicion destino de este Movimiento
	 * @return la Posicion destino asociada a este objeto Movimiento
	 */
	public Posicion getDestino() {
		return destino;
	}

	/**
	 * Devuelve una representación de este objeto Movimiento en formato cadena de caracteres.
	 * @return representación en formato cadena de caracteres de este Movimiento
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("{canica en celda: "+origen);
		sb.append(", salto hueco: "+salto);
		sb.append(", hasta celda destino:"+destino+ "}\n");
		
		return sb.toString();
	}
}
