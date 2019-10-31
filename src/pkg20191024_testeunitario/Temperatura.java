package pkg20191024_testeunitario;

import javax.swing.JOptionPane;

public class Temperatura {

    public static void main(String args[]) {

        int t1, t2, t3, t4, media;

        String TEMP1, TEMP2, TEMP3, TEMP4;

        TEMP1 = JOptionPane.showInputDialog("Entre com a T1");
        TEMP2 = JOptionPane.showInputDialog("Entre com a T2");
        TEMP3 = JOptionPane.showInputDialog("Entre com a T3");
        TEMP4 = JOptionPane.showInputDialog("Entre com a T4");

        t1 = Integer.parseInt(TEMP1);
        t2 = Integer.parseInt(TEMP2);
        t3 = Integer.parseInt(TEMP3);
        t4 = Integer.parseInt(TEMP4);

        media = (t1 + t2 + t3 + t4) / 4;

        JOptionPane.showMessageDialog(null, "Temperatura Media   " + media, ".", JOptionPane.PLAIN_MESSAGE);
        System.out.println("Total  =" + media);
        System.exit(0);

    }

}

