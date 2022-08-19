package escola.model;

import escola.Curso;

public class Aluno {
    private String nome;
    private Integer idade;
    private Long cpf;
    private Boolean ativado;
    private Long registro;

    public Long getRegistro() {
        return registro;
    }

    public void setRegistro(Long registro) {
        this.registro = registro;
    }

    public int dataMatricula;
    public int validadeMatricula;
    public Curso.Cursos curso;
    public Integer[] notas = new Integer[2];

    public void exibirNotas(){
        for(int i = 0; i < this.notas.length; i++){
            System.out.println(notas[i]);
        }
    }

    public Boolean getAtivado() {
        return ativado;
    }

    public void setAtivado(Boolean ativado) {
        this.ativado = ativado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}

