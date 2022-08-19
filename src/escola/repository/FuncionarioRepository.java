package escola.repository;

import escola.model.Funcionario;

public class FuncionarioRepository extends MemoryRepository<Long, Funcionario> {
    private Long ultimaChave = 0L;

    @Override
    protected Long novaChave() {
        return ultimaChave++;
    }

    @Override
    protected void setChave(Funcionario item, Long chave) {
        item.setRegistro(chave);
    }
}
