/** Diese Klasse definiert die Operatoren "<" und ">" fuer boolesche Werte
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */

public class Aufgabe42c { 

	 /**
     * Aufgabe 4.2c
	 * Die Methode lower berechnet, ob a < b gilt
     * @param a ist ein Eingabewert
	 * @param b ist ein Eingabewert
     * @return gibt aus, ob a < b gilt
     */
	 
	static boolean lower(boolean a, boolean b) {
	if ((a == false) & (b == true))
		return true;
	else 
		return false;
	}
	
	/**
	 * Die Methode lower berechnet, ob a > b gilt
     * @param a ist ein Eingabewert
	 * @param b ist ein Eingabewert
     * @return gibt aus, ob a > b gilt
     */	
	
	static boolean greater(boolean a, boolean b) {
	if ((a == true) & (b == false))
		return true;
	else 
		return false;
	}
		
	/**
	* Methode main dient zur schriftlichen Ausgabe des Werts
	*/
	public static void main(String[] args) {
	 	System.out.println("a < b ist " + lower(false,true));
		System.out.println("a > b ist " + greater(false,false));

	}
}
