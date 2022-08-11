package escola.service;

import escola.Cargo;
import escola.model.Funcionario;

import java.util.Scanner;

public class FuncionarioService {

    public static void cadastroFuncionario(){
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
         funcionario.nome = scanner.next();

        System.out.println("Digite o registro do funcionario: ");
        funcionario.registro = scanner.nextLong();

        System.out.println("Digite o cpf do funcionario: ");
        funcionario.cpf = scanner.nextLong();

        funcionario.cargo = Cargo.escolhaCargo();

        Double valorHoraAula = null;

        try {
            valorHoraAula = adicionarValorHoraAula(funcionario.cargo);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println(funcionario.nome);
        System.out.println(funcionario.registro);
        System.out.println(funcionario.cpf);
        System.out.println(funcionario.valorHoraAula);
        System.out.println(funcionario.cargo);
        scanner.close();
    }

    public static Double adicionarValorHoraAula(Cargo.Cargos cargo) throws Exception {
        Scanner scanner = new Scanner(System.in);
        if(cargo.equals(Cargo.Cargos.PROFESSOR)){
            System.out.println("Digite o valor da hora/aula do professor: ");
            return scanner.nextDouble();
        } else {
            throw new Exception(cargo.name() + " nao possui valor de hora aula");
        }
    }
}
