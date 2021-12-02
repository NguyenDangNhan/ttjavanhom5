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
public class SimpleWebBrowser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // get the first URL
        String initialPage = "https://www.w3schools.com/";
        if (args.length > 0) 
            initialPage = args[0];
        // set up the editor pane
        JEditorPane jep = new JEditorPane( );
        jep.setEditable(false);
        jep.addHyperlinkListener(new LinkFollower(jep));
        try {
            jep.setPage(initialPage);
        }
        catch (IOException e) {
            System.err.println("Usage: java SimpleWebBrowser url");
            System.err.println(e);
            System.exit(-1);
        }
        // set up the window
        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("Simple Web Browser");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show( );
    }
    
}
