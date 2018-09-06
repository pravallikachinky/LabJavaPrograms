package lab3prg;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Prm3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter frm=	DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date="06/11/1996";
        LocalDate obj=LocalDate.parse(date,frm);
		DateTimeFormatter frm1=	DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1="13/12/1998";
        LocalDate obj1=LocalDate.parse(date1,frm1);
        Period mon1= Period.between(obj, obj1);

        System.out.println("DAYS:" +mon1.getDays());
        System.out.println("MONTHS:" +mon1.getMonths());
        System.out.println("YEARS:" +mon1.getYears());



	}

}
