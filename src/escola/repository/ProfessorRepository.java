package escola.repository;

import escola.model.Professor;

public class ProfessorRepository extends MemoryRepository<Long, Professor> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Professor item, Long chave) {
        item.setRegistro(chave);
    }
}
