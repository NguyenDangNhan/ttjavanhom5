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
public class Manager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap=new Scanner(System.in);
        int lc;
        StudentUneti[] stu=null;
        StudentMark[] std = null;
        do {       
            System.out.println("1 Nhập n thông tin sinh viên uneti");
            System.out.println("2 Nhập m điểm cho các sinh viên này");
            System.out.println("3 Sắp xếp sinh viên theo tên và hiển thị ");
            System.out.println("4 Tìm thông tin điểm của sinh viên theo id");
            System.out.println("5 Thoát");
            System.out.println("Nhập vào lựa chọn của bạn");
            lc=nhap.nextInt();
            switch(lc) {
                case 1:
                    int n;
                    System.out.println("Nhập vào số sinh viên :");
                    n=nhap.nextInt();
                    stu=new StudentUneti[n];
                    for (int i = 0; i < n; i++) {
                        stu[i]=new StudentUneti();
                        int dem=0;
                        do {
                            System.out.println("Nhập vào thông tin sinh viên thứ "+(i+1));
                            stu[i].input();
                            dem=0;
                            for(int j = 0; j < i; j++) {
                                if(stu[i].getId().equals(stu[j].getId())&&stu!=null) {
                                    System.out.println("Mã ID trùng vui lòng nhập lại!");
                                    dem++;
                                }
                            }
                        }while(dem!=0);
                    }
                break;
                case 2:
                    if(stu!=null) {
                        int m;
                        System.out.println("Nhập vào số môn học:");
                        m=nhap.nextInt();
                        std=new StudentMark[m];
                        for (int i = 0; i < std.length; i++) {
                            std[i]=new StudentMark();
                            int dem=0;
                            do {
                                System.out.println("Nhập vào thông tin môn học thứ "+(i+1));
                                std[i].input();
                                dem=0;
                                for(int j = 0; j < stu.length; j++) {
                                    if(std[i].getId().equals(stu[j].getId())==true)
                                    {
                                        dem++;
                                    }   
                                }
                                if(dem==0)
                                    System.out.println("Mã ID sinh viên chưa có. Vui lòng nhập lại.");
                            }while(dem==0);
                        }
                    }
                    else {
                        System.out.println("Cần nhập thông tin cho sinh viên trước");
                    }
                break;
                case 3:
                    if(stu==null) {
                        System.out.println("Bạn chưa nhập dữ liệu ");
                    }
                    else {
                        for (int i = 0; i < stu.length- 1; i++) {
                            for (int j = i + 1; j <stu.length; j++) {
                               if(stu[i].getTen().compareTo(stu[i].getTen())>0){
                                    StudentUneti temp=stu[i];
                                    stu[i]= stu[j];
                                    stu[j]=temp;
                                }
                            }
                        }
                        for (int i = 0; i < stu.length; i++) {
                            System.out.println("Thông tin sinh viên thứ "+(i+1));
                            stu[i].display();
                        }
                    }
                break;
                case 4:
                    if(stu==null||std==null) {
                        System.out.println("Bạn chưa nhập dữ liệu ");
                    }
                    else {
                        String id;
                        nhap.nextLine();
                        System.out.println("Nhập vào id bạn muốn tìm:");
                        id= nhap.nextLine();
                        System.out.println("Thông tin sinh viên: ");
                        for (int i = 0; i < stu.length; i++) {
                            if(id.equals(stu[i].getId())){
                                stu[i].display();
                            }
                        }
                        System.out.println("Với các điểm:");
                        for (int i = 0; i < std.length; i++) {
                            if(id.equals(std[i].getId())){
                                std[i].display();
                            }
                        }
                    }
                    break;
                    case 5:
                    break;
                    default:
                        System.out.println("Không có lựa chọn của bạ.n");
                    break;
            }
            
        }while(lc!=5);
    } 
}
