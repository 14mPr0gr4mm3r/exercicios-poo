package questao02.test;

import questao02.Aluno;
import questao02.Biblioteca;
import questao02.Curso;
import questao02.Professor;

public class EscolaTeste {

	public static void main(String[] args) {
		Biblioteca lib = new Biblioteca();
		lib.setNome("Biblioteca Municipal João Almeida");
		lib.setLocalizacao("R. Cavalcante - s/n, Tiradentes");
		lib.setCapacidade(250);
		lib.setLivros(new String[250]);
		
		
		
		Curso mat = new Curso();
		mat.setNome("Matemática");
		mat.setCodigo(31415926);
		mat.setCargaHoraria(40);
		
		
		
		Professor coordenadorMat = new Professor();
		coordenadorMat.setNome("Frederico G.");
		coordenadorMat.setCodigo("D123120701729");
		coordenadorMat.setCargaHoraria(70);
		coordenadorMat.setEndereco("R. Flores do Campo, n. 232 - Jardineiros");
		
		mat.setCoordenador(coordenadorMat);
		
		
		
		Professor professorMat = new Professor();
		professorMat.setNome("Pit Agoric");
		professorMat.setCodigo("D5832380183201");
		professorMat.setCargaHoraria(50);
		professorMat.setEndereco("R. Triangulos, n. 45 - Escalenos");
		professorMat.setTelefone("+55 (21) 5359-2391");
		
		mat.setProfessor(professorMat);
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Harrison Ipkins");
		aluno1.setMatricula("E230214821083");
		aluno1.setCurso(mat);
		aluno1.setFrequencia(94);
		aluno1.setNota1(8.5);
		aluno1.setNota2(9.75);
		
		
		
		// Apresentação
		
		System.out.println("Aluno\n--------");
		System.out.println(String.format("Matrícula: %s", aluno1.getMatricula()));
		System.out.println(String.format("Nome: %s", aluno1.getNome()));
		
		Curso cursoDoAluno = aluno1.getCurso();

		System.out.println("  Curso\n  --------");
		System.out.printf("  Código: %d\n", cursoDoAluno.getCodigo());
		System.out.printf("  Nome: %s\n", cursoDoAluno.getNome());
		
		
		Professor coordenadorDoCurso = cursoDoAluno.getCoordenador();
		System.out.printf("  Coordenador(a): %s (%s)\n", coordenadorDoCurso.getNome(), coordenadorDoCurso.getCodigo());
		
		
		Professor professorDoCurso = cursoDoAluno.getProfessor();
		System.out.printf("  Professor(a): %s (%s)\n", professorDoCurso.getNome(), professorDoCurso.getCodigo());
		
		
		System.out.printf("  Frequência (%s): %.1f%%\n", aluno1.getMatricula(), aluno1.getFrequencia());
		System.out.printf("  Nota 1 (%s): %.1f\n", aluno1.getMatricula(), aluno1.getNota1());
		System.out.printf("  Nota 2 (%s): %.1f\n", aluno1.getMatricula(), aluno1.getNota2());
	}

}
