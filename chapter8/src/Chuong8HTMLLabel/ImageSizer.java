/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong8HTMLLabel;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.text.*;
import javax.swing.text.html.*;

/**
 *
 * @author nauq2
 */
public class ImageSizer extends HTMLEditorKit.ParserCallback{

    /**
     * @param args the command line arguments
     */
    
    private Writer out;
    private URL base;
    
    public ImageSizer(Writer out, URL base) {
        this.out = out;
        this.base = base;
    }
    
    public void handleStartTag(HTML.Tag tag,MutableAttributeSet attributes, int position) {
        try {
            out.write("<" + tag);
            this.writeAttributes(tag, attributes);
            out.write(">");
            out.flush( );
        }
        catch (IOException e) {
            System.err.println(e);
            e.printStackTrace( );
        }
    }
    
    public void handleEndTag(HTML.Tag tag, int position) {
        try {
            out.write("</" + tag + ">");
            if (tag.breaksFlow( )) out.write("\r\n");
            out.flush( );
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
    
    private void writeAttributes(HTML.Tag tag, AttributeSet attributes) throws IOException {
        Enumeration e = attributes.getAttributeNames( );
        while (e.hasMoreElements( )) {
            Object name = e.nextElement( );
            String value = (String) attributes.getAttribute(name);
            out.write(" " + name + "=\"" + value + "\"");
        }
// for the IMG tag we may have to add HEIGHT and WIDTH attributes
        if (tag == HTML.Tag.IMG) {
            try {
                if (attributes.getAttribute(HTML.Attribute.HEIGHT) == null|| attributes.getAttribute(HTML.Attribute.WIDTH) == null) {
                    URL u = new URL(base,
                    (String) attributes.getAttribute(HTML.Attribute.SRC));
                    Image img = Toolkit.getDefaultToolkit( ).getImage(u);
                    Component temp = new Label( );
                    MediaTracker tracker = new MediaTracker(temp);
                    tracker.addImage(img, 1);
                    try {
                        tracker.waitForID(1);
                        if (attributes.getAttribute(HTML.Attribute.WIDTH) == null) {
                            out.write(" WIDTH=\"" + img.getWidth(temp) + "\"");
                        }
                        if (attributes.getAttribute(HTML.Attribute.HEIGHT) ==null) {
                            out.write(" HEIGHT=\"" + img.getHeight(temp) + "\"");
                        }
                    }
                    catch (InterruptedException ex) {
                        
                    }
                }
            }
            catch (MalformedURLException ex) {
                // SRC attribute is malformed
            }
        }
    }
    
    public void handleComment(char[] text, int position) {
        try {
            out.write("<!-- ");
            out.write(text);
            out.write(" -->");
            out.flush( );
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public void handleText(char[] text, int position) {
        try {
            out.write(text);
            out.flush( );
        }
        catch (IOException e) {
            System.err.println(e);
            e.printStackTrace( );
        }
    }
    
    public void handleSimpleTag(HTML.Tag tag, MutableAttributeSet attributes, int position) {
        try {
            out.write("<" + tag);
            this.writeAttributes(tag, attributes);
            out.write(">");
        }
        catch (IOException e) {
            System.err.println(e);
            e.printStackTrace( );
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < args.length; i++) {
        // The ParserGetter class is from Chapter 8
            ParserGetter kit = new ParserGetter( );
            HTMLEditorKit.Parser parser = kit.getParser( );
            try {
                URL u = new URL(args[0]);
                InputStream in = u.openStream( );
                InputStreamReader r = new InputStreamReader(in);
                HTMLEditorKit.ParserCallback callback = new ImageSizer(new OutputStreamWriter(System.out), u);
                parser.parse(r, callback, false);
            }
            catch (IOException e) {
                System.err.println(e);
                e.printStackTrace( );
            }
        }
    }
    
}
