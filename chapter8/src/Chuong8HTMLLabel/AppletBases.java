/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author nauq2
 */
public class AppletBases extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g) {
        g.drawString("Codebase: "+ this.getCodeBase().toString( ), 10, 40);
        g.drawString("Document base: " + this.getDocumentBase().toString( ), 10, 65);
}

    // TODO overwrite start(), stop() and destroy() methods
}
