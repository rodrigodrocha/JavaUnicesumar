import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exemplo05_Class_IO_Operations {

    public static void write(Writer out, String text) throws IOException{
        out.write(text);
    }

    public static String read(Reader in) throws  IOException{
        StringBuilder text = new StringBuilder();
        System.out.println("Passei pelo FileReader, aqui eu leio caracter por caracter.");
        int c = in.read();
        while (c > -1){
            text.append((char) c);
            c = in.read();
        }
            return text.toString(); // transformando para String e retornando para o chamador
    }
    public static String read(BufferedReader in) throws  IOException{
        System.out.println("Passei pelo BefferedReader, aqui eu leio uma linha completa.");

        //como ele lê linha a linha temos que fazer um loop e quando não tiver mais linha ele retorna um null
        String line;
        StringBuilder text = new StringBuilder();
        while ((line = in.readLine()) != null) {
            text.append(line).append("\n");
        }
        return text.toString(); // o bufferedReader tem como ler uma linha inteira de um arquivo
    }
}

