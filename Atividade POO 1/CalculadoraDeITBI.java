import javax.swing.JOptionPane;

public class CalculadoraDeITBI {

    public static void main(String[] args) {
        
        JOptionPane painel = new JOptionPane();

        float transacao;
        float venal;
        float imposto;
        float maior;
        float valorFinal;

        try {

            transacao = Float.valueOf(painel.showInputDialog(null, "Digite o valor da transação: "));
            venal = Float.valueOf(painel.showInputDialog(null, "Digite o valor do venal do imóvel: "));
            imposto = Float.valueOf(painel.showInputDialog(null,"Digite a porcentagem de imposto: "));

            if (transacao > venal) {
                maior = transacao; 
            }
            else{
                maior = venal;
            }

            valorFinal = maior * (imposto/100);
            
            painel.showConfirmDialog(null, String.valueOf(maior));
    
        } catch (Exception e) {

            painel.showConfirmDialog(null, "Insira somente números!");

        }
        
    }

}
