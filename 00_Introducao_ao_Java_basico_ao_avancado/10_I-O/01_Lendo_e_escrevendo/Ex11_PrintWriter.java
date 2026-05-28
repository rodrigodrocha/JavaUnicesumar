
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Ex11_PrintWriter {

    public static void main(String[] args) throws IOException {
        
        PrintWriter out = new PrintWriter("pastinha/Ex11PrintWriter.txt", StandardCharsets.UTF_8);

        out.println("Olá");
        out.println("tudo bem");
        out.println("eu sou java!");
        out.format("número: %03d", 10);
        //out.close(); // serve para fechar e escrever no arquivo também
        //hout.flush(); // para poder anotar tudo no arquivo ou usamos o try-with-resource
    }
}
