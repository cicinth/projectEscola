package escola.view;

import escola.model.Aluno;

import java.util.Scanner;

public class AlunoView {
    public static Aluno cadastroAluno() {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.next();

        System.out.println("Digite a idade do aluno");
        aluno.idade = scanner.nextInt();

        System.out.println("Digite o cpf do aluno");
        aluno.cpf = scanner.nextLong();

        System.out.println("Digite o registro do aluno");
        aluno.registro = scanner.nextLong();

        scanner.close();
        return aluno;
    }

    public static void exibirAluno(Aluno aluno) {
        System.out.println("Nome aluno: " + aluno.nome);
        System.out.println("Idade do aluno: " + aluno.idade);
        System.out.println("Cpf do aluno: " + aluno.cpf);
        System.out.println("Ativacao do aluno: " + aluno.getAtivado());
        System.out.println("Registro do aluno: " + aluno.registro);
    }

    public static Integer[] incluirNotas(Aluno aluno){
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < aluno.notas.length; i++) {
                System.out.println("Digite a nota");
                Integer nota = scanner.nextInt();
                aluno.notas[i] = nota;
            }
        }catch(Exception exception){
            System.out.println("Digite um valor inteiro");
            System.exit(0);
        }
        return aluno.notas;
    }
}
