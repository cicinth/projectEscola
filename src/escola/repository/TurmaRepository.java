package escola.repository;

import escola.model.Turma;

public class TurmaRepository extends MemoryRepository<Long, Turma> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Turma item, Long chave) {
        item.setId(chave);
    }
}
