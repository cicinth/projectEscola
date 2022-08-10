import java.util.Scanner;

public class Aluno {
    public static void cadastroAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.next();

        System.out.println("Digite a idade do aluno");
        Integer idadeAluno = scanner.nextInt();

        System.out.println("Digite o cpf do aluno");
        Long cpfAluno = scanner.nextLong();

        System.out.println("Digite a ativação do aluno");
        Boolean alunoAtivado = scanner.nextBoolean();

        System.out.println("Digite o registro do aluno");
        final Long registroAluno = scanner.nextLong();

        System.out.println("Digite o ano da matricula do aluno");
        int anoMatriculaAluno = scanner.nextInt();

        int validadeMatriculaAluno = anoMatriculaAluno + 1;

        Enum<Curso.Cursos> cursoAluno = Curso.escolhaCurso();

        System.out.println("Nome aluno: " + nomeAluno);
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("Cpf do aluno: " + cpfAluno);
        System.out.println("Ativacao do aluno: " + alunoAtivado);
        System.out.println("Registro do aluno: " + registroAluno);
        System.out.println("Ano da matricula do aluno: " + anoMatriculaAluno);
        System.out.println("Validade da matricula do aluno: " + validadeMatriculaAluno);
        System.out.println("Curso do aluno: " + cursoAluno);
        scanner.close();
    }
    public static Integer[] incluirNotas(){
        Scanner scanner = new Scanner(System.in);
        Integer[] notas = new Integer[2];
        try {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota");
                Integer nota = scanner.nextInt();
                notas[i] = nota;
            }
        }catch(Exception exception){
            System.out.println("Digite um valor inteiro");
            System.exit(0);
        }

        return notas;
    }

    public static void exibirNotas(Integer[] notas){
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }
}
