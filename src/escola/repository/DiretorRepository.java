package escola.repository;

import escola.model.Diretor;

public class DiretorRepository extends MemoryRepository<Long, Diretor> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Diretor item, Long chave) {
        item.setRegistro(chave);
    }
}
