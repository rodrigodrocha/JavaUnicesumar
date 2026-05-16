import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex04_LocalTimeOperationsApp{
	public static void main(String[] args){


	// instanciando um localtime
	LocalTime time1 = LocalTime.of(15, 30);
	System.out.println(time1);
	//instanciando hora atual
	LocalTime time2 = time1.plusHours(12); //somando 12 horas -> 3:30
	System.out.println(time2);
	LocalTime time3 = time1.minusMinutes(30); //subtraindo 30 minutos -> 3:00
	System.out.println(time3);

	//transformando uma hora em um format do tipo Stringo do jeito que desejo
	String formattedTime1 = time3.format(DateTimeFormatter.ofPattern("HH mm"));
	System.out.println(formattedTime1);
	String formattedTime2 = time3.format(DateTimeFormatter.ofPattern("HH-mm"));
	System.out.println(formattedTime2);

	}
}