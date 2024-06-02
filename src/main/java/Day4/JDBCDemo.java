package Day4;

import java.sql.*;

public class JDBCDemo {
    public static void main(String []args){
        String url = "jdbc:sqlite:C:\\Users\\dev\\Downloads\\hr.db";
        String query = "select*from departments where location_id=?";


        try (Connection conn = DriverManager.getConnection(url);){
            PreparedStatement s1 = conn.prepareStatement(query);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                Department d = new Department(rs);
                System.out.println(d);


            }




        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }




    }
}
