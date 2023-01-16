import java.util.Scanner;

public class CadastroSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //cadastro login

        System.out.println("Digite um login: ");
        String login = scan.next();

        System.out.println("Digite uma senha: ");
        String senha = scan.next();

            while(true){
                if(login.equals(senha)){
                System.out.println("Essa senha não: ");
                senha = scan.next();}

                else break;
            }

        System.out.println("Cadastro efetuado!");
    }
}
