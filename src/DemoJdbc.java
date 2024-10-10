import java.sql.*;   //import package

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            process and result
            close
         */
        String url = "jdbc:postgresql://localhost:8080/demo";    //demo is a database name which we created in Postgres
        String uname = "postgres";
        String pass = "2001";

//        Class.forName("org.postgresql.Driver");           //optional
        Connection con = DriverManager.getConnection(url,uname,pass);     //create connection
        System.out.println("Connection Established");
        Statement st = con.createStatement();    //create statement

        //------------------READ DATA-------------------------
//        String sql = "select * from student";
//        ResultSet rs =  st.executeQuery(sql);    // execute statement
////        rs.next();  //return only true and false
////        String name = rs.getString("sName");
////        System.out.println(name);
//        //--------OR--------
//        while (rs.next()){
//            System.out.print(rs.getInt(1) + " ");
//            System.out.print(rs.getString(2) + " ");
//            System.out.println(rs.getInt(3));
//        }

        //---------------INSERT DATA-------------------
//        int sid = 100;
//        String sName = "Max";
//        int marks = 75;
//        String sql = "insert into student values(" +sid +", '" + sName + "', " + marks + ")";
//        -----OR-----
//        String sql = "insert into student values(7, 'Aniket', 70)";
//        boolean status = st.execute(sql);
//        System.out.println(status);    //result false data insert in database

        //---------------UPDATE DATA-------------------
//        String sql = "update student set marks = 94 where \"sName\" = 'Ankit'";
//        st.execute(sql);

        //---------------DELETE DATA-------------------
//        String sql = "delete from student where sid = 7";
//        st.execute(sql);

        con.close();      //close connection
        System.out.println("Connection Closed");
    }
}
