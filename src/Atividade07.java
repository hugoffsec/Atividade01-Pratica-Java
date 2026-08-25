import java.util.Scanner;

public class Atividade07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variáveis
        String nome = "";
        int distancia = 0;
        int litros = 0;
        int consumo = 0;

        // Programa
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a distância percorrida em quilômetros: ");
        distancia = sc.nextInt();
        System.out.print("Digite a quantidade de litros utilizados: ");
        litros = sc.nextInt();

        // Cálculo do combústivel
        consumo = distancia / litros;

        // Resultado
        System.out.println("Nome: " + nome);
        System.out.println("Consumo médio: " + consumo + " km/l");
    }
}
