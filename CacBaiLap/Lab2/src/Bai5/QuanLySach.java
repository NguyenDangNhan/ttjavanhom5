/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nauq2
 */
public class QuanLySach {

    /**
     * @param args the command line arguments
     */
    Scanner nhap = new Scanner(System.in);
    private ArrayList<TaiLieu> dstl;

    public QuanLySach() {
        dstl = new ArrayList<>();
    }
    
    public Sach TaoMoiSach()
    {
        Sach s = new Sach();
        System.out.print("Nhập mã sách: ");
        s.setMatl(nhap.nextLine());
        System.out.print("Nhập tên nhà xuất bản: ");
        s.setTennxb(nhap.nextLine());
        System.out.print("Nhập số bản phát hành: ");
        s.setSobanph(nhap.nextInt());
        nhap.nextLine();
        System.out.print("Nhập tên tác giả: ");
        s.setTentg(nhap.nextLine());
        System.out.print("Nhập tên sách: ");
        s.setTensach(nhap.nextLine());
        System.out.print("Nhập số trang: ");
        s.setSotrang(nhap.nextInt());
        return s;
    }
    
    public TapChi TaoMoiTapChi()
    {
        TapChi tc = new TapChi();
        System.out.print("Nhập mã tạp chí: ");
        tc.setMatl(nhap.nextLine());
        System.out.print("Nhập tên nhà xuất bản: ");
        tc.setTennxb(nhap.nextLine());
        System.out.print("Nhập số bản phát hành: ");
        tc.setSobanph(nhap.nextInt());
        System.out.print("Nhập số phát hành: ");
        tc.setSoph(nhap.nextInt());
        System.out.print("Nhập tháng phát hành: ");
        tc.setThangph(nhap.nextInt());
        return tc;
    }
    
    public Bao TaoMoiBao()
    {
        Bao b = new Bao();
        System.out.print("Nhập mã báo: ");
        b.setMatl(nhap.nextLine());
        System.out.print("Nhập tên nhà xuất bản: ");
        b.setTennxb(nhap.nextLine());
        System.out.print("Nhập số bản phát hành: ");
        b.setSobanph(nhap.nextInt());
        nhap.nextLine();
        System.out.print("Nhập ngày phát hành: ");
        b.setNgayph(convertStringToDate(nhap.nextLine()));
        return b;
    }
    
    private Date convertStringToDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(ddMMyyyy);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
    
    public void NhapDSTaiLieu()
    {
        int lc;
        do{
            System.out.println("==========Nhập tài liệu==========");
            System.out.println("1. Tạo mới sách");
            System.out.println("2. Tạo mới tạp chí");
            System.out.println("3. Tạo mới báo");
            System.out.println("4. Kết thúc");
            System.out.println("Nhập lựa chọn của bạn: ");
            lc = nhap.nextInt();
            nhap.nextLine();
            switch(lc)
            {
                case 1: 
                    dstl.add(TaoMoiSach());
                break;
                case 2: 
                    dstl.add(TaoMoiTapChi());
                break;
                case 3: 
                    dstl.add(TaoMoiBao());
                break;
                case 4:
                break;
                default:
                    System.out.println("Lựa chọn bạn vừa nhập không có trong Menu");
                break;
            }
        }while(lc!=4);
    }
    
    private void Xuat(TaiLieu tl)
    {
        if(tl instanceof Sach)
        {
            Sach s = (Sach) tl;
            System.out.println("Mã sách: "+s.getMatl());
            System.out.println("Tên nhà xuất bản: "+s.getTennxb());
            System.out.println("Số bản phát hành: "+s.getSobanph());
            System.out.println("Tên tác giả: "+s.getTentg());        
            System.out.println("Tên sách: "+s.getTensach());
            System.out.println("Số trang: "+s.getSotrang());
            System.out.println();
        }
        else if(tl instanceof TapChi)
        {
            TapChi tc = (TapChi) tl;
            System.out.println("Mã tạp chí: "+tc.getMatl());
            System.out.println("Tên nhà xuất bản: "+tc.getTennxb());
            System.out.println("Số bản phát hành: "+tc.getSobanph());  
            System.out.println("Số phát hành: "+tc.getSoph());
            System.out.println("Tháng phát hành: "+tc.getThangph());
            System.out.println();
        }
        else
        {
            Bao b = (Bao) tl;
            System.out.println("Mã tạp chí: "+b.getMatl());
            System.out.println("Tên nhà xuất bản: "+b.getTennxb());
            System.out.println("Số bản phát hành: "+b.getSobanph());
            System.out.println("Ngày phát hành: "+b.getNgayph());
            System.out.println();
        }
    }
    
    private String convertDateToString(Date nph) {
        return new SimpleDateFormat("dd/MM/yyyy").format(nph);
    }
    
    public void XuatDSTaiLieu()
    {
        int i=1;
        for(TaiLieu tl:dstl)
        {
            System.out.println("Thông tin tài liệu thứ "+i);
            Xuat(tl);
        }
    }
    
    public void LocTheoLoai(String loai)
    {
        if(loai.equalsIgnoreCase("Sach"))
        {
            for(TaiLieu tl:dstl)
            {
                if(tl instanceof Sach)
                {
                    Xuat(tl);
                    System.out.println();
                }
            }
        }
        else if(loai.equalsIgnoreCase("Tap Chi"))
        {
            for(TaiLieu tl:dstl)
            {
                if(tl instanceof TapChi)
                {
                    Xuat(tl);
                    System.out.println();
                }
            }
        }
        else if(loai.equalsIgnoreCase("Bao"))
        {
            for(TaiLieu tl:dstl)
            {
                if(tl instanceof Bao)
                {
                    Xuat(tl);
                    System.out.println();
                }
            }
        }
        else
            System.out.println();
    }
    
    public void TimKiemTheoTen(String ts)
    {
        for(TaiLieu tl:dstl)
        {
            if(tl instanceof Sach)
            {
                Sach s = (Sach)tl;
                if(s.getTensach().indexOf(ts)!=-1)
                {
                    Xuat(tl);
                    System.out.println();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        QuanLySach qls = new QuanLySach();
        System.out.println("Nhập vào danh sách tài liệu: ");
        qls.NhapDSTaiLieu();
        System.out.println("Danh sách tài liệu vừa nhập: ");
        System.out.println();
        qls.XuatDSTaiLieu();
        System.out.println();
        String chon;
        int loai;
        System.out.println("Chọn loại bạn muốn tìm: ");
        System.out.println("Phím 1: Sách");
        System.out.println("Phím 2: Tạp chí");
        System.out.println("Phím 3: Báo");
        System.out.println("Phím bất kỳ còn lại: Thoát");
        loai = nhap.nextInt();
        if(loai==1)
            chon="Sach";
        else if(loai==2)
            chon="Tap Chi";
        else if(loai==3)
            chon="Bao";
        else
            chon="";
        qls.LocTheoLoai(chon);
        System.out.print("Nhập vào tên sách bạn muốn tìm: ");
        String tkten = nhap.next();
        qls.TimKiemTheoTen(tkten);
    }
}
