/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author nauq2
 */
public class DSPerson {
    Scanner nhap = new Scanner(System.in);
    ArrayList<Person> ds = new ArrayList<>();
    public DSPerson() {
    }
    public Student NhapStudent()
    {
        Student s = new Student();
        System.out.println("Nhập vào họ tên học sinh: ");
        s.setHt(nhap.nextLine());
        System.out.println("Nhập vào điểm môn học 1 của học sinh: ");
        s.setMh1(nhap.nextDouble());
        System.out.println("Nhập vào điểm môn học 2 của học sinh: ");
        s.setMh2(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nhập vào địa chỉ học sinh: ");
        s.setDc(nhap.nextLine());
        return s;
    }
    public Employee NhapEmployee()
    {
        Employee e = new Employee();
        System.out.println("Nhập vào họ tên nhân viên: ");
        e.setHt(nhap.nextLine());
        System.out.println("Nhập vào hệ số lương của nhân viên: ");
        e.setHesoLuong(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nhập vào địa chỉ nhân viên: ");
        e.setDc(nhap.nextLine());
        return e;
    }
    public Customer NhapCustomer()
    {
        Customer c = new Customer();
        System.out.println("Nhập vào họ tên khách hàng: ");
        c.setHt(nhap.nextLine());
        System.out.println("Nhập vào tên công ty của khách hàng: ");
        c.setTencty(nhap.nextLine());
        System.out.println("Nhập vào giá trị hoá đơn của khách hàng: ");
        c.setGthd(nhap.nextDouble());
        nhap.nextLine();
        System.out.println("Nhập vào địa chỉ khách hàng: ");
        c.setDc(nhap.nextLine());
        return c;
    }
    private void Menu()
    {
        System.out.println("Phím 1: Nhập mới một học sinh.");
        System.out.println("Phím 2: Nhập mới một nhân viên.");
        System.out.println("Phím 3: Nhập mới một khách hàng.");
        System.out.println("Phím bất kỳ còn lại: Kết thúc nhập.");
        System.out.println("Nhập vào lựa chọn của bạn: ");
    }
    public void AddPerson()
    {
        int lc;
        do{
            Menu();
            lc = nhap.nextInt();
            nhap.nextLine();
            switch(lc)
            {
                case 1:
                    ds.add(NhapStudent());
                break;
                case 2: 
                    ds.add(NhapEmployee());
                break;
                case 3: 
                    ds.add(NhapCustomer());
                break;
            }
        }while(lc==1||lc==2||lc==3);
    }
    public void XuatDS()
    {
        for(Person p:ds)
        {
            System.out.println(p.toString());
        }
    }
    private void RemovePerson(String name)
    {
        for(Person p:ds)
        {
            if(p.getHt().equalsIgnoreCase(name)==true)
                ds.remove(p);
        }
    }
    public void XoaTheoTen()
    {
        System.out.println("Nhập vào tên người cần xoá: ");
        String name = nhap.nextLine();
        RemovePerson(name);
    }
    Comparator<Person> ss = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getHt().compareTo(o2.getHt());
        }
    };
    public void SapXep()
    {
        Collections.sort(ds,ss);
    }
}
