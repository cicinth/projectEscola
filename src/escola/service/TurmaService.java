package escola.service;

import escola.exception.AlunoJaMatriculadoException;
import escola.exception.NaoHaVagas;
import escola.model.Aluno;
import escola.model.Turma;

public class TurmaService {
    public void matricular(Aluno aluno, Turma turma) {
        try {
            if (!turma.hasVagas()) {
                throw new NaoHaVagas();
            }
            turma.adicionar(aluno);
        } catch (AlunoJaMatriculadoException e) {

        } catch (NaoHaVagas e) {
            System.out.println(e.getMessage());
        }
    }
}
