/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import javax.swing.*;

/**
 *
 * @author nauq2
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer result = new StringBuffer("<html><body><h1>Fibonacci Sequence</h1><ol>");
        long f1 = 0;
        long f2 = 1;
        for (int i = 0; i < 50; i++) {
            result.append("<li>");
            result.append(f1);
            long temp = f2;
            f2 = f1 + f2;
            f1 = temp;
        }
        result.append("</ol></body></html>");
        JEditorPane jep = new JEditorPane("text/html",result.toString( ));
        jep.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("Fibonacci Sequence");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show( );
    }
    
}
