
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Exemplo04_FilesWriter {
    public static void main(String[] args) throws IOException{
       
       
        try (FileWriter out = new FileWriter("pastinha/out1.txt", StandardCharsets.UTF_8)){
            out.write("Hello!");

       }

    }

}
