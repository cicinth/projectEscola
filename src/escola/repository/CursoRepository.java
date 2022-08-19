package escola.repository;

import escola.model.Curso;

public class CursoRepository extends MemoryRepository<Long, Curso> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Curso item, Long chave) {
        item.setId(chave);
    }
}
