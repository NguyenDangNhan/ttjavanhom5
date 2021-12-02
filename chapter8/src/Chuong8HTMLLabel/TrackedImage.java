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
public class TrackedImage extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private Image picture;
    private MediaTracker tracker;
    public void init() {
        // TODO start asynchronous download of heavy resources
        this.picture = this.getImage(this.getCodeBase( ),"cup.gif");
        this.tracker = new MediaTracker(this);
        this.tracker.addImage(this.picture, 1);
        Thread play = new Thread(this);
        play.start( );
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void run() {
        try {
            this.tracker.waitForID(1);
            this.repaint( );
        }
        catch (InterruptedException ie) {
            
        }
    }
    public void paint(Graphics g) {
        if (this.tracker.checkID(1, true)) {
            g.drawImage(this.picture, 0, 0, this);
        }
        else {
            g.drawString("Loading Picture. Please hang on", 25, 50);
        }
    }
}
