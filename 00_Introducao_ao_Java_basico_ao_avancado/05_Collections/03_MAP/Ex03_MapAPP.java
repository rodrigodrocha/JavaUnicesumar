import java.util.HashMap;
import java.util.Map;

public class Ex03_MapAPP{
	public static void main(String[] args){
		Map<Ex03_ClassName, Integer> map = new HashMap<>();

		map.put(new Ex03_ClassName("João", "Oliveira"), 35);
		map.put(new Ex03_ClassName("Maria", "Silva"), 22);
		map.put(new Ex03_ClassName("Celso", "Cerqueira"), 43);
		map.put(new Ex03_ClassName("Celso", "Cerqueira"), 43);

		System.out.println("\n\n\n");
		System.out.println(map);
		System.out.println("\n\n\n");
	}
}