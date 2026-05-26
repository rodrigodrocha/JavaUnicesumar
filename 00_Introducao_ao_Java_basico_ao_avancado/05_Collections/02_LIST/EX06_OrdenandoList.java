import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class EX06_OrdenandoList {
	
	public static void main(String[] args){
		var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
	}
}