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

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void Menu()
    {
        System.out.println("==========Menu==========");
        System.out.println("1. Thêm nhân viên vào danh sách.");
        System.out.println("2. Tìm kiếm nhân viên theo tên.");
        System.out.println("3. Xoá nhân viên ra khỏi danh sách.");
        System.out.println("4. Hiển thị tất cả danh sách sinh viên.");
        System.out.println("5. Thoát.");
        System.out.println("=========================");
        System.out.println("Nhập vào lựa chọn của bạn");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        EmployeeList ds = null;
        int chon;
        do
        {
            Menu();
            chon = nhap.nextInt();
            nhap.nextLine();
            switch(chon)
            {
                case 1: 
                    ds = new EmployeeList();
                    ds.Add();
                break;
                case 2:
                    if(ds==null)
                    {
                        System.out.println("Danh sách đang trống. Vui lòng nhập danh sách trước");
                        System.out.println();
                    }
                    else
                    {
                        ds.Search();
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
                        System.out.println("Nhập vào mã của nhân viên muốn xoá");
                        String manv = nhap.nextLine();
                        ds.Remove(manv);
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
                        ds.Display();
                    }
                break;
                default:
                    System.out.println("Lựa chọn bạn vừa nhập không có trong danh sách.");
                break;
            }
        }while(chon!=5);
    }
    
}
