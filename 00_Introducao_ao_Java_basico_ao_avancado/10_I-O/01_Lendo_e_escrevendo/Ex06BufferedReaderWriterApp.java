import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ex06BufferedReaderWriterApp {

    public static void main(String[] args) throws IOException {
        
        //Vai utilizar a classe Exemplo05_Class_IO_Operations para mostrar a difereça de leitura de um
        //FileReader e de um BufferedReader
        try (FileWriter out = new FileWriter("pastinha/Ex06BufferedReaderTeste.txt", StandardCharsets.UTF_8)){

            Exemplo05_Class_IO_Operations.write(out, "Hello BufferedReader!\n vamos Brasil");

        }

        try (BufferedReader in = new BufferedReader(new FileReader("pastinha/EX06BufferedReaderTeste.txt", StandardCharsets.UTF_8))){

            String text = Exemplo05_Class_IO_Operations.read(in);

            System.out.println(text);

        }
    }
}
