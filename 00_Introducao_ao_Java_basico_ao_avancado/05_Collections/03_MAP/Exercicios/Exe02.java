import java.util.ArrayList;
import java.util.List;

public class Exe02{
    public static void main(String[] args){

        List<String> filmes = new ArrayList<>();
        filmes.add("Velozes e furiosos");
        filmes.add("Homem de ferro");

        System.out.println("Contem o filme Homem de ferro? " + filmes.contains("Homem de ferro"));
        System.out.println("Contem o filme Homem formiga? " + filmes.contains("Homem formiga"));
    }
}