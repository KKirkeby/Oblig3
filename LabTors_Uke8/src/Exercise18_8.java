import java.util.Scanner;

import java.util.Scanner;

public class Exercise18_8 {
	/**Main metode */
	public static void main(String[] args){
	
		// Opretter skanner objekt 
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv in antall skiver: " );
		int n = input.nextInt();
		
		//Finn løsningen rekursivt 
		System.out.println("Trekkene er: ");
		flyttSkiver(n, 'A','B','C');
		
		System.out.println("Antall trekk er totalt: " + teller);
		}
	static int teller = 0;
	
/** metoden for finne løsningen til å flytte n skiver
	fra fromTower til toTower med auxTower*/
	
	public static void flyttSkiver(int n, char fraTarn,
			char tilTarn, char auxTarn) {
		teller++;
		if(n==1) // Stopper tilstaden
			System.out.println("Flytt skive " + n + " fra " +
		fraTarn + " til " +tilTarn);
		else {
			flyttSkiver(n - 1, fraTarn, auxTarn, tilTarn);
		System.out.println( "Flytt Skive " + n + " fra " +
			fraTarn + " til " + tilTarn);
		flyttSkiver(n - 1, auxTarn, tilTarn, fraTarn);
	}}}
	
