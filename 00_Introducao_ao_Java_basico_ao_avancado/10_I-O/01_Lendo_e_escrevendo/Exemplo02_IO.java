import java.io.*;

public class Exemplo02_IO {
	public static void main(String[] args) {

		try {

			// Escrevendo em um arquivo
			FileWriter writer = new FileWriter("pastinha\\meuArquivo.txt");

			writer.write("Olá, mundo!"); // Grava os dados

			writer.close();


			// Lendo de um arquivo
			FileReader reader = new FileReader("pastinha\\meuArquivo.txt");

			int data = reader.read();

			while (data != -1){ // o arquivo guarda no final de tudo o -1 por isso comparamos com o -1

				System.out.print((char)data);

				data = reader.read();
			}
			reader.close();

		} catch (IOException e){

			System.out.println("Problemas de IO: " + e.getMessage());
		}
	}
}