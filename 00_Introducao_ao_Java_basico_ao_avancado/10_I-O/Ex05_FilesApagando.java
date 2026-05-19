import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex05_FilesApagando{
	public static void main(String[] args) throws IOException{


		//Estou criando o arquivo 
		// depois de criado eu comentei o código para 
		//explicar como apaga arquivo

		Path file = Path.of("myfile.txt");
		//Files.createFile(file);

		Files.deleteIfExists(file); //passando o caminho do arquivo para apagar.


		
	}
}