import java.util.Scanner;

/*
Revisão do carro

Se tiver menos de 10mil km não precisa de revisao
Se tiver entre 10mil e 20mil fazer revisao basica
Se tiver entre 20mil e 30mil fazer revisao plus
Se tiver entre 30mil e 40mil fazer revisao mega
 */

public class EstruturaDeDecisaoSwitch {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        System.out.println("Quantos km rodados? ");
        int kmRodados = sc.nextInt();

        if(kmRodados < 10000){
            System.out.println("Não precisa de revisão");
        } else if (kmRodados >=10000 && kmRodados < 20000) {
            System.out.println("Revisão básica");
        } else if (kmRodados >= 20000 && kmRodados < 30000) {
                System.out.println("Revisão plus");
            } else if (kmRodados >= 30000 && kmRodados < 40000) {
                System.out.println("Revisão mega");
            } else {
                System.out.println("JOGA FORA!");
            }
        }
    }
}
/*
 * Pesquisar como mudar esse conjunto de if para o switch
 * COLEM AQUI EM BAIXO
 * testem o arrow
 */