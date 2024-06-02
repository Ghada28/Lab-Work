package Day4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {
    private int DepartmentId;
    private String DepartmentName;
    private int locationID;

    public Department(){

    }
    public Department(int DepartmentId, String DepartmentName, int locationID ){

        this.DepartmentId=DepartmentId;
        this.DepartmentName=DepartmentName;
        this.locationID=locationID;

    }

    public Department(ResultSet rs) throws SQLException{
        DepartmentId=rs.getInt("department_id") ;
        DepartmentName= rs.getString("department_name");
        locationID=rs.getInt("location_id");
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", locationID=" + locationID +
                '}';
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public int getLocationID() {
        return locationID;
    }
}
