public class Cesto<T>{
	private T cesto;


	public void setGuardar(T cesto){this.cesto = cesto;}
	public T getPegar(){return this.cesto;}

	public static void main(String[] args){

		Cesto<Peixe> peixes = new Cesto<>();
		peixes.setGuardar(new Peixe("Nemo", 10.2));
		//criar o meu peixe com a peixes do cesto
		Peixe nemo = peixes.getPegar();
		//criando outro peixe
		peixes.setGuardar(new Peixe("Doli", 8.9));
		//criar o meu peixe com a peixes do cesto
		Peixe doli = peixes.getPegar();
		//
		System.out.println(nemo.getNome());
		System.out.println(nemo.getTamanho());
		System.out.println(doli.getNome());
		System.out.println(doli.getTamanho());

		//Polvo
		Cesto<Polvo> polvos = new Cesto<>();
		polvos.setGuardar(new Polvo("Lula", 8));
		Polvo lula = polvos.getPegar();
		System.out.println(lula.getNome());
		System.out.println(lula.getTentaculos());
	}

}