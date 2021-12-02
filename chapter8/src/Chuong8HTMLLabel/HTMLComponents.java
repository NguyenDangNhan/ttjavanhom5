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
public class HTMLComponents extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        //JButton jb = new JButton("<HTML><B><I>Hello World!</I></B></HTML>");
        JButton jb = new JButton("<html><b color='red'><i>Hello World!</i></b></html>");
        this.getContentPane().add(jb);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
