import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int idade;
        int dias;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a sua idade em anos: ");
        idade = scanner.nextInt();
        dias = idade * 365;
        System.out.println("você já viveu " + dias + " dias");
    }
}