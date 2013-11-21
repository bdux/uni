/** Diese Klasse berechnet berechnet die Anzahl der Tage in einem Jahr mit Hilfe einer einzigen bedingten Anweisung 
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */

public class Aufgabe42b { 

	 /**
     * Aufgabe 4.2b
	 * Die Methode tageimJahr berechnet die Anzahl der Tage in einem Jahr
     * @param jahr ist das gegebene Jahr
     * @return gibt die Anzahl der Tage im Jahr aus
     */

	 static int tageImJahr(int jahr) {
    	if  (((jahr % 4 == 0) & (jahr % 100 != 0)) | ((jahr % 4 == 0) & (jahr % 100 == 0) & (jahr % 400 == 0))) {
			return 366;		// Schaltjahr
		}
		
		else {
			return 365; 	// kein Schaltjahr
		}
	}
	
	/**
	 * Methode tageimJahrKurzform ist eine verkuerzte Variante, die darauf beruht, dass durch 400 teilbare Jahre immer auch durch 100 und durch 4 teilbar sind
	*/
	
	static int tageImJahrKurzform(int jahr) {
    	if  (((jahr % 4 == 0) & (jahr % 100 != 0)) |  (jahr % 400 == 0)) {
			return 366;		// Schaltjahr
		}
		
		else {
			return 365; 	// kein Schaltjahr
		}
	}

	/**
	* Methode main dient zur schriftlichen Ausgabe des Werts
	*/
	public static void main(String[] args) {
	System.out.println("Tage im Jahr: " + tageImJahr(2000));
	System.out.println("Tage im Jahr (Kurzform): " + tageImJahrKurzform(1900));
	}
}
