/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author RKC
 
 * /
 * */
@MultipartConfig(maxFileSize = 16177215)
public class adminslide extends HttpServlet {

        /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


    

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    PrintWriter out=response.getWriter();
    
   

        String imagename = request.getParameter("a1");
    String desc = request.getParameter("a2");
    Part part= request.getPart("file");
    String filename=extractfilename(part);
    String savepath="C:\\Users\\RKC\\Documents\\NetBeansProjects\\newswebsite\\web\\img" ;
  //  File file= new File(savepath);
//   part.write(savepath +File.separator);
String fs="img"+File.separator+filename;
      OutputStream outs = null;
        InputStream filecontent = null;
        final PrintWriter writer = response.getWriter();

        try {
            outs = new FileOutputStream(new File(savepath + File.separator + filename));
            filecontent = part.getInputStream();

            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                outs.write(bytes, 0, read);
            }
                    
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahul","root","root");
               PreparedStatement pst = con.prepareStatement("insert into demos values (?,?,?)");
              pst.setString(1, imagename);
              pst.setString(2, desc);
            pst.setString(3, fs);
             int row=pst.executeUpdate();
             out.println("<h1>"+row+" inserted sucessfully");
           }
           catch(Exception e)
           {
               System.out.println(e);
           }
         finally {
            if (out != null)
                out.close();
            if (filecontent != null)
                filecontent.close();
            if (writer != null)
                writer.close();
        }
      
    }
  
private String extractfilename(final Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
       
    return null;
}

    }  