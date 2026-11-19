import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        double nota, frequencia;
        System.out.println("Digite a nota do aluno: ");
        nota = scaner.nextDouble();
        System.out.println("Digite o percentual de frequência (ex: 75): ");
        frequencia = scaner.nextDouble();
        if (nota >= 7.0 && frequencia >= 75.0) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
        scaner.close();
    }
}