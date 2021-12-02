/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;
import java.awt.*;
import java.net.*;

/**
 *
 * @author nauq2
 */
public class ImageView extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
    Image picture;
    public void init() {
        // TODO start asynchronous download of heavy resources
        try {
            URL u = new URL(this.getCodeBase( ),/*this.getParameter("IMAGE")*/"anhvd.jpg");
            this.picture = this.getImage(u);
            System.err.println(u);
        }
        catch (MalformedURLException e) {
        // shouldn't happen, the codebase is never malformed
        }
    }
    public void paint (Graphics g) {
        g.drawImage(this.picture, 0, 0, this);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
