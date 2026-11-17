import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        String nome;
        int idade;
        boolean ativa;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o nome de usuário: ");
        nome = scanner.nextLine();
        System.out.print("digite a idade: ");
        idade = scanner.nextInt();
        System.out.print("a conta está ativa (true/false): ");
        ativa = scanner.nextBoolean();
        System.out.println("nome de usuário: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("conta ativa: " + ativa);
    }
}