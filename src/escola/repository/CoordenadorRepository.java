package escola.repository;

import escola.model.Coordenador;

public class CoordenadorRepository extends MemoryRepository<Long, Coordenador> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Coordenador item, Long chave) {
        item.setRegistro(chave);
    }
}
