<%@page import="com.sun.xml.rpc.wsdl.document.Import"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import ="dto.DB_Conn" %>

<!DOCTYPE html>
 


<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

		<title>Magnews HTML Template</title>

		<!-- Google font -->
		<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700%7CLato:300,400" rel="stylesheet"> 
		
		<!-- Bootstrap -->
		<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

		<!-- Owl Carousel -->
		<link type="text/css" rel="stylesheet" href="css/owl.carousel.css" />
		<link type="text/css" rel="stylesheet" href="css/owl.theme.default.css" />
		
		<!-- Font Awesome Icon -->
		<link rel="stylesheet" href="css/font-awesome.min.css">

		<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="css/style.css"/>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

    </head>
	<body>
	
            <%@include file="header.jsp" %>	
		<!-- Owl Carousel 1 -->
		<div id="owl-carousel-1" class="owl-carousel owl-theme center-owl-nav">
			<!-- ARTICLE -->
		 <%
                     {                                                             DB_Conn con=new DB_Conn();
                                                                                Connection c =con.getConnection();
                                                                                Statement st =c.createStatement();
                                                                                String query="select * from News where slider='yes'";
                                                                                ResultSet rs=st.executeQuery(query);
                                                                                while(rs.next())
                                                                                {
                                                                                    String img=rs.getString("image");
										String head=rs.getString("heading");
                                                                                    String date=rs.getString("date");
                                                                                    String id=rs.getString("nid");
                                                                                %>
                        <article class="article thumb-article">
				<div class="article-img">
                                    <img src="<%=img%>" alt="" style="height: 350px ;width: 650px">
				</div>
				<div class="article-body">
					<ul class="article-info">
						<li class="article-category"><a href="#">News</a></li>
						<li class="article-type"><i class="fa fa-camera"></i></li>
					</ul>
					<h2 class="article-title"><a href="post.jsp?id=<%= id %>"><%=head%></a></h2>
					<ul class="article-meta">
						<li><i class="fa fa-clock-o"></i><%=date%></li>
						<li><i class="fa fa-comments"></i> 33</li>
					</ul>
				</div>
			</article>
			<!-- /ARTICLE -->
		<%}
}%>
			<!-- /ARTICLE -->
		</div>
		<!-- /Owl Carousel 1 -->
		
		<!-- SECTION -->
		<div class="section">
			<!-- CONTAINER -->
			<div class="container">
				<!-- ROW -->
					<!-- Main Column -->
							<h2 class="title">Trending Posts</h2>
							<!-- tab nav -->
							
							<!-- /tab nav -->
						
						<!-- /section title -->
						
						<!-- Tab content -->
						<div class="tab-content">
							<!-- tab1 -->
							
								<!-- row -->
								<div class="row">
									<!-- Column 1 -->
									     <%
                                                                                DB_Conn con=new DB_Conn();
                                                                                Connection c =con.getConnection();
                                                                                Statement st =c.createStatement();
                                                                                String query="select * from News";
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
                                                                                                    <img src="<%=img%>" alt="" style="width: 300px;height: 200px" >
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
                                                                                <!-- /Column 1 -->
									
                                                                                <!-- /Column 1 -->
								</div>
								<!-- /row -->
								
								<!-- row -->
								
								<!-- /row -->
							
							<!-- /tab1 -->
						</div>	
								
						<!-- /tab content -->
					</div>
					<!-- /Main Column -->
				
				<!-- /ROW -->
                </div>
			<!-- /CONTAINER -->
		
		<!-- /SECTION -->
		
		
		
		<!-- SECTION -->
		<!-- /SECTION -->
		
		<!-- SECTION -->
		<div class="section">
			<!-- CONTAINER -->
			<div class="container">
				<!-- ROW -->
				<div class="row">
					<!-- Main Column -->
					<div class="col-md-8">
						<!-- section title -->
						<div class="section-title">
							<h2 class="title">Popular Posts</h2>
						</div>
						<!-- /section title -->
						
						<!-- ARTICLE -->
						<article class="article row-article">
							<div class="article-img">
								<a href="#">
									<img src="./img/img-md-1.jpg" alt="">
								</a>
							</div>
							<div class="article-body">
								<ul class="article-info">
									<li class="article-category"><a href="#">News</a></li>
									<li class="article-type"><i class="fa fa-file-text"></i></li>
								</ul>
								<h3 class="article-title"><a href="#">Duis urbanitas eam in, tempor consequat.</a></h3>
								<ul class="article-meta">
									<li><i class="fa fa-clock-o"></i> January 31, 2017</li>
									<li><i class="fa fa-comments"></i> 33</li>
								</ul>
								<p>Populo tritani laboramus ex mei, no eum iuvaret ceteros euripidis, ne alia sadipscing mei. Te inciderint cotidieque pro, ei iisque docendi qui.</p>
							</div>
						</article>
						<!-- /ARTICLE -->
						<!-- /ARTICLE -->
						
						<!-- pagination -->
						
						<!-- /pagination -->
					</div>
					<!-- /Main Column -->
					
					<!-- Aside Column -->
					<div class="col-md-4">
						<!-- article widget -->
						<div class="widget">
							<div class="widget-title">
								<h2 class="title">Featured Posts</h2>
							</div>
							
							<!-- owl carousel 4 -->
							<div id="owl-carousel-4" class="owl-carousel owl-theme">
								<!-- ARTICLE -->
								<article class="article thumb-article">
									<div class="article-img">
										<img src="./img/img-thumb-1.jpg" alt="">
									</div>
									<div class="article-body">
										<ul class="article-info">
											<li class="article-category"><a href="#">News</a></li>
											<li class="article-type"><i class="fa fa-video-camera"></i></li>
										</ul>
										<h3 class="article-title"><a href="#">Duis urbanitas eam in, tempor consequat.</a></h3>
										<ul class="article-meta">
											<li><i class="fa fa-clock-o"></i> January 31, 2017</li>
											<li><i class="fa fa-comments"></i> 33</li>
										</ul>
									</div>
								</article>
								<!-- /ARTICLE -->
							
								<!-- ARTICLE -->
								<article class="article thumb-article">
									<div class="article-img">
										<img src="./img/img-thumb-2.jpg" alt="">
									</div>
									<div class="article-body">
										<ul class="article-info">
											<li class="article-category"><a href="#">News</a></li>
											<li class="article-type"><i class="fa fa-video-camera"></i></li>
										</ul>
										<h3 class="article-title"><a href="#">Duis urbanitas eam in, tempor consequat.</a></h3>
										<ul class="article-meta">
											<li><i class="fa fa-clock-o"></i> January 31, 2017</li>
											<li><i class="fa fa-comments"></i> 33</li>
										</ul>
									</div>
								</article>
								<!-- /ARTICLE -->
							</div>
							<!-- /owl carousel 4 -->
						</div>
						<!-- /article widget -->
						
						<!-- galery widget -->
						
						<!-- /galery widget -->
						
						<!-- tweets widget -->
						
						<!-- /tweets widget -->
					</div>
					<!-- /Aside Column -->
				</div>
				<!-- /ROW -->
			</div>
			<!-- /CONTAINER -->
		</div>
		<!-- /SECTION -->
		
                <%@include file="footer.jsp" %>	
		<!-- Back to top -->
		<div id="back-to-top"></div>
		<!-- Back to top -->
		
		<!-- jQuery Plugins -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/owl.carousel.min.js"></script>
		<script src="js/main.js"></script>

	</body>
</html>
