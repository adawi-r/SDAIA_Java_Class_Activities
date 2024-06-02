package Day4.Day_04_Activities;

//import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class DepartmentDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\Desktop\\sdaia_java_projects\\project-01\\hr.db";
    private static final String SELECT_ALL_DEPTS = "select * from jobs";
    private static final String SELECT_ONE_DEPT = "select * from jobs where job_id = ?";
    private static final String INSERT_DEPT = "insert into jobs values (?, ?, ?)";
    private static final String UPDATE_DEPT = "update jobs set job_id = ?, job_title = ? where max_salary = ?";
    private static final String DELETE_DEPT = "delete from jobs where job_id = ?";

    public void insertJob(Job j) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_DEPT);
        st.setInt(1, j.getJob_id());
        st.setString(2, j.getJob_title());
        st.setDouble(3, j.getMax_salary());
        st.executeUpdate();
    }

    public void updateDept(Job j) throws SQLException {

        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_DEPT);
        st.setInt(1, j.getJob_id());
        st.setString(2, j.getJob_title());
        st.setDouble(3, j.getMax_salary());
        st.executeUpdate();
    }

    public void deleteDept(int job_id) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_DEPT);
        st.setInt(1, job_id);
        st.executeUpdate();
    }

    public Job selectDept(int Job_id) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_DEPT);
        st.setInt(1, Job_id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Job(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<Job> selectAllDepts() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_DEPTS);
        ResultSet rs = st.executeQuery();
        ArrayList<Job> depts = new ArrayList<>();
        while (rs.next()) {
            depts.add(new Job(rs));
        }

        return depts;
    }
}
