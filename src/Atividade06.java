import java.util.Scanner;

public class Atividade06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variáveis
        String nome = "";
        double comprimento = 0;
        double largura = 0;

        // Programa
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o comprimento do terreno em metros: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite a largura do terreno em metros: ");
        largura = sc.nextDouble();

        // Cálculo da área
        double area = comprimento * largura;

        // Resultado
        System.out.println("Proprietário: " + nome);
        System.out.println("Área total do terreno: " + area + " m²");
    }
}
