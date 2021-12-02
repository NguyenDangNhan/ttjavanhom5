/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class EmployeeList {
    ArrayList<Employee> emp = new ArrayList<>();
    Scanner nhap = new Scanner(System.in);
    public EmployeeList() {
    }
    
    public void Add()
    {
        int lc;
        do
        {
            Employee e = new Employee();
            e.nhap();
            emp.add(e);
            System.out.println("Bạn có muốn nhập thêm nhân viên: ");
            System.out.println("Phím 1: Có");
            System.out.println("Phím bất kỳ: Không");
            lc = nhap.nextInt();
            nhap.nextLine();
        }while(lc==1);
    }
    public void Display()
    {
        for(int i=0;i<emp.size();i++)
            emp.get(i).xuat();
    }
    public void Search()
    {
        System.out.println("Nhập vào mã của nhân viên cần tìm: ");
        String manv = nhap.nextLine();
        int vitri=-1;
        for(int i=0;i<emp.size();i++)
        {
            if(emp.get(i).getManv().equalsIgnoreCase(manv))
                vitri=i;
        }
        if(vitri==-1)
            System.out.println("Mã nhân viên vừa nhập không có trong danh sách.");
        else
        {
            System.out.println("Thông tin nhân viên tìm kiếm: ");
            emp.get(vitri).xuat();
        }
    }
    public void Remove(String manv)
    {
        int vitri=-1;
        for(int i=0;i<emp.size();i++)
        {
            if(emp.get(i).getManv().equalsIgnoreCase(manv))
                vitri=i;
        }
        if(vitri==-1)
            System.out.println("Mã nhân viên vừa nhập không có trong danh sách.");
        else
        {
            int lc;
            System.out.println("Thông tin nhân viên cần xoá: ");
            emp.get(vitri).xuat();
            System.out.println("Bạn có chắc chắn muốn xoá nhân viên này khỏi danh sách?");
            System.out.println("Phím 1: Có");
            System.out.println("Phím bất kỳ: Không");
            lc=nhap.nextInt();
            if(lc==1)
            {
                emp.remove(vitri);
                System.out.println("Sản phẩm đã bị xoá.");
            }
            else
                System.out.println("Huỷ xoá sản phẩm thành công.");
        }
    }
}
