abstract class Carro {

	int codigo = 10;

	Carro (int cod){
		codigo = cod;
	}

	abstract void acelerar();

	void frear() {
		System.out.println("O carro esta freando...");
	}
}

class Caminhao extends Carro {

	//Colocamos o construtor também mas chamando o construtor da classe abstrata Carro
	Caminhao(int codigo){
		super(codigo); //assim que chamamos o construtor da classe pai
	}


	void acelerar(){
		System.out.println("O caminhão esta acelerando lentamente");
	}
}

public class ConstrutoresEmClasseAbstrata {
	public static void main(String[] args) {
		

		Caminhao caminhao = new Caminhao(1000);

		System.out.println("Código " + caminhao.codigo);
		caminhao.acelerar();
		caminhao.frear();

	}
}