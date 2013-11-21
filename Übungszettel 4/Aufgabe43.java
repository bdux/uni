/** Diese Klasse berechnet verschiedene Bitoperationen (Aufgabe 4.3)
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */
 
public class Aufgabe43 { 

	 /**
     * Aufgabe 4.3a
	 * Die Methode checkIfBitIsSet berechnet, ob ein Bit an einer bestimmten Position auf 1 gesetzt ist
     * @param bits ist der Eingabewert als Dezimalzahl
	 * @param bitPosition ist die Position des gesuchten Bits
     * @return gibt true aus, wenn das Bit auf 1 gesetzt ist
     */
	 
	static boolean checkIfBitIsSet (int bits, int bitPosition) {
		bits = bits >> (bitPosition-1); 	// man shiftet um (bitPosition-1) - bei bitPosition 1 also nicht
		int x = bits & 1;  // dann wird das letzte Bit ueberprueft
		return (x == 1);
	}
	
	 /**
     * Aufgabe 4.3b
	 * Die Methode countBitsSetToOne berechnet die Anzahl der auf 1 gesetzten Bits einer Ganzzahl
     * @param bits ist der Eingabewert als Dezimalzahl
	 * @return gibt die Summe der auf 1 gesetzten Bits aus
     */
	static int countBitsSetToOne(int bits) {
		int bitPosition = 32;		// Anfangsposition 32, da int 32 Bits hat
		int zaehler = 0;		
		while (bitPosition >= 1) {			
			if ( checkIfBitIsSet(bits,bitPosition) == true ) {	 // falls das Bit auf 1 gesetzt ist...
				zaehler = zaehler + 1;		// ...wird der Zaehler um 1 erhoeht
			}
			bitPosition = bitPosition - 1; 	// Vorgang wird eine Position weiter wiederholt (bis Position 1 erreicht ist)
		}
		return zaehler; 
	}
	
		 /**
     * Aufgabe 4.3c
	 * Die Methode countLongestSequenceOfBitsSetToOne ermittelt aus einer Zahl die längste zusammenhängende Kette aus bits die den Wert 1 haben
     * @param bits ist der Eingabewert als Dezimalzahl
	 * @return gibt die längste Kette der auf 1 gesetzten Bits aus
     */
	static int countLongestSequenceOfBitsSetToOne(int bits) {
		int bitPosition = 32; 	//s.o.
		int c1 = 0;
		int c0 = 0;
		int ketteout = 0;
				
		for (int i=32; i > 0; i--) {				//for-Schleife für die Berechnung
			if (checkIfBitIsSet(bits,bitPosition) == true) {	//Überprüfen, ob die Bitposition 1 ist
				c1 = c1 + 1;				//Wenn ja, den Zähler um 1 erhöhen, und Ausgabevariable auf Zaehler setzen
				ketteout = c1;
			}
			
			else if (c0<c1) {	//Wenn nein, den Zaehler zurücksetzen und Vergleichsvariable hochzählen. Hier wird Verglichen, ob eine neue Kette länger ist als die bereits vorhandene.
			
				c1 = 0;
				c0 = c0 + 1;
			}
			bitPosition = bitPosition - 1; //s.o.
		}
		
		return ketteout; 
	}
	
	/**
     * Aufgabe 4.3d
	 * unvollständig!
	 * Die Methode containsBitPattern überprüft für eine Ganzzahl ob in deren Binärdarstellung eine bestimmte Folge von Bits auftritt.
     * @param bits ist der Eingabewert als Dezimalzahl
	 * @param bitPattern ist der Eingabewert für das zu suchende Muster
	 * @return gibt an, ob das gesuchte Muster in der angegebenen Zahl vorhanden ist
	 */
	static boolean containsBitPattern(int bits, int bitPattern) {
		int bitPosition = 0;
		int bitpatternsize = findHighestBit(bitPattern);		
		int bitsize = findHighestBit(bits);
		boolean a = true;

			while (bitPosition <= bitsize) {
		
				
		
				bitPosition = bitPosition + 1;
			}
		return a; 
	}
	
	
	/**
	* Die Methode bestimmt für eine Ganzzahl bits die Position des höchstwertigsten auf 1 gesetzten Bit
	* @param bits ist der Eingabewert als Dezimalzahl
	* @return gibt das höchste auf 1 gesetzte Bit an
    */
	
	static int findHighestBit(int bits) {
		int bitPosition = 0; 	//s.o.
		int highestbit = 0;
				
		for (int i=0; i < 32; i++) {				//for-Schleife für die Berechnung
			if (checkIfBitIsSet(bits,bitPosition) == true) {	//Überprüfen, ob die Bitposition 1 ist
				
				highestbit = bitPosition;
			}
					
		bitPosition = bitPosition + 1;
		
		}
	
	return highestbit;
	}

	/**
	* Erzeugt eine Ganzzahl, in deren Binärdarstellung jedes Bit mit einer Position <= highestBit auf 1 gesetzt ist
	* @param bits ist der Eingabewert als Dezimalzahl
	* @return gibt das höchste auf 1 gesetzte Bit an
    */	
	
	static int createBitmask(int highestbit) {
		
		int bitPosition = 0;
		int bin = 0;
		for (int i=1; i<=findHighestBit(highestbit); i++) {
			
			bin = (bin << 1) + 1;
			bitPosition = bitPosition + 1;
		}
		return bin;
	}
	
	
	
	
	
	
	/**
	* Methode main dient zum Testen der oberen Methoden
	*/
	public static void main(String[] args) {
		System.out.println("Bit von 1 an Position 1: " + checkIfBitIsSet(1,1));
		System.out.println("Bit von 2 an Position 1: " + checkIfBitIsSet(2,1));
		System.out.println("Bit von 10 an Position 4: " + checkIfBitIsSet(10,4));
		System.out.println("Summe der auf 1 gesetzten Bits von 1: " + countBitsSetToOne(1));
		System.out.println("Summe der auf 1 gesetzten Bits von 3: " + countBitsSetToOne(3));
		System.out.println("Summe der auf 1 gesetzten Bits von 17: " + countBitsSetToOne(17));
		System.out.println("Summe der auf 1 gesetzten Bits von 3309: " + countBitsSetToOne(3309));
		System.out.println("Summe der auf 1 gesetzten Bits von 21845: " + countBitsSetToOne(21845));
		System.out.println("Summe der auf 1 gesetzten Bits von 2147483647: " + countBitsSetToOne(2147483647));
		System.out.println("Laengste Kette der auf 1 gesetzten Bits von 1: " + countLongestSequenceOfBitsSetToOne(1));
		System.out.println("Laengste Kette der auf 1 gesetzten Bits von 3: " + countLongestSequenceOfBitsSetToOne(3));
		System.out.println("Laengste Kette der auf 1 gesetzten Bits von 17: " + countLongestSequenceOfBitsSetToOne(17));
		System.out.println("Laengste Kette der auf 1 gesetzten Bits von 3309: " + countLongestSequenceOfBitsSetToOne(3309));
		System.out.println("Das hoechste auf 1 gesetzte Bit von 1	: " + findHighestBit(1));
		System.out.println("Das hoechste auf 1 gesetzte Bit von 3	: " + findHighestBit(3));
		System.out.println("Das hoechste auf 1 gesetzte Bit von 17	: " + findHighestBit(17));
		System.out.println("Das hoechste auf 1 gesetzte Bit von 3309: " + findHighestBit(3309));
		System.out.println("Bitmaske von 5: " + createBitmask(5));
		System.out.println("1 enthaelt das Muster 1: " + containsBitPattern(1,1));
		System.out.println("1 enthaelt das Muster 11: " + containsBitPattern(1,11));
		System.out.println("157 enthaelt das Muster 1001: " + containsBitPattern(157,1001));
		System.out.println("2461 enthaelt das Muster 111: " + containsBitPattern(2461,110));
	}
}
