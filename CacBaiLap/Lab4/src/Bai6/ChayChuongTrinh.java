/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class ChayChuongTrinh {

    /**
     * @param args the command line arguments
     */
    public static void Menu()
    {
        System.out.println("==========Menu Chương Trình==========");
        System.out.println("1. Thêm thông tin bác sĩ vào danh sách.");
        System.out.println("2. Tìm kiếm thông tin bác sĩ trong danh sách.");
        System.out.println("3. Hiển thị thông tin danh sách bác sĩ.");
        System.out.println("4. Thoát");
    }
    
    public static void MenuNhap()
    {
        System.out.println("Bạn có muốn nhập thêm?");
        System.out.println("Phím 1: Có");
        System.out.println("Phím bất kỳ: Kết thúc");
        System.out.print("Nhập vào lựa chọn của bạn: ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        DoctorHash dt = new DoctorHash();
        int lc,dem=0;
        do{
            Menu();
            lc = nhap.nextInt();
            nhap.nextLine();
            switch(lc)
            {
                case 1: 
                    dem++;
                    int lcn;
                    do{
                        dt.Add();
                        MenuNhap();
                        lcn = nhap.nextInt();
                    }while(lcn==1);
                break;
                case 2:
                    if(dem==0)
                        System.out.println("Chưa nhập danh sách.");
                    else
                        dt.Search();
                break;
                case 3:
                    if(dem==0)
                        System.out.println("Chưa nhập danh sách.");
                    else
                        dt.ShowAll();
                break;
                case 4:
                    
                break;
                default:
                    System.out.println("Lựa chọn vừa nhập không có trong danh sách. ");
                break;
            }
        }while(lc!=4);
    }
    
}
