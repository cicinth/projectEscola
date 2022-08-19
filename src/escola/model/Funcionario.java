package escola.model;

import escola.Assalariado;
import escola.Cargo;

public class Funcionario implements Assalariado {
    protected String nome;
    protected Long registro;
    protected Long cpf;
    protected Cargo.Cargos cargo;

    protected Double valorSalario;

    public Funcionario(Long registro){
        this.registro = registro;
    }

    public Funcionario(Long registro, String nome){
        this.registro = registro;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Cargo.Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargo.Cargos cargo) {
        this.cargo = cargo;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public double calcularValor(double horasTrabalhadas) {
        return valorSalario;
    }
}
