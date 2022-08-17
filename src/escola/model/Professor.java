package escola.model;

import escola.Cargo;

public class Professor extends Funcionario {
    private Double valorHora;
    private boolean isTitular;

    public Professor(Long registro) {
        super(registro);
        super.cargo = Cargo.Cargos.PROFESSOR;
    }

    public Double valorHoraAulaAuxiliar(){
        return this.valorHora/2;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public boolean isTitular() {
        return isTitular;
    }

    public double calcularValor(double horasTrabalhadas) {
        Double valorAdicional = horasTrabalhadas * valorHora * (isTitular ? 1 : .5);
        return valorSalario + valorAdicional;
    }
}
