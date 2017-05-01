/**
 * La clase Posicion representa una posición concreta en un tablero organizado en filas y columnas.
 * @version 1.0, (c)2015
 * @author Algoritmica Y Complejidad (Plan 2014)
 */

public class Posicion {
	private int fila;
	private int columna;

    /**
     * Construye e inicializa un objeto Posicion con los valores fila y columna indicados como parámetro
     * @param fila valor de la fila a asignar al nuevo objeto Posicion
     * @param columna valor de la columna a asignar al nuevo objeto Posicion
     */
	public Posicion(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}

    /**
     * Devuelve el valor de la fila de este objeto Posicion
     * @return la fila de este objeto Posicion
     */
	public int getFila() {
        return fila;
    }

    /**
     * Devuelve el valor de la columna de este objeto Posicion
     * @return la columna de este objeto Posicion
     */
	public int getColumna() {
        return columna;
    }

    /**
     * Devuelve una representación de este objeto Posicion en formato cadena de caracteres.
     * @return representación en formato cadena de caracteres de esta Posicion
     */
	public String toString() {
		return "[" + fila + "," + columna + "]";
	}

}
