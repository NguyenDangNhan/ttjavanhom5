package demoheroku;


/* HtmlDemo.java needs no other files. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class HtmlDemo extends JPanel
        implements ActionListener {
    JLabel theLabel;
    JTextArea htmlTextArea;

    public HtmlDemo() throws IOException  {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        File htmlFile = new File("C:\\Users\\nhan\\IdeaProjects\\chapter8\\src\\demoheroku\\index.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        String initialText =  doc.toString();

        htmlTextArea = new JTextArea(10, 20);
        htmlTextArea.setText(initialText);
        JScrollPane scrollPane = new JScrollPane(htmlTextArea);

        JButton changeTheLabel = new JButton("Change the label");
        changeTheLabel.setMnemonic(KeyEvent.VK_C);
        changeTheLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        changeTheLabel.addActionListener(this);

        theLabel = new JLabel(initialText) {
        };
        theLabel.setVerticalAlignment(SwingConstants.CENTER);
        theLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JScrollPane scrollPane2 = new JScrollPane(theLabel);
//        JPanel leftPanel = new JPanel();
//        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
//        leftPanel.setBorder(BorderFactory.createCompoundBorder(
//                BorderFactory.createTitledBorder(
//                        "Edit the HTML, then click the button"),
//                BorderFactory.createEmptyBorder(10,10,10,10)));
//        leftPanel.add(scrollPane);
//        leftPanel.add(Box.createRigidArea(new Dimension(0,10)));
//        leftPanel.add(changeTheLabel);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS));
        rightPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("A label with HTML"),
                BorderFactory.createEmptyBorder(10,10,10,10)));
        rightPanel.add(scrollPane2);
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//        add(leftPanel);
        add(Box.createRigidArea(new Dimension(10,0)));
        add(rightPanel);
    }

    //React to the user pushing the Change button.
    public void actionPerformed(ActionEvent e) {
        theLabel.setText(htmlTextArea.getText());
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() throws IOException {
        //Create and set up the window.
        JFrame frame = new JFrame("HtmlDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new HtmlDemo());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                try {
                    createAndShowGUI();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
