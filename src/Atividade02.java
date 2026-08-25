import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);

        int primeiroValor = 0;
        int segundoValor = 0;

        System.out.println("Informe o primeiro valor: ");
        primeiroValor = sc.nextInt();

        System.out.println("Informe o segundo valor: ");
        segundoValor = sc.nextInt();

        int soma = primeiroValor + segundoValor;
        int subtracao = primeiroValor - segundoValor;
        int multiplicacao = primeiroValor * segundoValor;
        double divisao = primeiroValor / segundoValor;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
