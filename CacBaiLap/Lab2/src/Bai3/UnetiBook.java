/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class UnetiBook extends Book{
    private String ngonngu;
    private int hocky;

    public UnetiBook() {
    }

    public UnetiBook(String ngonngu, int hocky, String tensach, String tacgia, String nhaxuatban, int namxuatban, float gia) {
        super(tensach, tacgia, nhaxuatban, namxuatban, gia);
        this.ngonngu = ngonngu;
        this.hocky = hocky;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public int getHocky() {
        return hocky;
    }

    public void setHocky(int hocky) {
        this.hocky = hocky;
    }
    
    @Override
    public void input()
    {
        super.input();
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap ngôn ngữ :");
        ngonngu=nhap.nextLine();
        System.out.println("Nhập học kỳ :");
        hocky =nhap.nextInt();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Ngôn ngữ :"+ngonngu);
        System.out.println("Học kỳ :"+hocky);
    }
    public void SapXep(UnetiBook[] b)
    {
        for (int i = 0; i < b.length - 1; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i].getNamxuatban() < b[j].getNamxuatban())
                {
                    UnetiBook tem = b[i];
                    b[i] = b[j];
                    b[j] = tem;
                }
            }
        }
    }
    public void TimKiemSach(UnetiBook[] b)
    {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập tên sách cần tìm:");
        String nameBook=nhap.nextLine();
        int dem=0;
        System.out.println("Thông tin sách bạn muốn tìm là: ");
        for (int i = 0; i < b.length; i++) 
        {
            if(b[i].getTensach().equals(nameBook))
            {
                b[i].display();
                dem++;
            }
        }
        if(dem==0)
        {
            System.out.println("Không có sách bạn muốn tìm");
        }
    }
    public void TimKiemTacGia(UnetiBook[] b)
    {
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhập tên tác giả của sách cần tìm:");
        String Tentacgia=nhap.nextLine();
        int dem=0;
        System.out.println("Thông tin sách của tác giả bạn muốn tìm là: ");
        for(int i = 0; i < b.length; i++) 
        {
            if(b[i].getTacgia().equals(Tentacgia))
            {
                b[i].display();
                dem++;
            }
        }
        if(dem==0)
        {
            System.out.println("Không có sách nào của tác giả bạn muốn tìm");
        }
    }
    public void Menu()
    {
        System.out.println("1. Nhập thông tin n cuốn sách ");
        System.out.println("2. Hiển thị thông tin vừa nhập");
        System.out.println("3. Sắp xếp giảm dần theo năm xuất bản");
        System.out.println("4. Tìm kiếm theo tên sách");
        System.out.println("5. Tìm kiếm theo tên tác giả ");
        System.out.println("6. Thoát");
    }
}
