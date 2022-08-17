package escola.model;

import java.util.List;

public class Materia {
    private Long id;
    private String nome;
    private String ementa;
    private Double cargaHoraria;
    private List<String> materiais;
    private List<Professor> professores;
}
