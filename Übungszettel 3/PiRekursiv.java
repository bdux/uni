/** Diese Klasse berechnet die Annaeherung von Pi rekursiv (Aufgabe 3.4)
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */
public class PiRekursiv{
	
	/**
	* Methode quadraticFractionSum berechnet die Quadratbruchsumme von counter
	* @param counter ist die Anzahl der Schritte der Annaehrung
	* @return 
	*/
	static double quadraticFractionSum(double counter){
	 if (counter == 2)
		return (1/(counter*counter))+(1/(counter-1)*(counter-1));
	else
		return (1/(counter*counter))+quadraticFractionSum(counter-1);
}

	/**
	* Methode main dient zur schriftlichen Ausgabe des Werts
	*/
	public static void main(String[] args) {
	System.out.println("pi ist ungefaehr " + Math.sqrt(6 *(quadraticFractionSum(1000))));	
 	}
}
