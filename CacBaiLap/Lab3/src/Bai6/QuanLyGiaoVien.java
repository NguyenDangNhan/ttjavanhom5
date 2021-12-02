/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class QuanLyGiaoVien {

    /**
     * @param args the command line arguments
     */
    public static void Menu1(){
        System.out.println("==========Menu==========");
        System.out.println("1 Nhập thông tin giảng viên cơ hữu");
        System.out.println("2 Nhập thông tin giảng viên thỉnh giảng");
        System.out.println("3 Hiển thị toàn bộ thông tin");
        System.out.println("4 Hiện thị thông tin giảng viên cơ hữu");
        System.out.println("5 Hiện thị thông tin giảng viên thỉnh giảng");
        System.out.println("6 Tổng lương của toàn bộ giảng viên");
        System.out.println("7 Giảng viên lương cao nhất");
        System.out.println("8 Thoát");
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int n = 0;
        GiangVien g;
        ArrayList<GiangVien> ds=new ArrayList<GiangVien>();;
        do {
            Menu1();
            System.out.print("Nhập vào lựa chọn của bạn :");
            n = nhap.nextInt();
            nhap.nextLine();
            switch(n) 
            {
                case 1:
                    System.out.println("Nhập giảng viên cơ hữu:");
                    g = new GiangVienCoHuu();
                    g.Nhap();
                    ds.add(g);
                break;
                case 2: 
                    System.out.println("Nhập giảng viên thỉnh giảng:");
                    g = new GiangVienThinhGiang();
                    g.Nhap();
                    ds.add(g);
                break;
                case 3:
                    if(ds==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        System.out.println("Thông tin giảng viên vừa nhập: ");
                        int i=0;
                        for(GiangVien gv:ds){
                            System.out.println("Thông tin giảng viên thứ: "+(i+1));
                            i++;
                            gv.Xuat();
                        }  
                    }
                break;
                case 4:
                    if(ds==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        System.out.println("Thông tin giảng viên cơ hữu: ");
                        int i=0;
                        for(GiangVien gv:ds){
                            if(gv instanceof GiangVienCoHuu)
                            {
                                System.out.println("Thông tin giảng viên thứ: "+(i+1));
                                i++;
                                gv.Xuat();
                            }
                        }
                        if(i==0)
                            System.out.println("Không có giảng viên bạn cần tìm.");
                    }
                break;
                case 5:
                    if(ds==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        System.out.println("Thông tin giảng viên thỉnh giảng: ");
                        int i=0;
                        for(GiangVien gv:ds){
                            if(gv instanceof GiangVienThinhGiang)
                            {
                                System.out.println("Thông tin giảng viên thứ: "+(i+1));
                                i++;
                                gv.Xuat();
                            }
                        }
                        if(i==0)
                            System.out.println("Không có giảng viên bạn cần tìm.");
                    }
                break;
                case 6:
                    if(ds==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        float tong=0;
                        System.out.println("Tổng lương của toàn bộ giảng viên là: ");
                        for (GiangVien gv:ds) {
                            tong+=gv.getTongluong();
                        }
                        System.out.println(tong);
                    }
                break;
                case 7:
                    if(ds==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        System.out.println("Giảng viên có lương cao nhất");
                        float max=0;
                        for(GiangVien gv:ds)
                        {
                            if(max<gv.getTongluong())
                                max=gv.getTongluong();
                        }
                        for(GiangVien gv:ds)
                        {
                            if(max==gv.getTongluong())
                                gv.Xuat();
                        }
                    }
                break;
                case 8:
                break;
                default: 
                    System.out.println("Lựa chọn vừa nhập không có trong danh sách.");
                break;
            }
        }while(n!=8);
    }
}
