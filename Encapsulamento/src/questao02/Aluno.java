package questao02;

public class Aluno {
	private String matricula;
	private String nome;
	private Curso curso;
	private double nota1;
	private double nota2;
	/// percentage
	private double frequencia;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getFrequencia() {
		return frequencia;
	}
	
	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}
}
