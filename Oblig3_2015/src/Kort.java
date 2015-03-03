import java.util.ArrayList;

//En konstruktør som setter alle datamedlemmer til ønskede verdier  La klassen selv generere unike kortnummer (bruk en static variabel). 
public abstract class Kort {
	String navn;
	String forNavn;
	String etterNavn;
	int pinKode;
	boolean aksessKode;
	static int kortNummer;
	static int kNummer;
	
	
	public Kort(String navn,String forNavn, String etterNavn, int pinKode, boolean aksessKode, int kortNummer ){
		this.navn = (forNavn + etterNavn);
		this.forNavn = forNavn;
		this.etterNavn = etterNavn;
		this.etterNavn = etterNavn;
		this.pinKode = pinKode;
		aksessKode = false;
		kNummer = 1;
		bestemKortnummer();
}
	//La klassen selv generere unike kortnummer (bruk en static variabel).
	static void bestemKortnummer() {
		kNummer++;
		kortNummer = kNummer;
}

	//Metoden getNavn() som returnerer kortholders navn, returtype String
	public String getNavn(){
		return (navn);
}
	//En toString() metode som skriver ut alle kortets datamedlemmer, returtype String
		public String toString() {
			return ( " Navn på kortholder: " + this.navn +",," + "kortnummer:" + kortNummer +",,"
					+ "Pinkode: " + this.pinKode + ",," + "sperret Kort: " + aksessKode);
			
			}
	//Metoden isSperret() som returnerer om kortet er sperret eller ikke, returtype boolean
	public boolean isSperret(){
		return false;
	}

	}
