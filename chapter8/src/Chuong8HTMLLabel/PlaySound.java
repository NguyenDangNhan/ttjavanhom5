/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;
import java.net.*;

/**
 *
 * @author nauq2
 */
public class PlaySound extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        try {
            URL u = new URL(this.getCodeBase( ),/*this.getParameter("sound")*/"nhacvd.wav");
            this.play(u);
        }
        catch (MalformedURLException e) {
            
        }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
