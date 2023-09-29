package Trail;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {

	public static void main(String[] args) {
		//creating object for local date
		LocalDate date = LocalDate.now();
		System.out.println("Date: " + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Time: " + time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("DateTime before Formattinf: " + dateTime);
		
		DateTimeFormatter formatedDateTime1 = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		DateTimeFormatter formatedDateTime2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatedDateTime3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatedDateTime4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		DateTimeFormatter formatedDateTime5 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		String result1=dateTime.format(formatedDateTime1);
		String result2=dateTime.format(formatedDateTime2);
		String result3=dateTime.format(formatedDateTime3);
		String result4=dateTime.format(formatedDateTime4);
		String result5=dateTime.format(formatedDateTime5);
		
		System.out.println("**********************");
		System.out.println("DateTime After Formattinf: " + result1);
		System.out.println("**********************");
		System.out.println("DateTime After Formattinf: " + result2);
		System.out.println("**********************");
		System.out.println("DateTime After Formattinf: " + result3);
		System.out.println("**********************");
		System.out.println("DateTime After Formattinf: " + result4);
		System.out.println("**********************");
		System.out.println("DateTime After Formattinf: " + result5);
		System.out.println("**********************");

	}

}
