/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author nauq2
 */
public class LinkFollower implements HyperlinkListener{
    private JEditorPane pane;
    public LinkFollower(JEditorPane pane) {
        this.pane = pane;
    }
    public void hyperlinkUpdate(HyperlinkEvent evt) {
        if (evt.getEventType( ) == HyperlinkEvent.EventType.ACTIVATED) {
            try {
                pane.setPage(evt.getURL( ));
            }
            catch (Exception e) {
                
            }
        }
    }
}
