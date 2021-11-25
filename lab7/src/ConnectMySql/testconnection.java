package ConnectMySql;

import java.sql.*;

public class testconnection
{   private String url = "jdbc:mysql://localhost:3306/user";
    private String tableName;
    Connection cn= null;



    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public testconnection() throws SQLException {
        this.cn= DriverManager.getConnection(this.url,"root","");
    }

    public ResultSet LayDL() throws SQLException {
        ResultSet kq=null;
        Statement st=this.cn.createStatement();
        String sql= "select * from "+this.tableName;
        kq=st.executeQuery(sql);
        return kq;
    }


//        public static void main(String[] args) throws SQLException
//   {
//       ConnectMySql.testconnection a= new ConnectMySql.testconnection();
//       ResultSet rs=a.LayDL();
//       while(rs.next())
//       {
//        System.out.println("Account :" +rs.getString(1));
//        System.out.println("UserName :" +rs.getString(2));
//        System.out.println("--------------------------------------");
//
//       }
//}
}
