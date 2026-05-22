
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Exemplo05_Main {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("pastinha/out2.txt", StandardCharsets.UTF_8)){

            Exemplo05_Class_IO_Operations.write(out, "Hello!");

        }

        try (FileReader in = new FileReader("pastinha/out2.txt", StandardCharsets.UTF_8)){

            String text = Exemplo05_Class_IO_Operations.read(in);

            System.out.println(text);

        }
    }
}
