import java.util.HashMap;
import java.util.Map;

public class Exe01{
    public static void main(String[] args){

        Map<Integer, Integer> estoque = new HashMap<>();

        estoque.put(01, 20);
        estoque.put(02, 15);
        estoque.put(03, 10);
        estoque.put(04, 13);
        estoque.put(05, 17);

        System.out.println(estoque);
    }
}