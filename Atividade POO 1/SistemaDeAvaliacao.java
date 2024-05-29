import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    
    public static void main(String[] args) {
        
        JOptionPane painel = new JOptionPane();

        float nota1, nota2;
        float media;
        String status;
    

        try {

            nota1 = Float.valueOf(painel.showInputDialog(null, "Digite a 1ª nota do aluno: "));
            nota2 = Float.valueOf(painel.showInputDialog(null, "Digite a 2ª nota do aluno: "));

            media = (nota1+nota2)/2;

            if(media >= 6){
                status = "Aprovado!";
            }
            else{
                status = "Reprovado!";
            }

            painel.showMessageDialog(null, "A média do aluno foi" +  " " +String.valueOf(media) + ", então ele está: " + status);
    
    
        } catch (Exception e) {

            painel.showConfirmDialog(null, "Insira somente números!");

        }
        
    }

}
