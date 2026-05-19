import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Exemplo03_NIO {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("meuArquivo1.txt");

		try {

		// Escrevendo em um arquivo
		Files.write(path, "Olá, mundo!".getBytes()); // retorna uma array de bytes


		//Lendo de um arquivo
		byte[] bytes = Files.readAllBytes(path);

		String content = new String(bytes);

		System.out.println(content);
	
	} catch (IOException e){
		System.out.println("Probelmas de IO: " + e.getMessage());
	}
	}
}