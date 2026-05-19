import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex09_Exercicio{
	public static void main(String[] args) throws IOException{

		Path dir = Path.of("examples");
		String fileName = "file_" + System.currentTimeMillis() + ".txt";
		Files.createFile(dir.resolve(fileName));
	}
}