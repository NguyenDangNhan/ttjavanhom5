package ConnectMySql;

import java.sql.SQLException;

public class Display {
    public static void main(String[] args) throws SQLException {
        TestAccount user = new TestAccount();
        user.testLogin("taikhoan",181033);
    }
}
