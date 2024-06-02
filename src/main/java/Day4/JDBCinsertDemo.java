package Day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCinsertDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\Downloads\\hr.db";
        String query = "insert into departments values(?,?,?)";

        try (Connection conn = DriverManager.getConnection(url);) {
            PreparedStatement s1 = conn.prepareStatement(query);
            System.out.println("Enter department ID:");
            int deptID = sc.nextInt();
            s1.setInt(1, deptID);
            sc.nextLine();

            System.out.println("Enter department name");
            String deptName = sc.nextLine();
            s1.setString(2, deptName);


            System.out.println("Enter location ID:");
            int locID = sc.nextInt();
            s1.setInt(3, locID);

            int rows = s1.executeUpdate();
            System.out.println(rows + "insert");

        } catch (SQLException e){
            throw new RuntimeException(e);
        }


    }
}