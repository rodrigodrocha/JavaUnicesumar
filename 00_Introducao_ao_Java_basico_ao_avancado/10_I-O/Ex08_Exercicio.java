import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex08_Exercicio{
	public static void main(String[] args) throws IOException{

		Path initialDir = Path.of("");
		System.out.println(initialDir);

		System.out.println(calculateSize(initialDir));

		
	}

	private static long calculateSize(Path initialDir) throws IOException{

		long totalSize = 0;

		try(var files = Files.newDirectoryStream(initialDir)){
			for (Path file : files){
				if (Files.isDirectory(file)){ // ele verifica se é um diretório entra dentro e faz os calculo de bytes pasta por pasta
					totalSize += calculateSize(file);
				} else {
				totalSize += Files.size(file);
				}
			}
		}
		return totalSize;
	}
}