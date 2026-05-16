import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex02_LocalDateApp {
	public static void main(String[] args){
	//Instanciando uma data
	//                            ano, mes, dia
	LocalDate date = LocalDate.of(1990, 1, 1);
	System.out.println(date);
	// instanciando uma nova data atravês da isntancia de outra data 
	LocalDate date2 = date.withYear(2000);
	System.out.println(date2);
	LocalDate date3 = date.withYear(2000).withMonth(5);
	System.out.println(date3);
	//operações com anos 
	System.out.println("\nSomei dois anos:");
	LocalDate date4 = date3.plusYears(2);
	System.out.println(date4);
	//operações com dias
	System.out.println("\nSubtrai 5 dias:");
	LocalDate date5 = date4.minusDays(5);
	System.out.println(date5);
	//outro forma de fazer operações
	System.out.println("\nSubtrai 5 dias:");
	//                                          posso usar DAYS, MONTHS, YEARS
	LocalDate date6 = date4.minus(5, ChronoUnit.DAYS);
	System.out.println(date6);
	System.out.println("\nSubtrai 5 MESES:");
	LocalDate date7 = date4.minus(5, ChronoUnit.MONTHS);
	System.out.println(date7);
	System.out.println("\nSubtrai 3 ANOS:");
	LocalDate date8 = date7.minus(3, ChronoUnit.YEARS);
	System.out.println(date8);

	//Outro format para impressão essa alteração retorna uma string
	String formatDate7 = date8.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println(formatDate7);
		
	}
}