import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float media;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a primeira nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("digite a segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("digite a terceira nota: ");
        nota3 = scanner.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("a média aritmética das notas é: " + media);
    }
}