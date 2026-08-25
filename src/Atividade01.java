import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        //Declaração de variáveis
        String nome = "";
        int idade = 0;
        String curso = "";
        int periodo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite o seu curso: ");
        curso = sc.next();

        System.out.println("Digite o seu período: ");
        periodo = sc.nextInt();

        // Print das informações na tela
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
    }
}