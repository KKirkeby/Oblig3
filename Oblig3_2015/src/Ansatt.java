import java.util.Calendar;
import java.util.Date;

public class Ansatt extends Kort {
	
	public Ansatt(String navn, int pinKode){
		super(navn, pinKode);
	}

//En ansatt sitt kort er alltid gyldig i kontortiden, mellom kl 0700 og 1700 på hverdagene. Utenfor kontortid må den 
//ansatt taste sin PIN kode, men kortet utløper ikke på tid.

	
	private boolean isWeekDay(Calendar calendar){
		final int sunday = 1;
		final int saturday = 7;
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek == sunday || dayOfWeek == saturday)
			 return true;
		 
		 return false;
	}
	
	private boolean isOutOfOfficeHours(Calendar calendar){
		final int beforeHours = 7;
		final int afterHours = 17;
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		if(hourOfDay > afterHours || hourOfDay < beforeHours)
			 return true;
		 
		 return false;
	}
	
	private boolean NeedToUsePinCode(Calendar calendar){
		 return isOutOfOfficeHours(calendar) || isWeekDay(calendar);
	}
	
	@Override
	boolean checkPIN(int pin) {
		
		return false;
	}

	 @Override
     public void kortInfo() {
 		System.out.printf("Kort informasjon", super.getNavn());
 		System.out.println();
 		
	 }
 		
 		protected void setCalendar(Calendar calendar) {
 			this.calendar = calendar;
 		}
 		protected Calendar calendar = Calendar.getInstance();
 		
	//Sperrede kort skal ikke gi tilgang hverken for ansatte eller gjester.
	//boolean checkPIN(int pin){
		//Calendar calendar = Calendar.getInstance();
	  //if(isSperretKort())
		      //return false;
		// if(pinIsCorrect(calendar) || noPinNeeded(calendar))
		      // return true;
	}



	

		
	// checkPPIN
	// hasPin?
	// If no, does the person need pin?
	// if no pin needed, return true
	// if pin needed, return false
	// if pin is given, is the pin correct?
	// if yes, return true, if no, return false*/
	