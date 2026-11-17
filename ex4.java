import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        float metros;
        float centimetros;
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a medida em metros: ");
        metros = scanner.nextFloat();
        centimetros = metros * 100;
        System.out.println(metros + " metro equivale a " + centimetros + " centímetro");
    }
}