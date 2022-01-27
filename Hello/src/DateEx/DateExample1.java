package DateEx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample1 {

	public static void main(String[] args) throws ParseException {
		
		Date D=new Date();
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		//to show the date to endUser
		System.out.println(f.format(D));
		String dt="2021-12-23";
		//convert string to date format
		Date Dt1=f.parse(dt);
		SimpleDateFormat f1=new SimpleDateFormat("dd-MMM-yyyy");
		//Date to String
		System.out.println(f1.format(Dt1));

	}

}
