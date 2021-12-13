import java.sql.*;

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from college");
        while(rs.next())
        {
            System.out.println(rs.getString(1)+rs.getString(2)+rs.getInt(3));
        }
    }
}
