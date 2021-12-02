/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void SapXep(Product[] p)
    {
        for(int i=0;i<p.length-1;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                if(p[i].giaban>p[j].giaban)
                {
                    Product temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }
    public static void Menu()
    {
        System.out.println("==========Menu Chương Trình==========");
        System.out.println("1.Nhập thông tin cho n sản phẩm.");
        System.out.println("2.Hiển thị thông tin sản phẩm.");
        System.out.println("3.Hiển thị thông tin tăng dần theo giá sản phẩm.");
        System.out.println("4.Thoát");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int chon,n;
        Menu();
        System.out.println("Nhập vào lựa chọn của bạn");
        chon=nhap.nextInt();
        while(chon!=1&&chon!=4)
        {
            Menu();
            System.out.println("Chưa nhập thông tin nên không thể thực hiện thao tác.");
            System.out.println("Vui lòng chọn lại.");
            chon=nhap.nextInt();
        }
        if(chon!=4)
        {
            System.out.print("Nhập số sản phẩm có trong danh sách: ");
            n = nhap.nextInt();
            Product[] p = new Product[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Nhập vào thông tin sản phẩm thứ "+(i+1));
                p[i] = new Product();
                p[i].Nhap();
                System.out.println();
            }
            Menu();
            chon=nhap.nextInt();
            while(chon!=4)
            {
                switch(chon)
                {
                    case 1: 
                        System.out.print("Nhập số sản phẩm có trong danh sách: ");
                        n = nhap.nextInt();
                        for(int i=0;i<n;i++)
                        {
                            System.out.println("Nhập vào thông tin sản phẩm thứ "+(i+1));
                            p[i] = new Product();
                            p[i].Nhap();
                            System.out.println();
                        }
                    break;
                    case 2:
                        System.out.println("Danh sách thông tin sản phẩm");
                        for(int i=0;i<n;i++)
                        {
                            p[i].Xuat();
                            System.out.println();
                        }
                        System.out.println();
                    break;
                    case 3:
                        System.out.println("Danh sách sau khi sắp xếp:");
                        SapXep(p);
                        for(int i=0;i<n;i++)
                        {
                            p[i].Xuat();
                            System.out.println();
                        }
                    break;
                    default: 
                        System.out.println("Lựa chọn vừa rồi không có trong Menu");
                    break;
                }
                Menu();
                chon=nhap.nextInt();
            }
        }  
    }
    
}
