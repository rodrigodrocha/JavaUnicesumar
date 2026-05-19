import java.nio.file.Path;

public class Ex02_Path{
	public static void main(String[] args){
		// C:\Estudos\Programacao\java\JavaUnicesumar\00_Introducao_ao_Java_basico_ao_avancado\10_I-O\REAME.md
		Path p1 = Path.of("JavaUnicesumar");
		Path p2 = Path.of("00_Introducao_ao_Java_basico_ao_avancado");
		Path p3 = Path.of("10_I-O", "README.md");
		
		// .resolve() encadeia os caminhos ele pode receber um Path ou uma String que transforma em Path
		Path p4 = p1.resolve(p2);
		System.out.println("\nEncadeando dois caminhos p1 e p2: \n\n" + p4 + "\n");

		// encadeando quantos caminhos for necessários
		Path p5 = p1.resolve(p2).resolve(p3); //.resolve()......
		System.out.println("\nEncadeando vários caminhos: \n\n" + p5 + "\n");

		//Pegando o caminho absoluto
		Path p6 = p5.toAbsolutePath();
		System.out.println("\nCaminho absoluto\n" + p6 + "\n\n");


	}
}