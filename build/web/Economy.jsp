<%-- 
    Document   : Economy
    Created on : 22 Dec, 2019, 2:10:05 PM
    Author     : RKC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sun.xml.rpc.wsdl.document.Import"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import ="dto.DB_Conn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="header.jsp" %>
        <div class="row">
									<!-- Column 1 -->
									     <%
                                                                                 String cat="math";
                                                                                DB_Conn con=new DB_Conn();
                                                                                Connection c =con.getConnection();
                                                                                Statement st =c.createStatement();
                                                                             // select * from news where nid="+id+"
                                                                                String query="select * from news where category='Economy'";
                                                                                ResultSet rs=st.executeQuery(query);
                                                                                while(rs.next())
                                                                                {
                                                                                    String img=rs.getString("image");
										String head=rs.getString("heading");
                                                                                    String date=rs.getString("date");
                                                                                    String id=rs.getString("nid");
                                                                                %>
						
                                                                                <div class="col-md-3">
										<article class="article">
											<div class="article-img">
												<a href="post.jsp?id=<%= id %>">
                                                                                                    <img src="<%=img%>" alt="" >
												</a>
												<ul class="article-info">
													<li class="article-type"><i class="fa fa-camera"></i></li>
												</ul>
											</div>
											<div class="article-body">
												<h4 class="article-title"><a href="post.jsp?id=<%= id %>"><%=head%></a></h4>
												<ul class="article-meta">
													<li><i class="fa fa-clock-o"></i><%=date%> </li>
													<li><i class="fa fa-comments"></i> 33</li>
												</ul>
											</div>
										</article>
										<!-- /ARTICLE -->
									</div>
                                                                                                        
									<!-- Column 4 -->
								
                                                                                <%
                                                                              } rs.close();
st.close();
c.close();


                                                                                %>
                                                                                </div>
                                                                
        <%@include file="footer.jsp" %>
    </body>
</html>
