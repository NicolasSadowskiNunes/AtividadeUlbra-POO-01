import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int multi;
        int i = 1;

        System.out.println("Digite o número a ser multiplicado: ");
        multi = scan.nextInt();

        while (i <= 10) {

            System.out.println(multi + " X " + i + " = " + (multi * i));

            i++;
        }

    }


}
