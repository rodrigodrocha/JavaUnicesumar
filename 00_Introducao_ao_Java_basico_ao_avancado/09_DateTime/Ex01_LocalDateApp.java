import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01_LocalDateApp {
	
	public static void main(String[] args){

	//Instanciando uma data
	//                            ano, mes, dia
	LocalDate date = LocalDate.of(2050, 1, 1);
	System.out.println(date);

	//Instanciando a partir de uma String
	LocalDate date2 = LocalDate.parse("2050-01-01");
	System.out.println(date2);

	//instanciando a partir de uma padrão brasileiro
	LocalDate date3 = LocalDate.parse("01/01/2050", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println(date3);
	}
}