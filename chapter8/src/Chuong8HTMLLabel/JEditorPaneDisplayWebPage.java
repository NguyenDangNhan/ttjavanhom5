/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author nauq2
 */
public class JEditorPaneDisplayWebPage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JEditorPane jep = new JEditorPane( );
        jep.setEditable(false);
        try {
            jep.setPage("http://www.oreilly.com");
        }
        catch (IOException e) {
            jep.setContentType("text/html");
            jep.setText("<html>Could not load http://www.oreilly.com</html>");
        }
        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("O'Reilly & Associates");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show( );
    }
    
}
