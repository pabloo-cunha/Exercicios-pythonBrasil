import java.util.Scanner;

public class ValidarInformacao {
/*
* Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
*/

     public static void main(String[] args) {

        boolean condicoes = false;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um nome: ");
        String nome = scan.next();
        while(nome.length() <= 3){
            System.out.println("Minimo 4 caracteres. Digite novamente: ");
            nome = scan.next();
        }

        System.out.println("Sua idade: ");
        int idade = scan.nextInt();
        while(idade < 0 | idade > 150){
            System.out.println("Idade invalida!");
            idade = scan.nextInt();
        }

        System.out.println("Salario: ");
        double salario = scan.nextDouble();
        while(salario <= 0){
            System.out.println("O Salario precisa ser maior que 0.");
            salario = scan.nextDouble();
        }

        System.out.println("Sexo(f para feminino e m para masculino): ");
        char sexo = scan.next().charAt(0);
        while(sexo != 'm' && sexo != 'f'){
            System.out.println("digite apenas uma das opções: ");
            sexo = scan.next().charAt(0);
        }

        System.out.println("Estado civil(s = solteiro, c = casado, v = viuvo e d= divorciado): ");
        char estadoCivil = scan.next().charAt(0);
        while(estadoCivil != 's' & estadoCivil != 'c' & estadoCivil != 'v' & estadoCivil != 'd'){
            System.out.println("Digite uma entre as opções: ");
            estadoCivil = scan.next().charAt(0);
        }
        

     }
}
