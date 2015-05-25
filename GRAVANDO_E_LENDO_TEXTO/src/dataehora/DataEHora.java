package dataehora;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataEHora {

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();

		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

		Date date = new Date();

		calendar.setTime(date);
		String dataEHora = out.format(calendar.getTime());
		System.out.println(dataEHora);
		
		out = new SimpleDateFormat("HH:mm:ss");
		dataEHora = out.format(calendar.getTime());
		System.out.println(dataEHora);
		
		out = new SimpleDateFormat("dd/MM/yyyy");
		dataEHora = out.format(calendar.getTime());
		System.out.println(dataEHora);
		

	}

}
