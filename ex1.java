import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		int num;
		int ant;
		int suc;
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe um numero: ");
			num = entrada.nextInt();
			ant = num - 1;
			suc = num + 1;
			System.out.println("o numero escolido foi o "+num+", seu sucessor é o "+suc+", e o seu antessesor é o "+ant);
 }
}
