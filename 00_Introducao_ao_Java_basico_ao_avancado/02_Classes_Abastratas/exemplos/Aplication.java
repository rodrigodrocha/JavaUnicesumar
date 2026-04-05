abstract class Carro {
	abstract void acelerar();

	void frear() {
		System.out.println("O carro esta freando...");
	}
}

class CarroF1 extends Carro {
	void acelerar(){
		System.out.println("O carro de Formula 1 esta acelerando muito rapidamente...");
	}
}

class Caminhao extends Carro {
	void acelerar(){
		System.out.println("O caminhão esta acelerando lentamente");
	}
	// mesmo que a classe é abstrata nós podemos subescrever seus métodos
	@Override
	void frear(){
		System.out.println("O caminhão esta freeando......");
	}
}

public class Aplication {
	public static void main(String[] args) {
		CarroF1 carroF1 = new CarroF1();
		Caminhao caminhao = new Caminhao();

		carroF1.acelerar();
		carroF1.frear();

		caminhao.acelerar();
		caminhao.frear();

	}
}