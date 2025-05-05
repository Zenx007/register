import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nomeValido = false, sobrenomeValido = false;

        System.out.println("Inicio do programa de cadastro");
        System.out.println("----------------------------------------");
        while (!nomeValido) {
            System.out.println("Qual o seu nome?");
            String nome = scanner.next();
            try {
                if (nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nome não pode ser vazio");
                }
                if (nome.matches(".*\\d.*")) {
                    throw new IllegalArgumentException("O nome não pode conter números");
                }

                nomeValido = true;
            } catch (IllegalArgumentException e) {

                System.out.println("Erro: " + e.getMessage());
                scanner.next();

            }
        }
        while(!sobrenomeValido) {
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            try {
                if(sobrenome.trim().isEmpty()) {
                    throw new IllegalArgumentException("O sobrenome não pode ficar vazio");
                }

                if(sobrenome.matches(".*\\d.*")) {
                    throw new IllegalArgumentException("O sobrenome não pode contar números");
                }
                sobrenomeValido=true;
            }
            catch (IllegalArgumentException e) {

                System.out.println("Erro: " +e.getMessage());
            }
        }
        while(true) {
            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            try {
                if (idade < 0) {
                    System.out.println("Idade não pode ser menor do que 0");
                    continue;
                }

                break;
            }
                catch(InputMismatchException e) {
                    System.out.println("Erro: " + e.getMessage());
                    scanner.next();
                }
            }
        while(true) {
            System.out.println("Digite a sua altura");
            double altura = scanner.nextDouble();

            try {
                if(altura<=0) {
                    System.out.println("A altura não pode ser igual ou menor a 0");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("Err: " + e.getMessage());
            }
        }
    }
}