/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số sản phẩm có trong danh sách:");
        int n = nhap.nextInt();
        //Câu 1: Khai báo mảng 
        Product[] p = new Product[n];
        //Câu 2: Nhập thông tin
        System.out.println("Nhập thông tin vào từng sản phẩm: ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào thông tin sản phẩm thứ "+(i+1));
            p[i] = new Product();
            p[i].input();
            System.out.println();
        }
        //Câu 3: Tìm ra sản phẩm giá bán cao nhất
        float max=p[0].getGia1SP();
        int vt=0;
        for(int i=1;i<n;i++)
        {
            if(max<p[i].getGia1SP())
            {
                max=p[i].getGia1SP();
                vt=i;
            }
        }
        System.out.println("Thông tin sản phẩm có giá lớn nhất là: ");
        System.out.println("Sản phẩm thứ "+(vt+1));
        p[vt].display();
        //Câu 4: Sắp xếp theo thứ tự giảm dần
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(p[i].getGia1SP()<p[j].getGia1SP())
                {
                    Product temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sau khi sắp xếp: ");
        for(int i=0;i<n;i++)
        {
            p[i].display();
            System.out.println();
        }
        //câu 5: Tìm mặt hàng Sữa
        System.out.println("Danh sách các mặt hàng Sữa có trong danh sách: ");
        for(int i=0;i<n;i++)
        {
            if(p[i].getTenHH().contains("sua"))
            {
                p[i].display();
                System.out.println();
            }
        }
    }
    
}
