import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;

public class Ex02_LinkedHashMap {
	public static void main(String[] args){

		//instanciando um map
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("Player A", 300);
		map.put("Player B", 500);
		map.put("Player C", 200);
		map.put("Player D", 700);
	
		Set<String> keys = map.keySet();

		System.out.println("--Keys--");

		for (String key : keys){
			System.out.println(key);
		}
		
		Collection<Integer> values = map.values();

		System.out.println("\n--Values--");
		for (Integer value: values){
			System.out.println(value);
		}

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		// Esse tipo de valor não é tão intuitivo
		// então podemos mudar para var. Exemplo
		//var entries = map.entrySet(); // mesma coisa que não linha 27

		//Não usando o var
		for (Map.Entry<String, Integer> entry : entries){
		//Com o var o for seria
		// for (var entry : entries)
			//System.out.println(entry.getKey() + " -> " + entry.getValue());
			// usando o format ou invês de println
			System.out.format("%s ===> %d\n", entry.getKey(), entry.getValue());
		}
	}
}