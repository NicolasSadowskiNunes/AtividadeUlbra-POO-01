import java.io.IOException;
import java.util.Scanner;


public class Login {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = 3;
        String user;
        String pswd;

        

        while (i != 0) {
            
            System.out.println("Digite o usuário: ");
            user = scan.nextLine();

            System.out.println("Digite a senha: ");
            pswd = scan.nextLine();

            if(user.equals("java8") & pswd.equals("java8")){
                System.out.println("Bem-vindo ao sistema!");
            }
            else{
                System.out.println("Você tem " + i + " tentativas restantes!");
                i--;
            }

        }

        System.out.println("Usuário bloqueado!");



    }

}
