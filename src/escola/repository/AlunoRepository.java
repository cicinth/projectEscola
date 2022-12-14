package escola.repository;

import escola.model.Aluno;

public class AlunoRepository extends MemoryRepository<Long, Aluno> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Aluno item, Long chave) {
        item.setRegistro(chave);
    }
}
