import java.util.Scanner;

public class Resistencia {
    
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);

        int[] resistencias = new int[4];
        int equivalente = 0;
        int maior = 0;
        int menor = 0;

        for(int i = 1; i < resistencias.length; i++){
            System.out.println("Digite o valor da " + i + "ª resistênica");
            resistencias[i] = scan.nextInt();
            equivalente += resistencias[i];

            if(resistencias[i]> maior ){
                maior = resistencias[i];
            }
            else if (resistencias[i] < menor) {
                menor = resistencias[i];
            }

        }


        System.out.println("Resistência equivalente " + equivalente);
        System.out.println("Maior resistência: " + maior);
        System.out.println("Menor resistência: " + menor);

    }

}
