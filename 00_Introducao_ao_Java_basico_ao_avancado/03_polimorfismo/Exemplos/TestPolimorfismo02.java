interface Veiculo {
	void acelerar();
}

class Carro implements Veiculo{
	public void acelerar(){
		System.out.println("O carro esta acelerando!!");
	}
}

class Moto implements Veiculo{
	public void acelerar(){
		System.out.println("A moto esta acelerando!!");
	}
}

public class TestPolimorfismo02{
	public static void main(String[] args){

		Veiculo meuCarro = new Carro();
		Veiculo minhaMoto = new Moto();

		meuCarro.acelerar();
		minhaMoto.acelerar();
	}
}