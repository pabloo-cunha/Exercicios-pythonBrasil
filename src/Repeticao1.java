import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um numero entre 0 e 10: ");
        int numero = scan.nextInt();

        while(numero < 0 | numero > 10){
            
            System.out.println("Digite um numero válido: ");
            numero = scan.nextInt();

        }

        System.out.println("Numero digitado: " + numero);
    }
}
