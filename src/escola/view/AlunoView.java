package escola.view;

import escola.model.Aluno;
import escola.service.AlunoService;

import java.util.List;
import java.util.Scanner;

public class AlunoView {
    private static AlunoService service = new AlunoService();

    public static void menuInicial() {
        int opcao = 0;
        do {
            System.out.println("#".repeat(100));
            System.out.println("#  ALUNOS  #");
            System.out.println("#".repeat(100));
            System.out.println("Digite o número da opção desejada");
            System.out.println("1 - Listar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Adicionar novo");
            System.out.println("0 - Sair");
            System.out.println("::");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Bye bye!");
                    break;
                case 1:
                    listarAlunos();
                    break;
                case 2:
                    System.out.println("Opção: " + opcao);
                    break;
                case 3:
                    Aluno novoAluno = cadastroAluno();
                    exibirAluno(novoAluno);
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
        } while (opcao != 0);
    }

    private static void listarAlunos() {
        List<Aluno> lista = service.listar();
        int inicio = 0;
        int pageSize = 2;
        do {
            System.out.printf("%s - %s%n", "Registro", "Nome");
            for (int i = inicio; i < inicio + pageSize && i < lista.size(); i++) {
                Aluno aluno = lista.get(i);
                System.out.printf("%s - %s%n", aluno.getRegistro(), aluno.getNome());
            }
            System.out.println("Digite uma opção:");
            System.out.println("O registro do aluno para detalhes");
            System.out.println("M - mais alunos");
            System.out.println("X - para sair");
            System.out.println("::");
            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "M":
                    inicio = inicio + pageSize;
                    break;
                case "X":
                    return;
                default:
                    try {
                        Long registro = Long.parseLong(opcao);
                        Aluno alunoLocalizado = service.localizar(registro);
                        if (alunoLocalizado == null) {
                            System.out.println("Aluno não localizado! Tente novamente.");
                        } else {
                            exibirAluno(alunoLocalizado);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Registro inválido! Tente novamente.");
                    }
            }
        } while (inicio < lista.size());
    }

    public static void menuAlunos() {
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Listar");
        System.out.println("2 - Adicionar novo aluno");
        System.out.println("3 - Ativar aluno");
        System.out.println("4 - Desativar aluno");
        System.out.println("5 - Excluir aluno");
        System.out.println("6 - Alterar aluno");
    }

    public static Aluno cadastroAluno() {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(scanner.nextLine());

        System.out.println("Digite a idade do aluno");
        aluno.setIdade(scanner.nextInt());

        System.out.println("Digite o cpf do aluno");
        aluno.setCpf(scanner.nextLong());

//        System.out.println("Digite o registro do aluno");
//        aluno.setRegistro(scanner.nextLong());

//        scanner.close();

        return service.adicionar(aluno);
    }

    public static void exibirAluno(Aluno aluno) {
        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Cpf do aluno: " + aluno.getCpf());
        System.out.println("Ativacao do aluno: " + aluno.getAtivado());
        System.out.println("Registro do aluno: " + aluno.getRegistro());
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
