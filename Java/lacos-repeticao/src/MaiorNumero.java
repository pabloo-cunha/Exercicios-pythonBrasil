import java.util.Scanner;

public class MaiorNumero {
    /*
    Faça um programa que leia 5 números e informe o maior número.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int maiorNumero = 0;
        int count = 0;

        while (count < 5){
            if (num > maiorNumero) maiorNumero = num;
            num = sc.nextInt();
            count++;
        }

        System.out.println("Maior Numero: " + maiorNumero);
    }
}
