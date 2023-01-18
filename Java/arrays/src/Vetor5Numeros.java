import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/

public class Vetor5Numeros {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int x = 1;

        int[] numeros = new int[5];

        do{
            System.out.println("Insira o numero " + x + ":");
            int numero = scan.nextInt();

            numeros[count] = numero;
            count++;
        } while(count < numeros.length);
        
        System.out.print("Os numeros são: ");
        for (int numerico : numeros) {
            System.out.print(numerico + " ");            
        }


    }
}
