package chapter8;

import javax.swing.text.*;
import javax.swing.text.html.*;
import javax.swing.text.html.parser.*;
import java.io.*;
import java.net.*;
public class LineBreakingTagStripper
        extends HTMLEditorKit.ParserCallback {
    private Writer out;
    private String lineSeparator;

    public LineBreakingTagStripper(Writer out) {
        this(out, System.getProperty("line.separator", "\r\n"));
    }

    public LineBreakingTagStripper(Writer out, String lineSeparator) {
        this.out = out;
        this.lineSeparator = lineSeparator;
    }

    public void handleText(char[] text, int position) {
        try {
            out.write(text);
            out.flush( );
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }

    public void handleEndTag(HTML.Tag tag, int position) {
        try {
            if (tag.isBlock( )) {
                out.write(lineSeparator);
                out.write(lineSeparator);
            }
            else if (tag.breaksFlow( )) {
                out.write(lineSeparator);
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }

    }
    public void handleSimpleTag(HTML.Tag tag,
                                MutableAttributeSet attributes, int position) {

        try {
            if (tag.isBlock( )) {
                out.write(lineSeparator);
                out.write(lineSeparator);
            }
            else if (tag.breaksFlow( )) {
                out.write(lineSeparator);
            }
            else {
                out.write(' ');
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }

    }

}