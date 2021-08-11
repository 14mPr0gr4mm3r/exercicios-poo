package questao02;

public class Curso {
	private String nome;
	private int cargaHoraria;
	private Professor coordenador;
	private Professor professor;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
