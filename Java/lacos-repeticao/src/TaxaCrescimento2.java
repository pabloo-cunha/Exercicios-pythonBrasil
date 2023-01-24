import java.util.Locale;
import java.util.Scanner;

public class TaxaCrescimento2 {
/*
 * Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
 * Valide a entrada e permita repetir a operação.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int menorPais = 0;
        int maiorPais = 0;
        double menorTaxa = 0;
        double maiorTaxa = 0;
        int count = 0;

        System.out.println("Habitantes do País A: ");
        int paisA = sc.nextInt();
        System.out.println("Taxa de crescimento do País A: ");
        double taxaA = sc.nextDouble();

        System.out.println("Habitantes do pais B: ");
        int paisB = sc.nextInt();
        System.out.println("Taxa de crescimento do País A: ");
        double taxaB = sc.nextDouble();

        if ((paisA < paisB && taxaA <= taxaB) | (paisB < paisA && taxaB <= taxaA)) 
        System.out.println("Um País não poderá ultrapassar o outro! ");
        else{

            if (paisA < paisB){
                menorPais = paisA;
                maiorPais = paisB;

                menorTaxa = taxaB;
                maiorTaxa = taxaA;
            }else{
                menorPais = paisB;
                maiorPais = paisA;

                menorTaxa = taxaA;
                maiorTaxa = taxaB;
            }
        }
        do{
            menorPais += (menorPais*(maiorTaxa/100));
            maiorPais += (maiorPais*(menorTaxa/100));

            count ++;

        } while(menorPais <= maiorPais);

        System.out.println("O menor País ultrapassara o maior em " + count + " anos");

        
        




    }
}
