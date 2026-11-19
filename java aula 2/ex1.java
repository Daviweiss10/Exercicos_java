import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade da pessoa: ");
        idade = entrada.nextInt();
        if (idade <= 12 || idade >= 65) {
            System.out.println("Entrada gratuita");
        }
        entrada.close();
    }
}