package escola;

import java.util.Scanner;

public class Curso {
    public enum Cursos{
        JAVA, BANCO, JAVASCRIPT
    }

    public static Cursos escolhaCurso(){
        Scanner scanner = new Scanner(System.in);
        Cursos curso = null;
        do{
            System.out.println("Digite o curso desejado");
            System.out.println("Digite \n 1 - para JAVA \n 2 - para BANCO \n 3 - para JAVASCRIPT");
            Integer cursoDigitado = scanner.nextInt();
            switch (cursoDigitado){
                case 1:
                    curso = Cursos.JAVA;
                    break;
                case 2:
                    curso = Cursos.BANCO;
                    break;
                case 3:
                    curso = Cursos.JAVASCRIPT;
                    break;
                default:
                    System.out.println("escola.Curso invalido");
                    break;
            }
        } while (curso == null);
        return curso;
    }
}
