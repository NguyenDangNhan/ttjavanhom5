/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author nauq2
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> ds = new ArrayList<>();
    public boolean KTMaSV(String masv)
    {
        boolean kt=false;
        for(SinhVien sv:ds)
        {
            if(sv.getMasv().equalsIgnoreCase(masv))
                kt=true;
        }
        return kt;
    }
    public boolean ThemSV(SinhVien sv)
    {
        if(KTMaSV(sv.getMasv()))
            return true;
        else
            return ds.add(sv);
    }
    public SinhVien TimKiemSV(String masv)
    {
        SinhVien s = null;
        for(SinhVien sv:ds)
        {
            if(sv.getMasv().equalsIgnoreCase(masv))
                s = sv;
        }
        return s;
    }
    public int TimViTri(String masv)
    {
        int t=-1;
        for(int i=0;i<ds.size();i++)
        {
            if(ds.get(i).getMasv().equalsIgnoreCase(masv))
                t = i;
        }
        return t;
    }
    public SinhVien SuaSV(int index,SinhVien sv)
    {
        return ds.set(index, sv);
    }
    public void XoaSV(String masv)
    {
        SinhVien sv = TimKiemSV(masv);
        ds.remove(sv);
    }
    @Override
    public String toString()
    {
        return ds.toString();
    }
    public void SapXep()
    {
        Collections.sort(ds);
    }
}
