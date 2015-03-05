import java.util.ArrayList;
import java.util.Calendar;

//En konstruktør som setter alle datamedlemmer til ønskede verdier  La klassen selv generere unike kortnummer (bruk en static variabel). 
public abstract class Kort {
	protected String navn;
	protected int pinKode;
	protected String forNavn;
	protected String etterNavn;
	protected boolean sperretKort = false;
	protected int kortNummer;
	protected static int sisteKortNummer;
	
	
	public Kort(String navn, int pinKode){
		this.navn = (forNavn + etterNavn);
		this.pinKode = pinKode;
		this.forNavn = forNavn;
		this.etterNavn = etterNavn;
		sisteKortNummer = 0;
		bestemKortnummer();
}
	
	protected void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	protected Calendar calendar = Calendar.getInstance();
	
	public void kortInfo() {
		System.out.printf("Kort informasjon %1$s", getNavn());
		System.out.println();
		
	}

	//La klassen selv generere unike kortnummer (bruk en static (sisteKortnummer) variabel).
	public void bestemKortnummer() {
		sisteKortNummer++;
		kortNummer = sisteKortNummer;
}

	//Metoden getNavn() som returnerer kortholders navn, returtype String
	public String getNavn(){
		return (navn);
}

	
	protected int getPinKode() {
		return pinKode;
	}
	//Metoden isSperret() som returnerer om kortet er sperret eller ikke, returtype boolean
	
	protected boolean isSperretKort() {
		return sperretKort;
	}

	abstract boolean checkPIN(int pin);
	
	}

	
		
	
	
	
	
