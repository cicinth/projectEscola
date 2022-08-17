package escola;

import escola.model.Aluno;
import escola.service.AlunoService;

public class Main {
    public static void main(String[] args){
      Aluno aluno = AlunoService.cadastroAluno();
    }
}
