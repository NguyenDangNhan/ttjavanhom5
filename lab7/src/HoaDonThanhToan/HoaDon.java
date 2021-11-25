package HoaDonThanhToan;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoaDon {
    private javax.swing.JPanel JPanel1;
    private JMenu menuHeThong;
    private JMenu menuChucNang;
    private JMenuBar MenuBar;
    private JTable table1;

    public HoaDon() {

    }

    public static void main(String[] args){
        JFrame frame= new JFrame("Thuc tap lap trinh mang");
        frame.setContentPane(new HoaDon().JPanel1);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        JMenuItem exit = new JMenuItem("Exit       ");
        JMenuItem ht = new JMenuItem("Thong Tin Khach Hang");
        JMenuItem thd = new JMenuItem("Tao hoa don");

        menuChucNang = new JMenu();
        menuHeThong = new JMenu();
        menuHeThong.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuChucNang.add(ht);
        menuChucNang.add(thd);

        JPanel1 = new JPanel();
        JPanel1.setSize(400,400);
        ht.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame= new JFrame("Thong Tin Khach Hang");
                frame.setContentPane(new HienThiHoaDon().hienThiHoaDon);
                frame.setSize(400,400);
                frame.pack();
                frame.setVisible(true);
            }
        });
        thd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame= new JFrame("Tao Hoa Don");
                frame.setContentPane(new TaoHoaDon().taoHoaDon);
                frame.setSize(400,400);

                frame.pack();
                frame.setVisible(true);
            }
        });

        // TODO: place custom component creation code here
    }
}
