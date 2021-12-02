/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4va5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class ChuongTrinh {
    ArrayList<SinhVienPoly> ds = null;
    Comparator<SinhVienPoly> ss = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return (int)(o1.getDiem()-o2.getDiem());
        }
    };
    
    public void Menu1()
    {
        System.out.println("Nhập vào loại sinh viên: ");
        System.out.println("1. Sinh viên IT");
        System.out.println("2. Sinh viên Biz");
        System.out.println("3. Kết thúc");
        System.out.print("Nhập vào lựa chọn: ");
    }
    public void Menu2()
    {
        System.out.println("Nhập thêm sinh viên: ");
        System.out.println("1. Có");
        System.out.println("2. Không");
        System.out.print("Nhập vào lựa chọn: ");
    }
    public void NhapDS()
    {
        ds = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        int lc1,lc2;
        System.out.println("Nhập danh sách sinh viên: ");
        do{
            Menu1();
            lc1 = nhap.nextInt();
            SinhVienPoly sv=null;
            switch(lc1)
            {
                case 1:
                    sv = new SinhVienIT();
                    sv.Nhap();
                    ds.add(sv);
                break;
                case 2:
                    sv = new SinhVienBiz();
                    sv.Nhap();
                    ds.add(sv);
            }
            Menu2();
            lc2 = nhap.nextInt();
        }while(lc2!=2);
        System.out.println();
    }
    public void Xuat()
    {
        System.out.println("Danh sách sinh viên: ");
        int i=1;
        for(SinhVienPoly sv:ds)
        {
            System.out.println("Thông tin sinh viên thứ "+i);
            sv.Xuat();
            i++;
            System.out.println();
        }
        System.out.println();
    }
    public void Loc()
    {
        int i=0;
        System.out.println("Danh sách sinh viên có học lực Giỏi: ");
        for(SinhVienPoly sv:ds)
        {
            if(sv.getHocLuc().equalsIgnoreCase("Giỏi"))
            {
                System.out.println("Thông tin sinh viên thứ "+i);
                sv.Xuat();
                i++;
            }
        }
        System.out.println();
    }
    public void SapXep()
    {
        System.out.println("Danh sách sinh viên sau khi sắp xếp: ");
        ds.sort(ss);
        Xuat();
        System.out.println();
    }
}
