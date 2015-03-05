import java.util.Scanner;


public class SnuTekst {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn et orrd til reversering: ");
		String str = input.nextLine();
		System.out.println();
		baklengs(str);
		
	}
	
		static int count = 1;
	    public static void baklengs (String tekst){
	        if(tekst.length()==0)
	        	return;
	        else {
	        	count++;
	        }
	
	        System.out.println("Strengen skrevet ut bakleng: "+ (tekst.length() - 1) + count);
	        baklengs(tekst.substring(0, tekst.length() - 1));
}}

