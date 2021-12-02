/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class QuanLyDanhSach {
    Scanner nhap = new Scanner(System.in);
    private ArrayList<KhachHang> ds;
    QuanLyThongTin qltt = new QuanLyThongTin();
    private void Menu()
    {
        System.out.println("Phím 1: Nhập thông tin khách hàng Việt Nam.");
        System.out.println("Phím 2: Nhập thông tin khách hàng Ngước Ngoài.");
        System.out.println("Phím bất kỳ còn lại: Kết thúc.");
        System.out.print("Vui lòng nhập vào lựa chọn: ");
    }
    public QuanLyDanhSach() {
        ds = new ArrayList<>();
    }

    public ArrayList<KhachHang> getDs() {
        return ds;
    }

    public void setDs(ArrayList<KhachHang> ds) {
        this.ds = ds;
    }
    
    public void NhapDS()
    {
        int lc;
        System.out.println("Nhập danh sách thông tin khách hàng: ");
        do{
            Menu();
            lc = nhap.nextInt();
            switch(lc)
            {
                case 1:
                    KhachVietNam khvn = new KhachVietNam();
                    ds.add(qltt.TaoMoiKhachHangVN(khvn));
                break;
                case 2:
                    KhachNuocNgoai khnn = new KhachNuocNgoai();
                    ds.add(qltt.TaoMoiKhachHangNN(khnn));
                break;
            }
        }while(lc==1||lc==2);
    }
    public void Xuat(KhachHang kh)
    {
        if(kh instanceof KhachVietNam)
        {
            KhachVietNam khvn = (KhachVietNam)kh;
            qltt.XuatKhachVN(khvn);
        }
        else
        {
            KhachNuocNgoai khnn = (KhachNuocNgoai)kh;
            qltt.XuatKhachNN(khnn);
        }
    }
    public void XuatDS()
    {
        for(KhachHang kh:ds)
            Xuat(kh);
    }
    public double TongKhachVN()
    {
        double tong=0;
        for(KhachHang kh:ds)
        {
            if(kh instanceof KhachVietNam)
            tong+=kh.getSl();
        }
        return tong;
    }
    public double TongKhachNN()
    {
        double tong=0;
        for(KhachHang kh:ds)
        {
            if(kh instanceof KhachNuocNgoai)
                tong+=kh.getSl();
        }
        return tong;
    }
    public void TongDTTVN()
    {
        System.out.println("Tổng lượng điện tiêu thụ của khách hàng Việt Nam là: "+TongKhachVN());
    }
    public void TongDTTNN()
    {
        System.out.println("Tổng lượng điện tiêu thụ của khách hàng Nước Ngoài là: "+TongKhachNN());
    }
    public double TrungbinhTT()
    {
        double tong=0;
        int dem=0;
        for(KhachHang kh:ds)
        {
            if(kh instanceof KhachNuocNgoai)
            {
                tong+=kh.getTt();
                dem++;
            }
        }
        return tong/dem;
    }
    
    public void TinhTBNN()
    {
        System.out.println("Trung bình thành tiền trong danh sách khách hàng nước ngoài là: "+TrungbinhTT());
    }
    public void TimKiem()
    {
        for(KhachHang kh:ds)
        {
            if(kh.getNgayHD().after(qltt.convertStringToDate("31/08/2013"))&&kh.getNgayHD().before(qltt.convertStringToDate("01/10/2013")))
                Xuat(kh);
        }
    }
}
