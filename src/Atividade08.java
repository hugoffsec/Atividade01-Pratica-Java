import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "";
        nomes[1] = "";
        nomes[2] = "";
        double[] precos = new double[3];
        precos[0] = 0;
        precos[1] = 0;
        precos[2] = 0;
        double[] quantidades = new double[3];
        quantidades[0] = 0;
        quantidades[1] = 0;
        quantidades[2] = 0;
        double[] subtotais = new double[3];
        subtotais[0] = 0;
        subtotais[1] = 0;
        subtotais[2] = 0;
        double totalfinal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do primeiro produto?");
        nomes[0] = sc.nextLine();
        System.out.println("Qual o nome do segundo produto?");
        nomes[2] = sc.nextLine();
        System.out.println("Qual o nome do terceiro produto?");
        nomes[3] = sc.nextLine();

        System.out.println("Qual o preço do primeiro produto?");
        precos[0] = sc.nextDouble();
        System.out.println("Qual o preço do segundo produto?");
        precos[1] = sc.nextDouble();
        System.out.println("Qual o preço do terceiro produto?");
        precos[2] = sc.nextDouble();

        System.out.println("Qual a quantidade do primeiro produto?");
        quantidades[0] = sc.nextDouble();
        System.out.println("Qual a quantidade do segundo produto?");
        quantidades[1] = sc.nextDouble();
        System.out.println("Qual a quantidade do terceiro produto?");
        quantidades[2] = sc.nextDouble();

        subtotais[0] = precos[0] * quantidades[0];
        subtotais[1] = precos[1] * quantidades[1];
        subtotais[2] = precos[2] * quantidades[2];
        totalfinal = subtotais[0] + subtotais[1] + subtotais[2];

        System.out.println("O produto " + nomes[0] + " possui o subtotal de: " + subtotais[0]);
        System.out.println("O produto " + nomes[1] + " possui o subtotal de: " + subtotais[1]);
        System.out.println("O produto " + nomes[2] + " possui o subtotal de: " + subtotais[2]);
        System.out.println("O valor total da compra é: " + totalfinal);
    }
}