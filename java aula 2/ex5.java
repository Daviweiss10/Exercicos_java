import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
		int codigo, quantidade;
		double vu, total;
        Scanner scaner = new Scanner(System.in);
        System.out.println("1 - Bone (R$ 50,00)");
        System.out.println("2 - Calca (R$ 80,00)");
        System.out.println("3 - Tenis (R$ 150,00)");
        System.out.print("Digite o codigo do produto: ");
        codigo = scaner.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        quantidade = scaner.nextInt();
        switch (codigo) {
            case 1:
                vu = 50.00;
                break;
            case 2:
                vu = 80.00;
                break;
            case 3:
                vu = 150.00;
                break;
            default:
                System.out.println("Produto nao encontrado");
                scaner.close();
                return;
        }
        total = vu * quantidade;
        System.out.println("Valor total da compra: "+ total);
        scaner.close();
    }
}