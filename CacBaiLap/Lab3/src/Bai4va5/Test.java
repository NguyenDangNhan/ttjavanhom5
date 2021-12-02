/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4va5;

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
        System.out.println("==========Menu Chương Trình==========");
        System.out.println("1. Nhập thông tin danh sách sinh viên. ");
        System.out.println("2. Xuất thông tin danh sách sinh viên. ");
        System.out.println("3. Xuất danh sách sinh viên có học lực Giỏi. ");
        System.out.println("4. Sắp xếp danh sách sinh viên tăng dần theo điểm. ");
        System.out.println("5. Kết thúc.");
        System.out.println("Nhập vào lựa chọn của bạn: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ChuongTrinh ct = null;
        Scanner nhap = new Scanner(System.in);
        int n;
        do{
            Menu();
            n = nhap.nextInt();
            switch(n)
            {
                case 1: 
                    ct = new ChuongTrinh();
                    ct.NhapDS();
                break;
                case 2:
                    if(ct==null)
                        System.out.println("Chưa nhập danh sách.");
                    else
                        ct.Xuat();
                break;
                case 3:
                    if(ct==null)
                        System.out.println("Chưa nhập danh sách.");
                    else
                        ct.Loc();
                break;
                case 4: 
                    if(ct==null)
                        System.out.println("Chưa nhập danh sách.");
                    else
                        ct.SapXep();
                break;
                case 5:
                    
                break;
                default:
                    System.out.println("Lựa chọn bạn vừa nhập không có trong chương trình");
                break;
            }
        }while(n!=5);
    }
    
}
