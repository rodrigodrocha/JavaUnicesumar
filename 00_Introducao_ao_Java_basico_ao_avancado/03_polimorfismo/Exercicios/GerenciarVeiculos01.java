abstract class Veiculo{
	private String placa;
	private int ano;
	//Construtor
	Veiculo(String placa, int ano){
		this.placa = placa;
		this.ano = ano;
	}
	public String getPlaca(){return this.placa;}
	public int getAno(){return this.ano;}
	abstract void exibirInformacoes();
}
class Onibus extends Veiculo{
	private int assento;
	//Construtor classe filha
	Onibus(String placa, int ano, int assento){
	super(placa, ano);
	this.assento = assento;
	}
	@Override
	public void exibirInformacoes(){
		System.out.printf("""
			===== Ônibus =====
			Placa:    %s
			Ano:      %d
			Assentos: %d

			""", getPlaca(), getAno(), this.assento);
	}
}
class Caminhao extends Veiculo{
	private int eixo;
	//Construtor
	Caminhao(String placa, int ano, int eixo){
	super(placa, ano);
	this.eixo = eixo;
	}
	@Override
	public void exibirInformacoes(){
		System.out.printf("""
			====Caminhão====
			Placa:   %s
			Ano:     %d
			Eixo:    %d
			""", getPlaca(), getAno(), this.eixo);
	}
}

public class GerenciarVeiculos01{
	public static void main(String[] args){
		Veiculo onibus = new Onibus("fhi5i95", 2013, 45);
		onibus.exibirInformacoes();
		Caminhao caminhao = new Caminhao("abc1234", 2006, 3);
		caminhao.exibirInformacoes();
	}
}