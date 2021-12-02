/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KetNoiCSDL;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nauq2
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        KetNoiCSDL a= new KetNoiCSDL();
        ResultSet rs=a.LayDL("khachhang");
        int i=1;
        while(rs.next())
        {
            System.out.println("Thông tin nhân viên thứ "+i);
            System.out.println("ID: "+rs.getString(1));
            //System.out.println("Tên: "+rs.getString(2));
            i++;
            System.out.println();
        }
    }
    
}
