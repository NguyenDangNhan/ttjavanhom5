package demoheroku;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class demohtml {
    private JTextArea textArea1;
    private JPanel panel1;
    private JEditorPane editorPane1;

    public static void main(String[] args){
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new demohtml().panel1);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() throws IOException {
        File htmlFile = new File("C:\\Users\\nhan\\IdeaProjects\\chapter8\\src\\demoheroku\\index.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        String initialText = doc.toString();
        editorPane1 = new JEditorPane();
        editorPane1.setContentType("text/html");

    }
}
