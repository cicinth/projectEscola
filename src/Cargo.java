import java.util.Scanner;

public class Cargo {
    public enum Cargos{
        PROFESSOR, COORDENADOR, DIRETOR
    }
    public static Cargos escolhaCargo(){
        Scanner scanner = new Scanner(System.in);
        Cargos cargo = Cargos.PROFESSOR;

        do{
            System.out.println("Digite o cargo do funcionario");
            System.out.println("Digite \n 1 - para professor \n 2 - para diretor \n 3 - coordenador");

            Integer cargoDigitado = scanner.nextInt();
            switch (cargoDigitado) {
                case 1:
                    cargo =  Cargos.PROFESSOR;
                    break;
                case 2:
                    cargo =  Cargos.DIRETOR;
                    break;
                case 3:
                    cargo = Cargos.COORDENADOR;
                default:
                    System.out.println("Cargo invalido");
            }
        }
        while(cargo == null);
        return cargo;
    }
}
