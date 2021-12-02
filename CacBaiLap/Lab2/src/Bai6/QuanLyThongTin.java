/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nauq2
 */
public class QuanLyThongTin {
    Scanner nhap = new Scanner(System.in);
    public Date convertStringToDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(ddMMyyyy);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyThongTin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private double Tinhttvn(int sl,double dg,int dm)
    {
        double tt;
        if(sl<=dm)
            tt = (double)sl*dg;
        else
            tt = (double)dm*dg + (double)(sl-dm)*dg;
        return tt;
    }
    private double Tinhttnn(int sl,double dg)
    {
        return (double)sl*dg;
    }
    public KhachVietNam TaoMoiKhachHangVN(KhachVietNam khvn)
    {
        System.out.print("Nhập vào mã khách hàng: ");
        khvn.setMaKH(nhap.nextLine());
        System.out.print("Nhập vào họ tên khách hàng: ");
        khvn.setHtKH(nhap.nextLine());
        System.out.print("Nhập vào số lượng điện sử dụng: ");
        khvn.setSl(nhap.nextInt());
        System.out.print("Nhập vào đơn giá: ");
        khvn.setDg(nhap.nextDouble());
        nhap.nextLine();
        System.out.print("Nhập vào ngày hoạt động: ");
        khvn.setNgayHD(convertStringToDate(nhap.nextLine()));
        System.out.print("Nhập vào định mức: ");
        khvn.setDm(nhap.nextInt());
        nhap.nextLine();
        System.out.print("Nhập vào loại khách hàng: ");
        khvn.setLoaiKH(nhap.nextLine());
        khvn.setTt(Tinhttvn(khvn.getSl(), khvn.getDg(), khvn.getDm()));
        return khvn;
    }
    
    public KhachNuocNgoai TaoMoiKhachHangNN(KhachNuocNgoai khnn)
    {
        System.out.print("Nhập vào mã khách hàng: ");
        khnn.setMaKH(nhap.nextLine());
        System.out.print("Nhập vào họ tên khách hàng: ");
        khnn.setHtKH(nhap.nextLine());
        System.out.print("Nhập vào số lượng điện sử dụng: ");
        khnn.setSl(nhap.nextInt());
        System.out.print("Nhập vào đơn giá: ");
        khnn.setDg(nhap.nextDouble());
        nhap.nextLine();
        System.out.print("Nhập vào ngày hoạt động: ");
        khnn.setNgayHD(convertStringToDate(nhap.nextLine()));
        System.out.print("Nhập vào quốc tịch khách hàng: ");
        khnn.setQt(nhap.nextLine());
        khnn.setTt(Tinhttnn(khnn.getSl(), khnn.getDg()));
        return khnn;
    }
    public void XuatKhachVN(KhachVietNam khvn)
    {
        System.out.println("Mã khách hàng: "+khvn.getMaKH());
        System.out.println("Tên khách hàng: "+khvn.getHtKH());
        System.out.println("Số lượng tiêu thụ: "+khvn.getSl());
        System.out.println("Đơn giá: "+khvn.getDg());
        System.out.println("Định mức: "+khvn.getDm());
        System.out.println("Ngày hoạt động: "+khvn.getNgayHD());
        System.out.println("Loại khách hàng: "+khvn.getLoaiKH());
        System.out.println("Thành tiền: "+khvn.getTt());
    }
    public void XuatKhachNN(KhachNuocNgoai khnn)
    {
        System.out.println("Mã khách hàng: "+khnn.getMaKH());
        System.out.println("Tên khách hàng: "+khnn.getHtKH());
        System.out.println("Số lượng tiêu thụ: "+khnn.getSl());
        System.out.println("Đơn giá: "+khnn.getDg());
        System.out.println("Ngày hoạt động: "+khnn.getNgayHD());
        System.out.println("Quốc tịch: "+khnn.getQt());
        System.out.println("Thành tiền: "+khnn.getTt());
    }
}
