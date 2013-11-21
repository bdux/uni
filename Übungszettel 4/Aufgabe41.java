/** Diese Klasse berechnet die Binaerdarstellung einer Dezimalzahl (Aufgabe 4.1a)
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */

public class Aufgabe41 { 

	 /**
     * Aufgabe 4.1a
	 * Die Methode printBinary wandelt eine Dezimalzahl nach dem Horner-Schema in eine Binaerzahl um
     * @param number ist der Eingabewert als Dezimalzahl
	 * @return gibt die Binaerzahl aus
     */

	static void printBinary(long number){
      if (number == 0) {
		return ;
		}
	 else
		System.out.print (number % 2);
		number = number / 2;
		printBinary(number);
	}
	
	
	/**
     * Aufgabe 4.1b
	 * Die Methode printNumberSystem wandelt eine Dezimalzahl nach dem Horner-Schema in eine Zahlensystem beliebiger Basis um
     * @param number ist der Eingabewert als Dezimalzahl
	 * @param basis ist die Basis des gewuenschten Zahlensystems
	 * @return gibt die Zahl im gewuenschten Zahlensystem aus
     */
	
	static void printNumberSystem(long number, int basis){
	if (number == 0) {
		return ;
		}
	 else
		System.out.print (number % basis);
		number = number / basis;
		printNumberSystem(number, basis);
	}


	/**
	* Methode main dient zur schriftlichen Ausgabe des Werts
	*/
	public static void main(String[] args) {
	 printBinary(6);	
	 System.out.println();
	 printNumberSystem(12345,10);
	}
}
