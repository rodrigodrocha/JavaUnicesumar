public class CaixaDeBrinquedosSemGenericsUsandoObject{
	private Object coisaNaCaixa;

	public void setGuardar(Object coisa){
		this.coisaNaCaixa = coisa;
	}

	public Object getPegar(){
		return this.coisaNaCaixa;
	}

	public static void main(String[] args){
		//Criando uma caixa para guardar carrinhos
		CaixaDeBrinquedosSemGenericsUsandoObject caixaDeCarrinhos = new CaixaDeBrinquedosSemGenericsUsandoObject();
		caixaDeCarrinhos.setGuardar(new Carrinho("Hot Wheels"));

		// Criando uma caixa para guardar bonecas
		CaixaDeBrinquedosSemGenericsUsandoObject caixaDeBonecas = new CaixaDeBrinquedosSemGenericsUsandoObject();
		caixaDeBonecas.setGuardar(new Boneca("Barbie"));

		//Verificando tipo do objeto antes de fazer o casting
		if (caixaDeCarrinhos.getPegar() instanceof Carrinho){
			Carrinho carrinho = (Carrinho) caixaDeCarrinhos.getPegar();
			System.out.println(carrinho.getModelo());
		}
		if (caixaDeBonecas.getPegar() instanceof Boneca){
			System.out.println(((Boneca) caixaDeBonecas.getPegar()).getNome());
		}
	}
}