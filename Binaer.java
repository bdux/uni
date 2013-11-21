
public class Binaer {
	public static void main(String[] args) {

		System.out.println(intToBin(21845));
		System.out.println("==Aufgabe 1");
		System.out.println(sortiert4(1,2,3,4));
		System.out.println(sortiert4(4,2,2,1));
		System.out.println(sortiert4(4,2,3,1));
		
		System.out.println("\n==Aufgabe 2a");
		int a1 = 9;
		System.out.println(intToBin(a1));
		int a2 = praesenz2a(a1);
		System.out.println(intToBin(a2));
		
		System.out.println("\n==Aufgabe 2b");
		int b1 = 22432;
		System.out.println(intToBin(b1));
		int b2 = praesenz2b(b1);
		System.out.println(intToBin(b2));
		
		System.out.println("\n==Aufgabe 2c");
		int c1 = 22432;
		System.out.println(intToBin(c1));
		int c2 = praesenz2c(c1,7);
		System.out.println(intToBin(c2));
	}
	
	/** Methode gibt aus ob 4 zahlen aufsteigend oder absteigend sortiert sind
     *@param a Erste Zahl
     *@param b Zweite Zahl
     *@param c Dritte Zahl
     *@param d Vierte Zahl
     *@return Waren die 4 zahlen sortiert?
     */
	public static boolean sortiert4(int a, int b, int c, int d){
		return a>=b && b>=c && c>=d || a<=b && b<=c && c<=d;
	}
	
	
	/** Methode schneidet die letzten 3 bits einer Zahl <bits> aus und gibt sie zurück
    *@param bits Zahl, von der die letzten 3 bits ausgeschnitten werden sollen
    *@return Die letzten 3 Bits von <bits>
    */
	public static int praesenz2a(int bits){
		return bits & 7;
	}
	
	
	/** Methode shiftet die bits einer beliebigen Zahl <bits> um 6 nach rechts und schneidet dann nächsten 3 bits dieser Zahl aus und gibt sie zurück
	    *@param bits Zahl, von der an ab der 7. Stelle die nächsten 3 bits ausgeschnitten werden sollen
	    *@return Die  3 Bits ab der 7. Stelle von <bits>
	    */
	public static int praesenz2b(int bits){
		bits = bits >> 6;
		return bits & 7;
	}
	
	
	/** Methode shiftet die bits einer beliebigen Zahl <bits> um <position> nach rechts und schneidet dann die nächsten 3 bits dieser Zahl aus und gibt sie zurück
	    *@param bits Zahl, von der an ab der <position>sten stelle die nächsten 3 bits ausgeschnitten werden sollen
	    *@return Die  3 Bits ab der <position>sten Stelle von <bits>
	    */
	public static int praesenz2c(int bits, int position){
		bits = bits >> (position-1);
		return bits & 7;
	}
	
	
	/** 
     * Methode, welche einen beliebigen Int-Wert x in einen String umwandelt und zurückgibt.
     * Der String kann dann über z.B.:
     * System.out.println(intToBin(6));
     * auf der Konsole ausgegeben werden. Die Methode muss nicht verstanden werden oder reproduzierbar sein. 
     * Sie funktioniert und soll euch nur als Hilfestellung dienen, falls ihr eine größere Dezimal-Zahl gerne als Binärzahl hättet.
     * @param x beliebiger int-Wert, der in eine Binärzahl umgerechnet werden soll (als String)
     * @return Eine kleiner Text, den man auf der Konsole ausgeben kann. 
     */
	public static String intToBin(int x){
		String bin="";
		int übergabe = x;
		for(int i = 1; i <= 32;i++){
			bin = (x & 1)+bin;
			x = x >> 1;
		if(i % 4 == 0 && i != 32){
			bin = "."+ bin;
		}
			
		}
		return "Dezimal: " + übergabe + "\nBinär:   " + bin;
	}
	
}
