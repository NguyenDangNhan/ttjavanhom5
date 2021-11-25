package ConnectSqlServer;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

    public static void main(String[] agrs) {
        SQLServerDataSource cn= new SQLServerDataSource();

        cn.setUser("sa");
        cn.setPassword("123");
        cn.setServerName("DESKTOP-OHK4JDG\\SQLEXPRESS");
        cn.setPortNumber(1433);
        cn.setDatabaseName("QLSV");
        try(Connection conn = cn.getConnection()) {
            System.out.println("Da ket noi thanh cong");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from SinhVien");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3)+"  " + rs.getString(4)+"  " + rs.getString(5));
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
