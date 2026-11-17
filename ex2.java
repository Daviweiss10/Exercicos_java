import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
		int num1;
		int num2;
		int soma;
		int subtracao;
		int multiplicacao;
		float divisao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        num1 = scanner.nextInt();
        System.out.print("digite o segundo número inteiro: ");
        num2 = scanner.nextInt();
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        System.out.println("a Soma de " + num1 + " + " + num2 + "é  " + soma);
        System.out.println("a Subtração de " + num1 + " - " + num2 + " é  " + subtracao);
        System.out.println("a Multiplicação de " + num1 + " * " + num2 + "é  " + multiplicacao);
        divisao = num1 / num2;
        System.out.println("a Divisão de " + num1 + " / " + num2 + " é  " + divisao);
    }
}