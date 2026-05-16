import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03_LocalTimeApp{
	public static void main(String[] args){


	// instanciando um localtime
	LocalTime time1 = LocalTime.of(23, 10, 15);

	//instanciando hora atual
	LocalTime time2 = LocalTime.now();
	System.out.println("\nHora atual");
	System.out.println(time2);


	//instanciando hora atual com os segundos zerados
	LocalTime time3 = LocalTime.now().withSecond(0).withNano(0);
	System.out.println("\nHora atual sem segundos");
	System.out.println(time3);

	//instanciando através de String
	LocalTime time4 = LocalTime.parse("00:00:00");
	System.out.println("\nInstanciando hora atraves de String");
	System.out.println(time4);

	//instanciando através de String estranhas
	LocalTime time5 = LocalTime.parse("10-22-31", DateTimeFormatter.ofPattern("HH-mm-ss"));
	System.out.println("\nInstanciando hora atraves de String estranhas");
	System.out.println(time5);
	}
}