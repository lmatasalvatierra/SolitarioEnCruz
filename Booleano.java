/**
 * La clase Booleano envuelve un valor del tipo primitivo boolean en un objeto. Un objeto de tipo Booleano contiene un único campo
 * cuyo tipo es boolean.
 * @version 1.0, (c)2015
 * @author Algoritmica Y Complejidad (Plan 2014)
 */

public class Booleano {

	private boolean valor;

    /**
     * Crea un objeto Booleano inicializado con el valor boolean (true o false) indicado como parámetro
     * @param valor el valor del Booleano
     */
	public Booleano(boolean valor) {
		this.valor = valor;
	}

    /**
     * Devuelve el valor boolean de este objeto Booleano
     * @return el valor boolean representado por este objeto
     */
	public boolean getValor() {
		return valor;
	}

    /**
     * Modifica el valor boolean de este objeto Booleano con el valor indicado como parámetro
     * @param valor nuevo valor
     */
	public void setValor(boolean valor) {
		this.valor = valor;
	}
	
}
