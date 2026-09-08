import java.util.Scanner;

public class EstruturaDeDecisao {
    static void main(String[] args) {

        // variáveis
        int idade = 0;

        // input
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}