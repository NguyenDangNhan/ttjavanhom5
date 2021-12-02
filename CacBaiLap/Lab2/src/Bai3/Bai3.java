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
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int chon;
        UnetiBook book = new UnetiBook();
        UnetiBook[] b=null;
        Scanner nhap = new Scanner(System.in);
        do
        {
            book.Menu();
            System.out.println("Nhập vào lựa chọn của bạn");
            chon = nhap.nextInt();
            switch(chon)
            {
                case 1: 
                    int n;
                    System.out.println("Nhập vào số sách có trong danh sách: ");
                    n = nhap.nextInt();
                    b = new UnetiBook[n];
                    for(int i=0;i<n;i++)
                    {
                        b[i] = new UnetiBook();
                        b[i].input();
                    }
                break;
                case 2:
                    if(b==null)
                        System.out.println("Bạn chưa nhập dữ liệu.");
                    else
                    {
                        System.out.println("Danh sách các loại sách: ");
                        for(int i=0;i<b.length;i++)
                        {
                            b[i].display();
                            System.out.println();
                        }
                    }
                break;
                case 3:
                    if(b==null)
                        System.out.println("Bạn chưa nhập dữ liệu");
                    else
                    {
                        System.out.println("Danh sách các cuốn sách sau khi sắp xếp:");
                        book.SapXep(b);
                        for(int i=0;i<b.length;i++)
                        {
                            b[i].display();
                            System.out.println();
                        }
                    }
                break;
                case 4:
                    if(b==null)
                        System.out.println("Danh sách đang trống. Không thể tìm sách.");
                    else
                    {
                        book.TimKiemSach(b);
                        System.out.println();
                    }
                break;
                case 5:
                    if(b==null)
                        System.out.println("Danh sách đang trống. Không thể tìm sách.");
                    else
                    {
                        book.TimKiemTacGia(b);
                        System.out.println();
                    }
                break;
                case 6:
                break;
                default:
                    System.out.println("Lựa chọn vừa rồi không có trong Menu");
                break;
            }
        }while(chon!=6);
    }
    
}
