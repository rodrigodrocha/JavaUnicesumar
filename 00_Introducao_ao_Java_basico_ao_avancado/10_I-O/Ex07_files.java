import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Ex07_files{
	public static void main(String[] args) throws IOException{


		//listando arquivos e diretorios de uma caminho
															// o segundo parametro é opcional nesse exemplo o *.md ele pega todos os arquivos que são .md
		try (var files = Files.newDirectoryStream(Path.of(""), "*.md")){
			for(Path path : files){
				System.out.println(path + " - " + Files.isDirectory(path));
			}
		}


		
	}
}