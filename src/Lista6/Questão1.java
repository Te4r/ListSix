package Lista6;

import javax.swing.JOptionPane;

public class Questão1 {

    public static void main(String[] args) {
        try {
            int[] x = new int[10];
            for (int i = 0; i < x.length; i++) {
                x[i] = i;
            }
            for (int i = 0; i <= x.length; i++) {
                System.out.println(x[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Erro de tamanho do array! " + e);
        }
    }
}
