/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;

/**
 *
 * @author nauq2
 */
public class RelativeBeep extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    private AudioClip beep;
    private boolean stopped = false;
    public void init() {
        // TODO start asynchronous download of heavy resources
        beep = this.getAudioClip(this.getCodeBase( ),"sounds/nhacvd.wav");
        if (beep != null) {
            Thread t = new Thread(this);
            t.start( );
        }
    }
    
    public void start( ) {
        this.stopped = false;
    }
    public void stop( ) {
        this.stopped = true;
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void run() {
        Thread.currentThread( ).setPriority(Thread.MIN_PRIORITY);
        while (true) {
            if (!stopped)
                beep.play( );
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                
            }
        }
    }
}
