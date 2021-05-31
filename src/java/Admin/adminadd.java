package Admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import daoimpl.NewsDaoImpl;
import dto.News;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Date;
import javax.servlet.annotation.MultipartConfig;
/**
 *
 * @author student
 */
@MultipartConfig(maxFileSize = 16177215)
public class adminadd extends HttpServlet {
String selecteditem;
String slideradd;
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

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
        
       int id=Integer.parseInt(request.getParameter("number"));
        String heading=request.getParameter("heading");
        //String author=request.getParameter("author");
        String descripton=request.getParameter("description");
       //String images=request.getParameter("fileToUpload");
        //String date=request.getParameter("Date1");
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
            } }catch(Exception e)
           {
               System.out.println(e);
           }
         finally {
//            if (out != null)
//                out.close();
            if (filecontent != null)
                filecontent.close();
            if (writer != null)
                writer.close();
        }
   
       //String image="abc.jpg";
       if(request.getParameter(("drop1"))!=null){
           selecteditem=request.getParameter("drop1");
       }
         //String image="abc.jpg";
       if(request.getParameter(("drop2"))!=null){
           slideradd=request.getParameter("drop2");
       }
       Boolean isapproved=true;
      java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    NewsDaoImpl ndi = new NewsDaoImpl();
    News n=new News(id, heading, selecteditem, descripton, sqlDate, fs, isapproved,slideradd);
   ndi.addNews(n);
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

    
