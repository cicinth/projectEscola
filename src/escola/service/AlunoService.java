package escola.service;

import escola.exception.ItemNaoExistenteException;
import escola.model.Aluno;
import escola.repository.AlunoRepository;
import escola.repository.MemoryRepository;

import java.util.List;

public class AlunoService {
    private MemoryRepository<Long, Aluno> repository = new AlunoRepository();

    public Aluno adicionar(Aluno aluno) {
        return repository.adicionar(aluno);
    }

    public void ativar(Aluno aluno) throws ItemNaoExistenteException {
        aluno.setAtivado(true);
        repository.alterar(aluno.getRegistro(), aluno);
    }

    public void desativar(Aluno aluno) throws ItemNaoExistenteException {
        aluno.setAtivado(false);
        repository.alterar(aluno.getRegistro(), aluno);
    }

    public List<Aluno> listar() {
        return repository.listar();
    }

    public Aluno localizar(Long registro) {
        return repository.localizar(registro);
    }
}
