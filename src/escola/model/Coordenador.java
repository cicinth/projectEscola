package escola.model;

import escola.Assalariado;
import escola.Cargo;

import java.util.List;

public class Coordenador extends Funcionario implements Assalariado {
    private List<Curso> cursos;

    public Coordenador(Long registro) {
        super(registro);
        super.cargo = Cargo.Cargos.COORDENADOR;
    }

    public double calcularValor(double horasTrabalhadas) {
        double valorBonus = cursos.size() * .01 * valorSalario;
        return valorSalario + valorBonus;
    }
}
