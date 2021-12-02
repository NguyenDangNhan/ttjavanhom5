/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;
import java.awt.*;
import java.awt.image.*;

/**
 *
 * @author nauq2
 */
public class DelayedImageView extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image picture;
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.picture = this.getImage(this.getCodeBase( ), "cup.gif" /*"anhvd.jpg"*/);
    }
    @Override
    public void paint(Graphics g) {
        if(!g.drawImage(this.picture, 0, 0, this)) {
            g.drawString("Loading Picture. Please hang on", 25, 50);
        }
    }
    @Override
    public boolean imageUpdate(Image image, int infoflags, int x, int y, int width, int height) {
        if ((infoflags & ImageObserver.ALLBITS) == ImageObserver.ALLBITS)
        {
            this.repaint( );
            return false;
        }
        else {
            return true;
        }
    }
    // TODO overwrite start(), stop() and destroy() methods
}
