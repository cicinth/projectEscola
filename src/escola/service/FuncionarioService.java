package escola.service;

import escola.Assalariado;
import escola.Cargo;
import escola.model.Funcionario;
import escola.model.Professor;

import java.util.Scanner;

public class FuncionarioService {

    public static void cadastroFuncionario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o registro do funcionario: ");

        Funcionario funcionario = new Funcionario(scanner.nextLong());

        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(scanner.next());


        System.out.println("Digite o cpf do funcionario: ");
        funcionario.setCpf(scanner.nextLong());

        funcionario.setCargo(Cargo.escolhaCargo());

//        try {
//            funcionario.setValorHoraAula(adicionarValorHoraAula(funcionario.getCargo()));
//        }catch (Exception exception){
//            System.out.println(exception.getMessage());
//        }

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRegistro());
        System.out.println(funcionario.getCpf());
//        System.out.println(funcionario.getValorHoraAula());
        System.out.println(funcionario.getCargo());
        calcularValorReceber(15, new Professor(1L));
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

    public static Double calcularValorReceber(Integer horasTrabalhadas, Funcionario funcionario){
        Double valorAReceber = funcionario.getValorSalario();
        if (funcionario instanceof Professor) {
            Professor professor = (Professor) funcionario;
            Double valorAdicional = horasTrabalhadas * professor.getValorHora() * (professor.isTitular() ? 1 : .5);
            valorAReceber += valorAdicional;
        }
//        return funcionario.calcularValorAReceber();
        return valorAReceber;
    }

    public static Double calcularValorReceber(Integer horasTrabalhadas, Assalariado assalariado){
        return assalariado.calcularValor(horasTrabalhadas);
    }
}
