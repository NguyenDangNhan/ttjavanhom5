/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author nauq2
 */

public class QuanLySanPham {

    /**
     * @param args the command line arguments
     */
    
    public static void Menu()
    {
        System.out.println("==========Menu==========");
        System.out.println("1. Nhập danh sách từ bàn phím.");
        System.out.println("2. Xuất danh sách vừa nhập.");
        System.out.println("3. Xuất danh sách ngẫu nhiên.");
        System.out.println("4. Sắp xếp giảm dần theo giá và xuất ra màn hình.");
        System.out.println("5. Tìm và xoá sản phẩm theo tên nhập từ bàn phím.");
        System.out.println("6. Xuất giá trung bình của các sản phẩm.");
        System.out.println("7. Thoát.");
        System.out.println("=========================");
        System.out.println("Nhập vào lựa chọn của bạn");
    }
    static Comparator<SanPham> ss = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham o1, SanPham o2) {
            return (int)(o2.getGia()-o1.getGia());
        }
    };
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        ArrayList<SanPham> ds = null;
        int chon,lc;
        do
        {
            Menu();
            chon=nhap.nextInt();
            switch(chon)
            {
                case 1:
                    ds = new ArrayList<>();
                    do
                    {
                        SanPham sp = new SanPham();
                        sp.Nhap();
                        ds.add(sp);
                        System.out.println();
                        System.out.println("Bạn có muốn nhập thêm sản phẩm: ");
                        System.out.println("1. Có.");
                        System.out.println("2. Không.");
                        lc = nhap.nextInt();
                        System.out.println();
                    }while(lc==1);
                break;
                case 2:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        for (int i = 0; i < ds.size(); i++) 
                        {
                            System.out.println("Thông tin sản phẩm thứ "+(i+1));
                            ds.get(i).Xuat();
                            System.out.println();
                        }
                    }   
                break;
                case 3:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        Collections.shuffle(ds);
                        for (int i = 0; i < ds.size(); i++) 
                        {
                            System.out.println("Thông tin sản phẩm thứ "+(i+1));
                            ds.get(i).Xuat();
                            System.out.println();
                        }
                    }   
                break;
                case 4:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        Collections.sort(ds,ss);
                        for (int i = 0; i < ds.size(); i++) 
                        {
                            System.out.println("Thông tin sản phẩm thứ "+(i+1));
                            ds.get(i).Xuat();
                            System.out.println();
                        }
                    } 
                break;
                case 5:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        int vitri=-1;
                        System.out.print("Nhập vào tên sản phẩm cần xoá: ");
                        String timten = nhap.next();
                        for (int i = 0; i < ds.size(); i++) 
                        {
                            if(ds.get(i).getTen().equalsIgnoreCase(timten))
                            {
                                vitri=i;
                            }
                        }
                        if(vitri!=-1)
                        {
                            System.out.println("Thông tin sản phẩm sẽ bị xoá: ");
                            ds.get(vitri).Xuat();
                            System.out.println("Bạn có chắc chắn muốn xoá: ");
                            System.out.println("1. Có.");
                            System.out.println("2. Không.");
                            int lcxoa = nhap.nextInt();
                            if(lcxoa==1)
                                ds.remove(vitri);
                        }  
                        else
                            System.out.println("Sản phẩm vừa tìm không có trong danh sách.");
                        System.out.println("");
                    } 
                break;
                case 6:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        double tong=0;
                        for (int i = 0; i < ds.size(); i++)
                            tong+=ds.get(i).getGia();
                        System.out.println("Giá trung bình các sản phẩm trong danh sách là: "+(tong/ds.size()));
                    } 
                break;
            }
        }while(chon!=7);
    }
    
}
