import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex06_FilesCopyMove{
	public static void main(String[] args) throws IOException{



		//copiando arquivo com o nome diferente

		//Onde o arquivo esta
		Path from = Path.of("file.txt");

		//Para onde o arquivo vai para frente
		Path to = Path.of("examples","d1", "file1.txt");

		//Copiando na mesma pasta
		Path to2 = to.getParent().resolve("file2.txt");

		// Copiando na pasta anterior
		Path to3 = to.getParent().getParent().resolve("file3.txt");
		//Copiar o arquivo
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);

		Files.copy(to, to2, StandardCopyOption.REPLACE_EXISTING);

		Files.copy(to, to3, StandardCopyOption.REPLACE_EXISTING); // StandardCopyOption.REPLACE_EXISTING SE O ARQUIVO EXISTIR ELE SOBRESCREVE

		Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);

		
	}
}