package daoimpl;

import dao.NewsDao;
import dto.News;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author hamee_000
 */
public class NewsDaoImpl implements NewsDao{

    List<News> un;
    News n;
    Connection conn;
    PreparedStatement ps;

    public NewsDaoImpl() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/website", "root", "root");
            System.out.println("Connected");
        }
             catch (SQLException ex) {
                 System.err.println("Sql Exception Occured : "+ex.getMessage());            
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver not found "+ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    @Override
    public List<News> getAllNews() {
        un = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from News");
            while (rs.next()) {                
                n = new News();
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                n.setSlider(rs.getString(8));
                un.add(n);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching data : "+e.getMessage());
        }
        
        return un;
    }

    @Override
    public List<News> getAllApprovedNews() {
         un = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from News where approved = true");
            while (rs.next()) {                
                n = new News();
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                n.setSlider(rs.getString(8));
                un.add(n);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching data : "+e.getMessage());
        }
        
        return un;
    }

    @Override
    public List<News> getUnAllApprovedNews() {
         un = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from News where approved = false");
            while (rs.next()) {                
                n = new News();
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                 n.setSlider(rs.getString(8));
                un.add(n);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching data : "+e.getMessage());
        }
        
        return un;
    }

    @Override
    public News getNewsByID(int id) {
        n = new News();
        try {
            ps = conn.prepareStatement("select * from news where nid = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                 n.setSlider(rs.getString(8));
            }
        } catch (Exception e) {
            System.err.println("Error while fetching by id :"+e.getMessage());
        }
        
        return n;

    }

    @Override
    public List<News> getNewsByCategory(String cat) {
        un = new ArrayList<>();
        try {
            ps = conn.prepareStatement("select * from News where category = ?");
            ps.setString(1, cat);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                n = new News();
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                 n.setSlider(rs.getString(8));
                un.add(n);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching by cat :"+e.getMessage());
        }
        
        return un;
    }

    @Override
    public List<News> getNewsByHeading(String head) {
          un = new ArrayList<>();
        try {
            ps = conn.prepareStatement("select * from News where heading = ?");
            ps.setString(1, head);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                n = new News();
                n.setNid(rs.getInt(1));
                n.setHeading(rs.getString(2));
                n.setCategory(rs.getString(3));
                n.setContent(rs.getString(4));
                n.setDate(rs.getDate(5));
                n.setImage(rs.getString(6));
                n.setApproved(rs.getBoolean(7));
                 n.setSlider(rs.getString(8));
                un.add(n);
            }
        } catch (Exception e) {
            System.err.println("Error while fetching by head :"+e.getMessage());
        }
        
        return un;
    }

    @Override
    public boolean addNews(News n) {
        boolean flag = false;
        System.out.println("Date val : "+n.getDate());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
    System.out.println(formatter.format(n.getDate()));  
        try {
            ps = conn.prepareStatement("insert into News values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, n.getNid());
            ps.setString(2, n.getHeading().toLowerCase());
            ps.setString(3, n.getCategory().toLowerCase());
            ps.setString(4, n.getContent());
            ps.setDate(5, (Date)n.getDate());
            ps.setString(6, n.getImage());
            ps.setBoolean(7, n.isApproved());
             ps.setString(8,n.getSlider());
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("inserted  ");
                flag = true;
            } else {
                System.out.println("not inserted ");
                
            }
            
        } catch (Exception e) {
            System.err.println("Error while adding News : "+e.getMessage());
        }
        
        return flag;
    }

    @Override
    public boolean updateNews(News n) {
        boolean flag = false;
        System.out.println("Date val : "+n.getDate());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
    System.out.println(formatter.format(n.getDate()));  
        try {
            ps = conn.prepareStatement("update News set heading = ? , category = ? , content = ?, Date = ? ,image = ? ,approved = ?,slider=? where nid = ?");
            ps.setString(1, n.getHeading().toLowerCase());
            ps.setString(2, n.getCategory().toLowerCase());
            ps.setString(3, n.getContent());
            ps.setDate(4, (Date)n.getDate());
            ps.setString(5, n.getImage());
            ps.setBoolean(6, n.isApproved());
            ps.setString(7, n.getSlider());
            ps.setInt(8, n.getNid());
            
            
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("updated  ");
                flag = true;
            } else {
                System.out.println("not updated ");
                
            }
            
        } catch (Exception e) {
            System.err.println("Error while updating news : "+e.getMessage());
        }
        
        return flag;
    }

    @Override
    public boolean deleteNews(News n) {
        boolean flag = false;
        try {
            ps = conn.prepareStatement("delete from News where nid = ?");
            ps.setInt(1, n.getNid());
            int res = ps.executeUpdate();
            if (res != 0) {
                System.out.println("deleted");
                flag = true;
            } else {
                System.out.println("not deleted");
                
            }
        } catch (Exception e) {
            System.err.println("Error while deleting news.");
        }
        return flag;
    }
    
}
