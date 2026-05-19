import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex04_Files{
	public static void main(String[] args) throws IOException{

		Path root = Path.of("examples");

		// Caminho do arquivo que queremos para posteriormente verificar se ele existe
		Path d1 = root.resolve("d1");

		//Criando diretórios se o diretório existir da erro
		// para corrigir isso verificamos se o obejto existe
		if (!Files.exists(d1)){
			Files.createDirectory(root.resolve("d1"));
		}

		//criando vários caminhos de uma vez
		// com o Directories ele não gera erro se o diretorio existir
		Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3")));
		
		Files.createFile(d3.resolve("d3.txt"));

		Files.createFile(d3.getParent().resolve("d2.txt"));

		Files.createFile(d3.getParent().getParent().resolve("d1.txt"));
	}
}