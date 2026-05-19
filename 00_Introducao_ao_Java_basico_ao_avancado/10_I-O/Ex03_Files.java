import java.nio.file.Path;
import java.nio.file.Files;

public class Ex03_Files{
	public static void main(String[] args){

		Path p1 = Path.of("file.txt");

		Path absolute = p1.toAbsolutePath();
		System.out.println("\n\nIniciandoooo!!!!\n ");
		System.out.println(absolute);

		//.exists() -> retorna um booleano informando se o arquivo existe
		System.out.println("\nExiste esse objeto: " + Files.exists(p1));

		System.out.println("É um diretório: " + Files.isDirectory(p1));
		System.out.println("É um arquivo: " + Files.isRegularFile(p1));

	}
}