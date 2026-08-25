import java.util.Scanner;

public class Atividade03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variáveis
        String nome = "";
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;

        // Input dos dados
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a sua segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Digite a sua terceira nota: ");
        nota3 = sc.nextInt();

        // cálculo da média
        int media = (nota1 + nota2 + nota3) / 3;

        // Resultado
        System.out.println("Resultado");
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
    }
}
