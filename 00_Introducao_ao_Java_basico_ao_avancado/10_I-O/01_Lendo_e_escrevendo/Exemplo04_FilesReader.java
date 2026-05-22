
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Exemplo04_FilesReader {
    public static void main(String[] args) throws IOException{
       
       
        try (FileWriter out = new FileWriter("pastinha/out1.txt", StandardCharsets.UTF_8)){
            out.write("Hello!s");

       }

       // FileReader lê caracter por caracter de um arquivo, 
       // por esse motivo colocamos ele dentro do while, 
       // quando ele termina de ler o arquivo todo ele retorna -1
       // todos os arquivos quando não tem mais conteúdo retorna -1
       //por isso o nosso while é true até ler todo o documento.
       try (FileReader in = new FileReader("pastinha/out1.txt", StandardCharsets.UTF_8)){

        int c = in.read();
        StringBuilder text = new StringBuilder();
        while (c > -1){
            text.append((char) c);
            c = in.read();
        }
        System.out.println(text);
       }

    }

}
