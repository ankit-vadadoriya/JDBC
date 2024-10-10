import java.sql.*;

public class preparedStatement {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:8080/demo";
        String uname = "postgres";
        String pass = "2001";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Created");

        //using PreparedSatatement
//        int sid = 101;
//        String sName = "AAA";
//        int marks = 85;
//        String sql = "insert into student values (?, ?, ?)";
//        PreparedStatement st = con.prepareStatement(sql);
//        st.setInt(1, sid);
//        st.setString(2, sName);
//        st.setInt(3, marks);

        String sql = "delete from student where sid = 101";
        Statement st = con.createStatement();

        st.execute(sql);

        con.close();
        System.out.println("Connection Close");

    }
}
