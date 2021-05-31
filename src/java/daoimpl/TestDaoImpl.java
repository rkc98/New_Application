package daoimpl;

import dao.TestDao;
import dto.Tests;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDaoImpl implements TestDao{

    Connection conn;
    List<Tests> ut;
    Tests t;
    
    
    
    public TestDaoImpl() {
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:D:\\h2\\mydb", "sa","root");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Error while connecting : "+ e.getMessage());
        }
    }

    
    @Override
    public List<Tests> getAllTest() {
        ut= new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from NEWS");
            while (rs.next()) {                
                t = new Tests();
                t.setId(rs.getInt(1));
                t.setName(rs.getString(2));
                t.setPrice(rs.getInt(3));
                ut.add(t);
            }
        } catch (Exception e) {
            System.out.println("Error while fetching all News : "+e.getMessage());
        }
        
        
        return ut;
    }

    @Override
    public Tests getTestByID(int id) {
       t = new Tests();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from NEWS  where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                t.setId(rs.getInt(1));
                t.setName(rs.getString(2));
                t.setPrice(rs.getInt(3));
            }
        } catch (Exception e) {
            System.out.println("Error while loading test : "+e.getMessage());
        }
  
        return t;
    }

    @Override
    public boolean addTest(Tests t) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into NEWS  values (?,?,?)");
            ps.setInt(1, t.getId());
            ps.setString(2, t.getName());
            ps.setInt(3, t.getPrice());
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("Inserted item"+t.getName());
                return true;
            } 
        } catch (Exception e) {
            System.out.println("Not inserted due to error:"+e.getMessage() );
            
        }
        
        return false;
    }

    @Override
    public boolean updateTest(Tests t) {
       try {
            PreparedStatement ps = conn.prepareStatement("update NEWS  set item = ?, price =? where id = ?");
            ps.setString(1, t.getName());
            ps.setInt(2, t.getPrice());
            ps.setInt(3, t.getId());
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("Updated item"+t.getName());
                return true;
            } 
        } catch (Exception e) {
            System.out.println("Not updated due to error:"+e.getMessage() );
            
        }
        
        return false;
    }

    @Override
    public boolean deleteTest(Tests t) {
          try {
            PreparedStatement ps = conn.prepareStatement("delete from NEWS  where id = ?");
            ps.setInt(1, t.getId());
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("deleted item"+t.getName());
                return true;
            } 
        } catch (Exception e) {
            System.out.println("Not deleted due to error:"+e.getMessage() );
            
        }
        
        return false;
    }
    
}
