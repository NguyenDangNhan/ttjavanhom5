/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author nauq2
 */
public class Student extends Person{
    private double mh1;
    private double mh2;

    public Student() {
    }

    public Student(double mh1, double mh2, String ht, String dc) {
        super(ht, dc);
        this.mh1 = mh1;
        this.mh2 = mh2;
    }

    public double getMh1() {
        return mh1;
    }

    public void setMh1(double mh1) {
        this.mh1 = mh1;
    }

    public double getMh2() {
        return mh2;
    }

    public void setMh2(double mh2) {
        this.mh2 = mh2;
    }
    
    public double Tinhtb()
    {
        return (mh1+mh2)/2;
    }
    public String Danhgia()
    {
        String dg;
        if(Tinhtb()<=10&&Tinhtb()>=9)
            dg = "Xuất sắc";
        else if(Tinhtb()<9&&Tinhtb()>=8)
            dg = "Giỏi";
        else if(Tinhtb()<8&&Tinhtb()>=6.5)
            dg = "Khá";
        else if(Tinhtb()<6.5&&Tinhtb()>=5)
            dg = "Trung bình";
        else if(Tinhtb()<5&&Tinhtb()>=4)
            dg = "Yếu";
        else if(Tinhtb()<4&&Tinhtb()>=0)
            dg = "Học lại";
        else
            dg = "Điểm nhập vào không đúng!";
        return dg;
    }
    @Override
    public String toString()
    {
        return "Họ tên: "+getHt()+", Địa Chỉ: "+getDc()+", Điểm môn học 1: "+mh1+", Điểm môn học 2: "+mh2+", Điểm trung bình: "+Tinhtb()+", Đánh giá: "+Danhgia();
    }
}
