package escola.model;

import escola.Cargo;

import java.util.List;

public class Diretor extends Funcionario {
    private List<Coordenador> coordenadores;

    public Diretor(Long registro) {
        super(registro);
        super.cargo = Cargo.Cargos.DIRETOR;
    }
}
