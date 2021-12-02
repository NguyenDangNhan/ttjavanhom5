/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author nauq2
 */
public class ChuongTrinhQuanLy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyDanhSach qlds = new QuanLyDanhSach();
        //b
        qlds.NhapDS();
        qlds.XuatDS();
        //c
        qlds.TongDTTVN();
        qlds.TongDTTNN();
        //d
        qlds.TinhTBNN();
        //e
        qlds.TimKiem();
    }
    
}
