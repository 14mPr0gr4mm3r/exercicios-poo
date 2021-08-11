package questao01;

public class Veiculo {
	private String placa;
	private String cor;
	private int numPassageiros;
	private double capacidadeTanque;
	private double velocidadeMax;
	private double velocidadeAtual;
	private double consumoMedio;
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String numeroPlaca) {
		this.placa = numeroPlaca;
	}
	
	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumPassageiros() {
		return this.numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapacidadeTanque() {
		return this.capacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public double getVelocidadeMax() {
		return this.velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public double getVelocidadeAtual() {
		return this.velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getConsumoMedio() {
		return this.consumoMedio;
	}

	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
}
