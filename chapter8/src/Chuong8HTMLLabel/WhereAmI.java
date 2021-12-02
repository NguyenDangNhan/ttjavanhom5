/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author nauq2
 */
public class WhereAmI extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint (Graphics g) {
        g.drawString(this.getDocumentBase().toString( ), 25, 50);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
