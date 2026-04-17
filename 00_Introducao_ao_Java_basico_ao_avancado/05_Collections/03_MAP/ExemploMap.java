import java.util.HashMap;
import java.util.Map;

public class ExemploMap{
    public static void main(String[] args){

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 20); //ADICIONANDO ELEMENTOS
        mapa.put("Python", 15); //ADICIONANDO ELEMENTOS
        mapa.put("C++", 10); //ADICIONANDO ELEMENTOS

        //VERIFICANDO SE O MAP CONTÉM UMA CHAVE
        System.out.println("Contem 'Java'? " + mapa.containsKey("Java")); // true

        //OBTEM O VALOR ASSOCIADO A UMA CHAVE
        System.out.println("Valor associado a 'Java'? " + mapa.get("Java")); // 20

        // ADICIONANDO MAIS DOIS ELEMENTOS
        mapa.put("JavaScript", 25);
        mapa.put("Ruvy", 9);

        // IMPRIME SEM ORDEM
        System.out.println("Mapa completo " + mapa); 

        //Remove
        mapa.remove("Python");

        //imprime após remoção
        System.out.println("Mapa completo apos remocao " + mapa); 

        //atualizando o valor da chave
        mapa.put("Java", 35);

        //imprime apos atualizar chave
        System.out.println("Mapa completo apos atualizacao de chave " + mapa);

        //limpando o mapa
        mapa.clear(); 
        
        //impressão apos limpar o mapa        
        System.out.println("Mapa completo apos atualizacao de chave " + mapa);
    }
}