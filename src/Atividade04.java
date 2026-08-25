import java.util.Scanner;

public class Atividade04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String nome = "";
        int anoAtual = 0;
        int anoNascimento = 0;

        // Programa
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o ano em que você nasceu: ");
        anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = sc.nextInt();

        // Cálculo da idade
        int idade = anoAtual - anoNascimento;

        // Resultado
        System.out.println(nome + " tem " + idade + " anos");
    }
}
