import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex09InputStreamReader {

    private static final byte[] BYTES = {
        106, 97, 118, 97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47 
    };

    public static void main(String[] args) throws IOException {
      try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new ByteArrayInputStream(BYTES),
                    StandardCharsets.UTF_8
                )
            )
        ){
            System.out.println(reader.readLine());      
        }   
    }
}
