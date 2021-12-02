/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author nauq2
 */
public class ExampleAudio extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Button play,stop;
    AudioClip audioClip;
    public void init() {
        // TODO start asynchronous download of heavy resources
        play = new Button(" Play in Loop ");
        add(play);
        play.addActionListener(this);
        stop = new Button(" Stop ");
        add(stop);
        stop.addActionListener(this);
        audioClip = getAudioClip(getCodeBase(), "sounds/nhacvd.wav");
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        Button source = (Button)e.getSource();
        if (source.getLabel() == " Play in Loop ") {
            audioClip.play();
        } else if(source.getLabel() == "  Stop  "){
            audioClip.stop();
        }
    }
}
