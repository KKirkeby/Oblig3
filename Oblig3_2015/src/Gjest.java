import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Gjest extends Kort {

	public Gjest(String navn, int pinKode){
		super(navn, pinKode);
	}

	//En gjest får utlevert et kort hvor kortinnehaver alltid oppgir PIN kode 9999, men kortet er begrenset 
	//på tid ved at gjestekort varer en uke fra det tidspunkt det ble laget.
	
	
	public boolean isCardValid(Calendar calendar){
		final int days = 7;
		int validDays = calendar.get(Calendar.DAY_OF_MONTH);
		if (validDays > days)
			return true;
		
		return false;
	
	}
	
	
	@Override
	boolean checkPIN(int pin) {
		
		
		return false;
	}
}
