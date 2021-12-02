/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class ViduHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sản phẩm: ");
        int n = nhap.nextInt();
        nhap.nextLine();
        HashMap<String, String> dssp = new HashMap<>();
        String masp,tensp;
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhập vào thông tin sản phẩm thứ "+(i+1));
            System.out.print("Nhập mã sản phẩm: ");
            masp = nhap.nextLine();
            System.out.print("Nhập tên sản phẩm: ");
            tensp = nhap.nextLine();
            dssp.put(masp, tensp);
        }
        System.out.println("Danh sách các sản phẩm vừa nhập: ");
        System.out.println("Mã sản phẩm\tTên sản phẩm");
        Iterator<Map.Entry<String, String>> iterator = dssp.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
        System.out.println("Nhập mã sản phẩm cần thêm: ");
        String maspm = nhap.nextLine();
        if (dssp.containsKey(maspm)) {
            System.out.println("Mã sản phẩm = " + maspm + " đã tồn tại!");
        } else {
            System.out.println("Nhập tên sản phẩm cần thêm: ");
            String tenspm = nhap.nextLine();
            dssp.put(maspm, tenspm);
            n++;
            System.out.println("Danh sách các sản phẩm sau khi thêm: ");
            System.out.println("Số sản phẩm = " + n);
            System.out.println("Mã sản phẩm\tTên sản phẩm");
            iterator = dssp.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                System.out.println(entry.getKey() + "\t\t" + entry.getValue());
            }
        }
    }
}
