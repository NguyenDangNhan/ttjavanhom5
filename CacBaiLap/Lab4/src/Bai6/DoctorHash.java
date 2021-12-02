/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class DoctorHash {
    
    Scanner nhap = new Scanner(System.in);
    static HashMap<String, DoctorDetails> elements;

    public DoctorHash() {
        elements = new HashMap<>();
    }
    
    public void Add()
    {
        String ma,ten,khoa;
        int thoigian;
        System.out.print("Nhập mã: ");
        ma = nhap.nextLine();
        System.out.print("Nhập tên: ");
        ten = nhap.nextLine();
        System.out.print("Nhập khoa: ");
        khoa = nhap.nextLine();
        System.out.print("Nhập thời gian làm việc: ");
        thoigian = nhap.nextInt();
        nhap.nextLine();
        DoctorDetails d = new DoctorDetails(ma, ten,khoa , thoigian);
        elements.put(d.getMa(), d);
    }
    
    public void Search()
    {
        System.out.print("Nhập mã của bác sĩ cần tìm: ");
        String code = nhap.nextLine();
        if(elements.containsKey(code)==false)
        {
            System.out.println("Không tìm thấy dữ liệu!");
        }else{
            System.out.println("Thông tin bác sỹ cần tìm:");
            System.out.println(elements.get(code).toString());
        }
    }
    public void ShowAll()
    {
        System.out.println("==========Thông tin tất cả các bác sĩ==========");
        Iterator ds = elements.entrySet().iterator();
        int vitri = 1;
        while(ds.hasNext())
        {
            System.out.println("Thông tin bác sĩ thứ "+vitri);
            HashMap.Entry entry = (HashMap.Entry)ds.next();
            System.out.println(entry.getValue().toString() + "\n");
            vitri++;
        }
    }
}
