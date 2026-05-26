import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Ex08_ByteTransferApp {

    public static void main(String[] args) throws IOException {

        try (
            InputStream in = new ByteArrayInputStream("Java = sensacional".getBytes(StandardCharsets.UTF_8));
            OutputStream out = new FileOutputStream("pastinha/transfer01.txt");

            InputStream in2 = new FileInputStream("pastinha/out1.txt");
            ByteArrayOutputStream out2 = new ByteArrayOutputStream(); // vai armazernar os bytes em uma array
        )
        {
            Exemplo05_Class_IO_Operations.transfer(in, out);
            
            //para lermos o out2 que esta armazenado precisamos converte para string
            Exemplo05_Class_IO_Operations.transfer(in2, out2);
            String str = out2.toString(StandardCharsets.UTF_8);
            System.out.println(str);
        }
    }
}
