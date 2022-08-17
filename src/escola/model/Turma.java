package escola.model;

import escola.exception.AlunoJaMatriculadoException;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Long id;
    private List<Aluno> alunos;
    private Curso curso;

    private int vagas;

    public Turma(Long id, Curso curso) {
        this.id = id;
        this.curso = curso;
        this.alunos = new ArrayList<>();
        this.vagas = 25;
    }

    public void adicionar(Aluno aluno) throws AlunoJaMatriculadoException {
        if (alunos.contains(aluno)) {
            throw new AlunoJaMatriculadoException();
        }
        alunos.add(aluno);
    }

    public int numeroDeAlunos() {
        return alunos.size();
    }

    public boolean hasVagas() {
        return alunos.size() < vagas;
    }
}
