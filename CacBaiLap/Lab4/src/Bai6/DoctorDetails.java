/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author nauq2
 */
public class DoctorDetails {
    private String ma;
    private String ten;
    private String khoa;
    private int thoigian;

    public DoctorDetails() {
    }

    public DoctorDetails(String ma, String ten, String khoa, int thoigian) {
        this.ma = ma;
        this.ten = ten;
        this.khoa = khoa;
        this.thoigian = thoigian;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getThoigian() {
        return thoigian;
    }

    public void setThoigian(int thoigian) {
        this.thoigian = thoigian;
    }
    
    @Override
    public String toString()
    {
        return "Mã bác sĩ:" +ma+"\n"+"Tên bác sĩ:"+ten+"\n"+"Khoa làm việc: " + khoa + "\n" +"Thời gian làm việc: " + thoigian;
    }
}
