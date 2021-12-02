/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KetNoiCSDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nauq2
 */
public class KetNoiCSDL {
        Connection cn= null;
        public KetNoiCSDL() throws SQLException {
        String url="jdbc:mysql://localhost:3306/QLHD";
        this.cn=DriverManager.getConnection(url,"root","");
    }
        public ResultSet LayDL (String tenbang) throws SQLException {
        ResultSet kq=null;
        Statement st=this.cn.createStatement();
        String sql= "select makh from "+tenbang;
        kq=st.executeQuery(sql);
        return kq;
    }
}
