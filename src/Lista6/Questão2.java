package lista6;
import javax.swing.JOptionPane;
public class Questao2 extends ExcessaoAcimaDeCemException{
public static void main(String[] args) throws ExcessaoAcimaDeCemException{
    int n = 0;
    int a = 0;
    float m = 0;
    int cont = 0;
    do{
       try{
        a=(Integer.parseInt(JOptionPane.showInputDialog("Digite um número, até a conta der 100! A conta já deu: "+n+" Já foram contados "+cont+" números"+"A média é:"+m)));
        cont++;
        n=n+a;
        m=(float)n/cont;
        if(n>=100){
            JOptionPane.showMessageDialog(null,"A conta já deu: "+n+" foram contados "+cont+" números"+" A média é:"+m);
            throw new ExcessaoAcimaDeCemException();
        }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Digite um número válido!");  
       }
       }while(n<=100);
    }
}

