package HoaDonThanhToan;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TaoHoaDon {
    public JPanel taoHoaDon;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JButton taoHoaDonButton;
    private JButton nhapLaiButton;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    String m;
    String m2;

    public TaoHoaDon() {
        taoHoaDonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                SQLServerDataSource cn= new SQLServerDataSource();
                cn.setUser("sa");
                cn.setPassword("123");
                cn.setServerName("DESKTOP-OHK4JDG\\SQLEXPRESS");
                cn.setPortNumber(1433);
                cn.setDatabaseName("QLHD");
                try(Connection conn = cn.getConnection()) {
                    System.out.println("Da ket noi thanh cong");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from Khachhang");
                    while (rs.next()) {
                      if(rs.getString(1).equals(comboBox1.getItemAt(comboBox1.getSelectedIndex())))
                      {   m= (String) comboBox1.getItemAt(comboBox1.getSelectedIndex());
                          textField4.setText(rs.getString(2));
                          textField5.setText(rs.getString(3));
                      }
                    }

                } catch (SQLServerException throwables) {
                    throwables.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
                SQLServerDataSource cn= new SQLServerDataSource();
                cn.setUser("sa");
                cn.setPassword("123");
                cn.setServerName("DESKTOP-OHK4JDG\\SQLEXPRESS");
                cn.setPortNumber(1433);
                cn.setDatabaseName("QLHD");
                try(Connection conn = cn.getConnection()) {
                    System.out.println("Da ket noi thanh cong");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select * from Hanghoa");
                    while (rs.next()) {
                        if(rs.getString(1).equals(comboBox2.getItemAt(comboBox2.getSelectedIndex())))
                        {
                            m2= (String) comboBox2.getItemAt(comboBox2.getSelectedIndex());
                            textField7.setText(rs.getString(3));
                            textField8.setText(rs.getString(4));
                            textField10.setText(rs.getString(5));
                        }
                    }

                } catch (SQLServerException throwables) {
                    throwables.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


        });
        textField9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dg = Integer.parseInt(textField9.getText())*Integer.parseInt(textField10.getText());
                textField12.setText(""+dg+textField8.getText());
            }
        });
        taoHoaDonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SQLServerDataSource cn= new SQLServerDataSource();
                cn.setUser("sa");
                cn.setPassword("123");
                cn.setServerName("DESKTOP-OHK4JDG\\SQLEXPRESS");
                cn.setPortNumber(1433);
                cn.setDatabaseName("QLHD");
                try(Connection conn = cn.getConnection()) {
                    Statement stmt = conn.createStatement();
                    String sqlInsert = "INSERT INTO Hoadon(hdso, ngay, makh, trigia) "
                            + " VALUES("+textField1.getText()+","+textField2.getText()+","+m+","+textField11.getText()+");";
                    int numberRowsAffected = stmt.executeUpdate(sqlInsert);
                    System.out.println("Affected rows after inserted: " + numberRowsAffected);
                    JOptionPane.showMessageDialog(
                            taoHoaDon,
                            "Tao hoa don thanh cong",
                            "Thong bao",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLServerException throwables) {
                    JOptionPane.showMessageDialog(
                            taoHoaDon,
                            "Trung so hd hoac thong tin bi trong moi nhap lai",
                            "Thong bao",
                            JOptionPane.INFORMATION_MESSAGE);
                    throwables.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        nhapLaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField4.setText("");
                textField5.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField11.setText("");
                textField12.setText("");


            }
        });
    }

    public static void main(String[] args){
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new TaoHoaDon().taoHoaDon);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        textField2 = new JTextField();
        String pattern = "dd/MM/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();
        String todayAsString = df.format(today);
        textField2.setText(todayAsString);
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();
        List<String> mhh = new ArrayList<>();
        List<String> mkh = new ArrayList<>();
        SQLServerDataSource cn= new SQLServerDataSource();
        cn.setUser("sa");
        cn.setPassword("123");
        cn.setServerName("DESKTOP-OHK4JDG\\SQLEXPRESS");
        cn.setPortNumber(1433);
        cn.setDatabaseName("QLHD");
        try(Connection conn = cn.getConnection()) {
            System.out.println("Da ket noi thanh cong");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Khachhang");
            while (rs.next()) {
               mkh.add(rs.getString(1));
            }
            for(String a : mkh )
            {comboBox1.addItem(a);}
            Statement stmt2 = conn.createStatement();
            ResultSet rs2 = stmt2.executeQuery("select * from Hanghoa");
            while (rs2.next()) {
                mhh.add(rs2.getString(1));
            }
            for(String b : mhh )
            {comboBox2.addItem(b);}
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // TODO: place custom component creation code here
    }
    public void connect(){

    }
}
