/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Manager {

    /**
     */
    public static void Menu()
    {
        System.out.println("==========Menu==========");
        System.out.println("1. Nhập vào thông tin cho n điện thoại: ");
        System.out.println("2. Nhập vào thông tin cho n ô tô: ");
        System.out.println("3. Hiển thị thông tin cả điện thoại và ô tô: ");
        System.out.println("4. Tìm kiếm thông tin theo tên nhà sản xuất: ");
        System.out.println("5. Thoát.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int chon;
        Mobile[] m = null;
        Car[] c = null;
        do
        {
            Menu();
            System.out.println("Nhập vào lựa chọn của bạn: ");
            chon=nhap.nextInt();
            switch(chon)
            {
                case 1:
                    System.out.print("Nhập vào số điện thoại có trong danh sách: ");
                    int n1 = nhap.nextInt();
                    m = new Mobile[n1];
                    System.out.println("Nhập vào thông tin từng điện thoại: ");
                    for(int i=0;i<n1;i++)
                    {
                        System.out.println("Nhập vào thông tin điện thoại thứ "+(i+1));
                        m[i] = new Mobile();
                        m[i].input();
                    }
                    System.out.println();
                break;
                case 2:
                    System.out.print("Nhập vào số ô tô có trong danh sách: ");
                    int n2 = nhap.nextInt();
                    c = new Car[n2];
                    System.out.println("Nhập vào thông tin từng ô tô: ");
                    for(int i=0;i<n2;i++)
                    {
                        System.out.println("Nhập vào thông tin ô tô thứ "+(i+1));
                        c[i] = new Car();
                        c[i].input();
                    }
                    System.out.println();
                break;
                case 3:
                    if(m==null)
                        System.out.println("Bạn chưa nhập dữ liệu vào danh sách điện thoại");
                    else
                    {
                        System.out.println("Danh sách điện thoại: ");
                        for(int i=0;i<m.length;i++)
                        {
                            System.out.println("Thông tin điện thoại thứ "+(i+1));
                            m[i].display();
                            System.out.println();
                        }
                        System.out.println();
                    }
                    if(c==null)
                        System.out.println("Bạn chưa nhập dữ liệu vào danh sách ô tô: ");
                    else
                    {
                        System.out.println("Danh sách ô tô: ");
                        for(int i=0;i<c.length;i++)
                        {
                            System.out.println("Thông tin ô tô thứ "+(i+1));
                            c[i].display();
                            System.out.println();
                        }
                        System.out.println();
                    }
                break;
                case 4:
                    System.out.print("Nhập vào tên nhà sản xuất để tìm mặt hàng: ");
                    String nsx= nhap.next();
                    if(m==null)
                        System.out.println("Bạn chưa nhập vào danh sách điện thoại.");
                    else
                    {
                        System.out.println("Danh sách các điện thoại có nhà sản xuất là "+nsx);
                        for(int i=0;i<m.length;i++)
                        {
                            if(m[i].getTennhasx().equals(nsx))
                            {
                                m[i].display();
                                System.out.println();
                            }
                        }
                        System.out.println();
                    }
                    if(c==null)
                        System.out.println("Bạn chưa nhập vào danh sách oto.");
                    else
                    {
                        System.out.println("Danh sách các ô tô có nhà sản xuất là "+nsx);
                        for(int i=0;i<c.length;i++)
                        {
                            if(c[i].getTennhasx().equals(nsx))
                            {
                                c[i].display();
                                System.out.println();
                            }
                        }
                    }
                break;
            }
        }while(chon!=5);
    } 
}
