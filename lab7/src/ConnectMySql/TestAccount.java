package ConnectMySql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.Integer.parseInt;

public class TestAccount extends testconnection {

    public TestAccount() throws SQLException {
        this.cn= DriverManager.getConnection(getUrl(),"root","");
    }
    public void testLogin(String tableName, int id) throws SQLException {
        TestAccount a= new TestAccount();
        a.setTableName(tableName);
        ResultSet rs=a.LayDL();
        int test=0;
        while(rs.next())
        {   if(id==parseInt(rs.getString(1))) {
            System.out.println("ID :" + rs.getString(1));
            System.out.println("UserName :" + rs.getString(2));
            System.out.println("--------------------------------------");
            test++;
            break;
           }
        }
        if(test==0)
        {
            System.out.println("Tai khoan khong ton tai");
        }
    }
}