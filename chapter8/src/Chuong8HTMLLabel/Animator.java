package Chuong8HTMLLabel;

import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;
public class Animator extends Applet implements Runnable, MouseListener {
    private boolean running = false;
    private int currentCell = 0;
    private Vector cells = new Vector( );
    private MediaTracker tracker;
    public void init( ) {
        this.addMouseListener(this);
        String nextCell;
        this.tracker = new MediaTracker(this);
        //Image img = this.getImage(this.getCodeBase(),"anhvd.jpg");
        for (int i = 0; (nextCell = this.getParameter("Cell" + i)) != null; i++) {
            Image img = this.getImage(this.getDocumentBase( ), nextCell);
            cells.addElement(img);
            tracker.addImage(img, i);
            // start loading the image in a separate thread
            tracker.checkID(i, true);
        }
    }
    public void run( ) {
    // wait for all images to finish loading
        try {
            this.tracker.waitForAll( );
        }
        catch (InterruptedException e) {
            
        }
        for (currentCell=0; currentCell < cells.size( ); currentCell++){
            if (!running) 
                return;
            // paint the cell
            this.repaint( );
            // sleep for a tenth of a second
            // i.e. play ten frames a second
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ie) {
                
            }
        }
    }
    public void stop( ) {
        this.running = false;
    }
    public void start( ) {
        this.running = true;
        Thread play = new Thread(this);
        play.start( );
    }
    public void paint(Graphics g) {
        g.drawImage((Image) cells.elementAt(currentCell), 0, 0, this);
    }
// The convention is that a mouseClick starts
// a stopped applet and stops a running applet.
    public void mouseClicked(MouseEvent e) {
        if (running) {
            this.stop( );
        }
        else {
            this.start( );
        }
    }
// do-nothing methods required to implement the MouseListener interface
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
}