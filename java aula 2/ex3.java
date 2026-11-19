import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade da pessoa: ");
        idade = scaner.nextInt();
        if (idade <= 12) {
            System.out.println("Atendimento infantil");
        } else if (idade >= 13 && idade <= 59) {
            System.out.println("Atendimento adulto");
        } else {
            System.out.println("Atendimento preferencial");
        }
        scaner.close();
    }
}