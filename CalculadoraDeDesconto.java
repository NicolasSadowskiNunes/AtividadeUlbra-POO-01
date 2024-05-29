import java.util.Scanner;

public class CalculadoraDeDesconto {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float valorProduto;
        float valorDescontado;
        float resultado;

        System.out.println("Digite o valor do produto: ");
        valorProduto = scan.nextFloat();

        System.out.println("Digite a porcentagem do desconto: ");
        valorDescontado = scan.nextFloat();

        resultado = valorProduto - ((valorProduto * valorDescontado) / 100);

        System.out.println("O produto com o desconto fica no valor de: " + resultado);

    }

}
