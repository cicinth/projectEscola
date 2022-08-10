import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //cadastroAluno();
        //cadastroFuncionario();
        incluirNotas();
    }

    public enum Cursos{
        JAVA, BANCO, JAVASCRIPT
    }

    public enum Cargo{
        PROFESSOR, COORDENADOR, DIRETOR
    }

    public static void cadastroFuncionario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nomeFuncionario = scanner.next();

        System.out.println("Digite o registro do funcionario: ");
        final Long registroFuncionario = scanner.nextLong();

        System.out.println("Digite o cpf do funcionario: ");
        Long cpfFuncionario = scanner.nextLong();

        System.out.println("Digite o valor da hora/aula do funcionario: ");
        Double valorHoraAula = scanner.nextDouble();

        Cargo cargo = escolhaCargo();


        System.out.println(nomeFuncionario);
        System.out.println(registroFuncionario);
        System.out.println(cpfFuncionario);
        System.out.println(valorHoraAula);
        System.out.println(cargo);
        scanner.close();
    }

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
        Enum<Cursos> cursoAluno = Cursos.JAVA;

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

    public static Cargo escolhaCargo(){
        Scanner scanner = new Scanner(System.in);
        Cargo cargo = Cargo.PROFESSOR;

        do{
            System.out.println("Digite o cargo do funcionario");
            System.out.println("Digite \n 1 - para professor \n 2 - para diretor \n 3 - coordenador");

            Integer cargoDigitado = scanner.nextInt();
            switch (cargoDigitado) {
                case 1:
                    cargo =  Cargo.PROFESSOR;
                    break;
                case 2:
                    cargo =  Cargo.DIRETOR;
                    break;
                case 3:
                    cargo = Cargo.COORDENADOR;
                default:
                    System.out.println("Cargo invalido");
            }
        }
        while(cargo == null);
        return cargo;
    }

    public static void incluirNotas(){
        Scanner scanner = new Scanner(System.in);
        Integer[] notas = new Integer[2];
        System.out.println("Digite a nota");
        Integer nota = scanner.nextInt();

        notas[0] = nota;

        System.out.println(notas[0]);
        System.out.println(notas[1]);

    }
}
