import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int x = 1;
        int numero = 0;

        while(count < 5){
            System.out.println("Insira o valor numero " + x);
            numero += scan.nextDouble();
            x ++;
            count++;
        }
        int media = numero/count;

        

        System.out.println("A soma de numeros é: " + numero);
        System.out.println("A média dos numeros são: " + media);
    }
    
}
