/**
 * @author Benjamin Dux & Daniel ?
 * @version .1
 * 
 */
public class Funktionen {

	/**
	* Der Algorithmus berechnet approximativ die Kreiszahl pi
	* @param a Berechnungswert
	* @param z Schrittzähler
	* @param sum Variable zur Summenspeicherung 
	* @return Approximativer Wert für die Zahl pi
	*/

	static double pi() {
		
		double a = 1;
		int z = 0;
		double sum = 0;
		
		
		while (z < 1000) {
			
		sum = sum + (1/ (a*a) * 6);		// Berechnen und Abspeichern partieller Summen
		a = a + 1;						// Erhöhen des Rechenwerts um 1
		z = z + 1;						// Erhöhen des Schrittzählers um 1
		}
			
	return Math.sqrt(sum);				// Ergebnis
	
	}
			
	public static void main(String[] args) {
	System.out.println(pi());			// Ausgabe auf der Kommandozeile
	
	}
	
}