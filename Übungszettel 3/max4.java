/** Diese Klasse berechnet das Maximum von vier ganzen Zahlen (Aufgabe 3.1 a)
 * @author Benjamin Dux
 * @author Markus Huettenberger
 * @author Daniel Pfaller
 * @version 1.0
 */
public class max4 {

	/** Die Methode max2 berechnet das Maximum von zwei ganzen Zahlen.
	* @param x ist die erste Zahl 
	* @param y ist die zweite Zahl
	* @return Maximum von x und y
	*/
	static int max2(int x, int y) { 
		if (x > y){ 
			return x; 
		}
		return y; 
	}
	
	/**
	* Die Methode max3 berechnet das Maximum von drei ganzen Zahlen.
	* @param a ist die erste Zahl
	* @param b ist die zweite Zahl
	* @param c ist die dritte Zahl
	* @return Maximum von a, b und c
	*/
	static int max3(int a, int b, int c) {
		return max2(a, max2(b,c));
	}

	/**
	* Die Methode max4 berechnet das Maximum von vier ganzen Zahlen.
	* @param n ist die erste Zahl
	* @param m ist die zweite Zahl
	* @param o ist die dritte Zahl
	* @param p ist die vierte Zahl
	* @return Maximum von n, m, o und p
	*/
	static int max4(int n, int m, int o, int p) {
		return max2(n,max3(m,o,p));
	}

	public static void main(String[] args) {
	System.out.println("Das Maximum ist " + max4(11,2013,42,23));	
	}
}