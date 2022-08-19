package escola.model;

import java.util.List;

public class Curso {
    private Long id;
    private String nome;
    private List<Materia> materias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
