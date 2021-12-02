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
public class HTMLLabelApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        JLabel theText = new JLabel(
                        "<html>Hello! This is a multiline label with <b>bold</b> "
                        + "and <i>italic</i> text. <P> "
                        + "It can use paragraphs, horizontal lines, <hr> "
                        + "<font color=red>colors red</font> "
                        + "and most of the other basic features of HTML 3.2</html>");
        this.getContentPane( ).add(theText);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
