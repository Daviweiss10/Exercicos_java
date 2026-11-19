import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
		double nota, frequencia;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota final: ");
        nota = scanner.nextDouble();
        System.out.print("Digite o percentual de frequência: ");
        frequencia = scanner.nextDouble();
        String situacao;
        if (nota >= 6.0 && frequencia >= 75.0) {
            if (nota >= 9.0 && frequencia >= 90.0) {
                situacao = "Aluno destacado";
            } else {
                situacao = "Aluno aprovado";
            }
        } else {
            if (frequencia >= 75.0) {
                situacao = "Aluno em reavaliação";
            } else {
                situacao = "Aluno reprovado por frequência";
            }
        }
        System.out.println("Situação: " + situacao);
        scanner.close();
    }
}