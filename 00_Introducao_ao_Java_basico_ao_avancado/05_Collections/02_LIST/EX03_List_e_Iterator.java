import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class EX03_List_e_Iterator{
	public static void main(String[] args){
		//criando uma lista e passando o valores.S
		var list = new ArrayList<>(List.of("A", "B", "C", "D"));
		
		//Interação em uma lista com for
		for (int i = 0; i < list.size(); i++){
			String s = list.get(i);
		}

		//USANDO ITERATOR
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()){
			String s = iter.next();
			if (s.equals("C")){
				iter.remove();
			}
		}

		System.out.println(list);
	}
}