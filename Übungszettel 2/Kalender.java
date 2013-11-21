/**
 * @author Benjamin Dux & Daniel ?
 * @version .1
 * 
 */
public class Kalender {

    /**
	 * Gibt aus, welcher Tag der Woche ein gewähltes Datum ist.
	 * @param tag Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Tag
     * @param monat Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Monat
     * @param jahr Übergeben aus dem Methodenaufruf aus main, das zu Berechnende Jahr
	 * @param wt Hilfsvariable für return. Man könnte die Berechnung auch direkt nach return schreiben, so ist es aber schöner.
     * @return Errechnet den Wochentag als Ganzzahl bei Aufruf aus der main Methode mit Übergabe der Parameter für Tag, Monat, Jahr
     */
    static int ermittleWochentag(int tag, int monat, int jahr) {
			
			int wt;
		
				wt=(tag+2*monat+((3*monat+3)/5)+jahr+(jahr/4)-((jahr/100)-(jahr/400)-2))%7; //Rechnung aus dem Übungsblatt.
		
		 return wt; 
    }

    /**
     * Gibt aus, ob ein gewähltes Jahr ein Schaltjahr ist oder nicht. Zugrunde liegt die Berechnung des gregorianischen Kalenders.
     * @param jahr
	 * @param tage Hilfsvariable zur Berechnung der Anzahl der Tage des Jahres
     * @return Gibt den Inhalt der Variablen tage zurück
     */
    static int tageImJahr(int jahr) {
        int tage;
		
			if (jahr % 4 !=0)			//Wenn das Jahr nicht durch 4 Teilbar ist
						
						tage=365;		//ist es kein Schaltjahr und hat 365 Tage
			else
			
				if (jahr % 100 !=0)		//Wenn das Jahr nicht durch 100 Teilbar ist
						
						tage=366;		//ist es ein Schaltjahr und hat 366 Tage
				else 
				
					if (jahr % 400 !=0)	//Wenn das Jahr nicht durch 400 Teilbar ist
						
						tage=365;		//ist es kein Schaltjahr und hat 365 Tage
					else
						
						tage=366;		//und wenn doch, ist es eins ;)
		
		return tage; 					//gibt tage an die aufrufende Methode zurück
		
    }

    /**
	 * Gibt die Anzahl der Tage eines gewählten Monats in Abhängigkeit Schaltjahr/nicht Schaltjahr aus.
     * @param monat Übergeben aus dem Methodenaufruf, der zu Berechnende Monat
     * @param jahr Übergeben aus dem Methodenaufruf, das zu Berechnenden Jahr
	 * @param wd Hilfsvariable zur Berechnung der Wochentage
     * @return gibt den Inhalt der Hilfsvariablen wd aus, die die Anzahl der Wochentage beinhaltet
     */
    public static int tageImMonat(int monat, int jahr){
        
		int wd;											//initialisieren von wd
		
			if (tageImJahr(jahr) ==365 && monat ==2) 	//wenn das Jahr der zu berechnenden Monatstage 365 Tage hat, UND der Monat Februar ist
			
					wd=28; 							 	//dann ist die Anzahl der Monatstage 28
			else
				if (tageImJahr(jahr) ==366 && monat==2)	//wenn das Jahr der zu berechnenden Monatstage 366 Tage hat, UND der Monat Februar ist
					
					wd=29;								//dann ist die Anzahl der Monatstage 29
				
				else
				
					if ((monat<8 && monat%2!=0))		//Wenn der Monat kleiner als August ist, und ein Ungerader

					wd=31;								//dann hat er 31 Tage
					
					else
						
						if ((monat>=8 && monat%2==0))	//Wenn der Monat größer und gleich August ist, und ein Gerader
					
					wd=31;								//dann hat er auch 31 Tage
					
						else
					
					wd=30;								//alle anderen Monate haben 30 Tage
	
	return wd; 											//wd wird and die aufrufende Methode zurückgegeben
    }

    /**
	 * Gibt aus, der wievielte Tag des Jahres ein gewähltes Datum ist.
	 * @param tag Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Tag
     * @param monat Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Monat
     * @param jahr Übergeben aus dem Methodenaufruf aus main, das zu Berechnende Jahr
     * @param moy Hilfsvariable zur Berechnung des Monats in der while Schleife
	 * @param summetage Hilfsvariable zur Berechnung der Summe der Tage im Jahr.
	 * @return gibt nach Beendigung summetage an die aufrufende Methode zurück
     */
    public static int tagDesJahres(int tag, int monat, int jahr){
        
		int moy = 1;										//Initialisieren von moy mit 1
		
		int summetage = -1; 								//Initialisieren von summetage mit -1, sonst ist einer Zuviel...
		
		while (moy < monat) {								//Während moy kleiner als der Monat aus dem Methodenaufruf ist
		
			summetage=summetage+(tageImMonat(moy,jahr));	//Addiere den Wert aus tageImMonat für den Entsprechenden Monat zu summetage und setze summetage auf das Ergebnis
		
			moy=moy+1;										//Addiere 1 zu moy und setze moy auf das Ergebnis
		
															//hier entspricht summetage dem aktuellen Monat -1
		}
		
		summetage=summetage+tag; 							//deshalb addieren wir hier den Wert der Parametervariablen tag zu summetage um das richtige Ergebnis zu bekommen.
					
		return summetage;									//summetage wird an die aufrufende Methode zurückgegeben
    }

    /**
     * Gibt die Anzahl der Tage von einem gewählten Datum bis Heiligabend aus.
     * @param tag Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Tag
     * @param monat Übergeben aus dem Methodenaufruf aus main, der zu Berechnende Monat
     * @param jahr Übergeben aus dem Methodenaufruf aus main, das zu Berechnende Jahr
     * @return Berechnung der Tage des Jahres bis zum 24.12. des aufgerufenen Jahres, oder des nächsten jahres falls das Datum > 24.12.jahr ist, davon subtrahiert die Anzahl der Tage des aktuellen Datums (bzw. dessen was in der main aufgerufen wird, hier, der 28.10.2013
	 *			Falls das angegebene Datum nach Weihnachten des aktuellen Jahres ist, wird die Anzahl der Tage bis zum 24.12. des nächsten Jahres berechnet.
     */
    public static int tageBisWeihnachten(int tag, int monat, int jahr){
        
		int xmaseta = tagDesJahres(24,12,jahr) - tagDesJahres(tag,monat,jahr);		// Vorberechnung eines Werts für Tage bis Weihnachten
			
			if (xmaseta > 0)														// Überprüfung, ob der berechnete Wert negativ ist (angegebnes Datum nach Weihnachten des aktuellen Jahres)
				
				xmaseta = xmaseta;													// ist dem nicht so, wird xmaseta ausgegeben -> return
				
			else
				
				if (tageImJahr(jahr+1) == 366)										// Wenn nicht, wird überprüft ob das folgejahr ein Schaltjahr ist
					
				xmaseta = 366 + xmaseta;											// falls ja wird xmaseta zu 366 addiert, was einer Subtraktion entspricht (xmaseta ist negativ)
				
				else
				
				xmaseta = xmaseta + 365;											// falls ja wird xmaseta zu 366 addiert, was einer Subtraktion entspricht (xmaseta ist negativ) 
				
		return xmaseta;																// xmaseta wird zurückgegeben
		
    }

    /**
     * Gibt den Namen des angegbenen Wochentags aus. Die Woche beginnt an einem Samstag.
     * @param tag der Wochentag, dessen Name ausgegeben werden soll. Die Nummerierung der Wochentage liegt im Bereich 0-6.
     * @return den Namen des Wochentags oder Ungueltiger Wochentag, falls ein Tag außerhalb des Bereichs 0-6 angegeben wurde.
     */
    static String wochentagName(int tag) {
        if (tag == 0)
            return "Samstag";
        if (tag == 1)
            return "Sonntag";
        else if (tag == 2)
            return "Montag";
        else if (tag == 3)
            return "Dienstag";
        else if (tag == 4)
            return "Mittwoch";
        else if (tag == 5)
            return "Donnerstag";
        else if (tag == 6)
            return "Freitag";
        else
            return "Ungueltiger Wochentag";
    }

    /**
     * Main-Methode
     * @param args optionale Argumente
     */
    public static void main(String[] args) {
		
        // Beispiel-Ausgabe fuer den Wochentag Samstag (die Woche beginnt am Samstag mit dem Wert 0):
        System.out.println( wochentagName(0) );

        //erledigt: Ausgabe für den 24.12.2013 und den 01.05.2013
		System.out.println("Der 24.12.2013 ist ein: " + wochentagName(ermittleWochentag(24,12,2013))); //Ich war mir nicht sicher ob hier der int oder der direkte Name als Ausgabe gewünscht war. Ich hab mich für den Namen entscheiden.
		System.out.println("Der 01.05.2013 ist ein: " + wochentagName(ermittleWochentag(1,5,2013)));   //s.o.
		// Beispielausgaben
        System.out.println("Tage im Jahr 2013: "  + tageImJahr(2013));
        System.out.println("Tage im Monat Oktober 2013: " + tageImMonat(10,2013));
        System.out.println("Tag im aktuellen Jahr: " + tagDesJahres(28,10,2013));

        System.out.println("Tage bis zum naechsten Heiligabend: " + tageBisWeihnachten(28,10,2013));
		
    }
}
