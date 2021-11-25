package HoaDonThanhToan;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HienThiHoaDon {
    public JPanel hienThiHoaDon;
    private JTable table1;
    private JScrollPane scrollPane1;
    String[] columnNames={"Ma Khach Hang","Ten Khach Hang","Dien Thoai"};
    Object[] data={"1","2","3","4"};

    public static void main(String[] args){
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new HienThiHoaDon().hienThiHoaDon);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        DefaultTableModel model = new DefaultTableModel(0,5);
        model.setColumnIdentifiers(columnNames);
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
                Object[] data={rs.getString(1),rs.getString(2),
                        rs.getString(3)};
                model.addRow(data);
            }
            table1 = new JTable(model);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // TODO: place custom component creation code here
    }
}
