import java.util.Scanner;

public class CalculadoraDeAposentadoria {
    
    public static void main(String[] args) {
        
       

        int idade = 0;
        String sexo;
        int restam;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu sexo: M = Masculino | F = Feminino ");
        sexo = scan.nextLine();

        switch (sexo.toLowerCase()) {
            case "masculino":
                
                System.out.println("Digite a sua idade: ");
                idade = scan.nextInt();

                if(idade >= 65){

                    System.err.println("Você está apto para se aposentar!");

                }
                else{
                    restam = 65 - idade;
                    System.err.println("Você não está apto a receber sua aposentadoria! Restam: " + restam + " anos!");
                }

                break;
        
            case "feminino":

                System.out.println("Digite a sua idade: ");
                idade = scan.nextInt();

                if(idade >= 62){

                    System.err.println("Você está apto para se aposentar!");

                }
                else{
                    restam = 62 - idade;
                    System.err.println("Você não está apto a receber sua aposentadoria! Restam: " + restam + " anos!");
                }
                break;
        }

    }

}
