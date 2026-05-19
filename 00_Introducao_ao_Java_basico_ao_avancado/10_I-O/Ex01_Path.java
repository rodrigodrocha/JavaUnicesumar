import java.nio.file.Path;

public class Ex01_Path{
	public static void main(String[] args){

		// C:\Estudos\Programacao\java\JavaUnicesumar\00_Introducao_ao_Java_basico_ao_avancado\10_I-O\REAME.md
		Path p1 = Path.of("C:", "Programacao", "java", "JavaUnicesumar", "00_Introducao_ao_Java_basico_ao_avancado", "10_I-O", "README.md");
		System.out.println(p1);
		
		//pegando o arquivo
		Path p2 = p1.getFileName();
		System.out.println("\npegando o arquivo\n" + p2);

		// pega o caminho inicial do projeto
		Path p3 = p1.getRoot();
		System.out.println("\npega o caminho inicial do projeto\n" + p3);


	}
}