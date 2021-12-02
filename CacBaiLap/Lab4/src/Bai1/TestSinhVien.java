/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author nauq2
 */
public class TestSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        SinhVien sv1 = new SinhVien();
        sv1.setMasv("001");
        sv1.setTensv("Nguyễn Thành Trung");
        dssv.ThemSV(sv1);
        SinhVien sv2 = new SinhVien();
        sv2.setMasv("002");
        sv2.setTensv("Nguyễn Văn A");
        dssv.ThemSV(sv2);
        dssv.SapXep();
        System.out.println(dssv);
    }
    
}
