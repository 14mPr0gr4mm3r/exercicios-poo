package questao02;

public class Biblioteca {
	private String nome;
	private int capacidade;
	private String localizacao;
	private String[] livros;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public String[] getLivros() {
		return livros;
	}
	
	public void setLivros(String[] livros) {
		this.livros = livros;
	}
}
