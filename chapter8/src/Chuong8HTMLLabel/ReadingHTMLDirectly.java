/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.html.*;

/**
 *
 * @author nauq2
 */
public class ReadingHTMLDirectly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JEditorPane jep = new JEditorPane( );
        jep.setEditable(false);
        EditorKit htmlKit = jep.getEditorKitForContentType("text/html");
        HTMLDocument doc = (HTMLDocument) htmlKit.createDefaultDocument( );
        jep.setEditorKit(htmlKit);
        try {
            URL u = new URL("https://www.w3schools.com/");
            InputStream in = u.openStream( );
            jep.read(in, doc);
        }
        catch (IOException e) {
            System.err.println(e);
        }
        JScrollPane scrollPane = new JScrollPane(jep);
        JFrame f = new JFrame("w3schools");
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setContentPane(scrollPane);
        f.setSize(512, 342);
        f.show( );
    }
    
}
