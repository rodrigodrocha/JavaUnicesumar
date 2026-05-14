import java.util.Map;
import java.util.HashMap;

public class Ex01_HashMap {
	public static void main(String[] args){

	//instanciando um map
	Map<Integer, Character> map = new HashMap<>();

	map.put(1, 'A');
	map.put(2, 'B');
	map.put(3, 'C');
	map.put(4, 'D');
	
	System.out.println(map);

	// retornando valor pela keys
	Character char3 = map.get(3);
	System.out.println(char3);

	// retornando um valor para uma chave inexistente
	Character char5 = map.get(5);
	System.out.println(char5); // null -> retorna null pois a chave não existe

	//Ele procura a chave se não existir ele atribuí um valor default a chave
	//que no caso colocamos X como default para a key 5
	System.out.println(map.getOrDefault(5, 'X'));
	}
}