import java.util.Objects;


public class Ex03_ClassName{
	private final String first;
	private final String last;
	public Ex03_ClassName(String first, String last){
		this.first = first;
		this.last = last;
	}
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}

	@Override
	public String toString(){
		return getFirst() + " " + 
			   getLast() +  
			   " Idade ";
	}

	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ex03_ClassName name = (Ex03_ClassName) o;
		return Objects.equals(first, name.first) && Objects.equals(last, name.last);

	}

	@Override
	public int hashCode(){
		return Objects.hash(first, last);
	}
}