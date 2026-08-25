import java.util.Scanner;

public class Atividade05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis
        String nome = "";
        int horasTrabalhadas = 0;
        double valorHora = 0;
        double salario = 0;

        // Programa
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite quantas horas você trabalhou: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor recebido por hora: ");
        valorHora = sc.nextInt();

        // Cálculo das horas trabalhadas
        salario = horasTrabalhadas * valorHora;

        // Resultado
        System.out.println("Nome: " + nome);
        System.out.println("Salário " + salario);
    }
}
