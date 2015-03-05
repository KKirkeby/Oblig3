import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class KortTest {
	 public static void main(String[] args) {
		 
		
		    ArrayList<Kort> reg = new ArrayList<Kort>();
	        
	        //Test av isWeekDay and isOutOfOfficeHours in Ansatt
		    
		    Calendar calendar = Calendar.getInstance();
			 Kort k3 = new Ansatt("Kristian Kirkeby", 1234);
			 k3.setCalendar(calendar);
			 
	        Kort k1 = new Ansatt("Ole Olsen", 1234);
	        Kort k2 = new Gjest("Marit Olsen", 9999);
	        reg.add(k1);
	        reg.add(k2);
	        for (int i=0; i<reg.size(); i++) {
	            Kort kort = (Kort)reg.get(i);
	            System.out.println(kort);
	            
	            System.out.println();
	            System.out.println("\nTest av kort: med kode 1234 er" + (kort.checkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
	            System.out.println("\nTest av kort: med kode 9999 er" + (kort.checkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
	            
	        }
	       
	        java.util.Date dateCreated = new java.util.Date();
			System.out.println("Kort brukt første gang : " + dateCreated.toString());
	    }
}
