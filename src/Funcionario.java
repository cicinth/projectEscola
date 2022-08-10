import java.util.Scanner;

public class Funcionario {
    public static void cadastroFuncionario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nomeFuncionario = scanner.next();

        System.out.println("Digite o registro do funcionario: ");
        final Long registroFuncionario = scanner.nextLong();

        System.out.println("Digite o cpf do funcionario: ");
        Long cpfFuncionario = scanner.nextLong();

        Cargo.Cargos cargo = Cargo.escolhaCargo();

        Double valorHoraAula = null;

        try {
            valorHoraAula = adicionarValorHoraAula(cargo);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(nomeFuncionario);
        System.out.println(registroFuncionario);
        System.out.println(cpfFuncionario);
        System.out.println(valorHoraAula);
        System.out.println(cargo);
        scanner.close();
    }
    public static Double adicionarValorHoraAula(Cargo.Cargos cargoFuncionario) throws Exception {
        Scanner scanner = new Scanner(System.in);
        if(cargoFuncionario.equals(Cargo.Cargos.PROFESSOR)){
            System.out.println("Digite o valor da hora/aula do professor: ");
            return scanner.nextDouble();
        } else {
            throw new Exception(cargoFuncionario.name() + " nao possui valor de hora aula");
        }
    }
}
