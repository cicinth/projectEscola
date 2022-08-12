package escola.model;

import escola.Cargo;

public class Funcionario {
    private String nome;
    final private Long registro;
    private Long cpf;
    private Cargo.Cargos cargo;
    private Double valorHoraAula;

    public Funcionario(Long registro){
        this.registro = registro;
    }

    public Funcionario(Long registro, String nome){
        this.registro = registro;
        this.nome = nome;
    }

    public Double valorHoraAulaAuxiliar(){
        return this.valorHoraAula/2;
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

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
