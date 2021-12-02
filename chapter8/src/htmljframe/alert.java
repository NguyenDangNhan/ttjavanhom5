package htmljframe;

import javax.swing.*;

public class alert {
    public JPanel alert;
    public JLabel jlb1;


    public static void main(String[] args){
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new alert().alert);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
