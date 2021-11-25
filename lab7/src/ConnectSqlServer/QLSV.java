package ConnectSqlServer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class QLSV {

    private JPanel panelMain;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTable table1 ;
    String[] columnNames = {"Ma sv", "Ho ten","Email","Dia chi","Ma lop"};;
    public QLSV(){
    }
    public static void main (String[] agrs){
        QLSV a = new QLSV();
        JFrame frame = new JFrame("Quan li sinh vien");
        frame.setContentPane(a.panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        DefaultTableModel model = new DefaultTableModel(0,5);
        model.setColumnIdentifiers(columnNames);
        table1 = new JTable(model);
        // TODO: place custom component creation code here
    }
}
