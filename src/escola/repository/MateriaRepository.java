package escola.repository;

import escola.model.Materia;

public class MateriaRepository extends MemoryRepository<Long, Materia> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Materia item, Long chave) {
        item.setId(chave);
    }
}
