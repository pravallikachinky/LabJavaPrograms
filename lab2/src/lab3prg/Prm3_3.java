package lab3prg;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Prm3_3 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter frm=	DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date="06/11/1996";
        LocalDate obj=LocalDate.parse(date,frm);
        LocalDate datenow=LocalDate.now();
        Period mon= Period.between(obj, datenow);
        System.out.println("DAYS:" +mon.getDays());
        System.out.println("MONTHS:" +mon.getMonths());
        System.out.println("YEARS:" +mon.getYears());


        
	}

}
