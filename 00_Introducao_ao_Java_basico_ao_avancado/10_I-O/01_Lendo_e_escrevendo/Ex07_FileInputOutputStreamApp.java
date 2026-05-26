
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07_FileInputOutputStreamApp {

    public static void main(String[] args) throws IOException {
        
        try (
            FileInputStream in = new FileInputStream("pastinha/meuArquivo.txt");
            FileOutputStream out = new FileOutputStream("pastinha/geradoPeloOutPuStream.txt")
        ) {
            byte[] bytes = Exemplo05_Class_IO_Operations.read(in);
            Exemplo05_Class_IO_Operations.write(out, bytes);
        }
    }
}
