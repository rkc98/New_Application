<%-- 
    Document   : slide_upload
    Created on : 18 Dec, 2019, 12:23:33 PM
    Author     : RKC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
* {
  box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 10px;
  height: 500px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

</style>
</head>
<body>


<div class="row">
    <form action="adminslide" method="post" enctype="multipart/form-data">
    <div class="column" style="background-color:#aaa;">
    <h2>SLIDER IMAGE 1</h2>
    <table >
        <tr >
            <td >
                <input type="file" name="file" />
                
            </td>
          
        </tr>
        <tr >
            <td>
                image name:
               
                <input type="text" name="a1" />
                
            </td>
          
        </tr>
        <tr >
            <td>
                description:
            
                <input type="text" name="a2" />
                
            </td>
          
        </tr>
         <tr>
             <td>    
                 <button type="submit">
                     Submit
                 </button>
            </td>
          
        </tr>
    </table>
  </div>
    </form>
  <div class="column" style="background-color:#bbb;">
    <h2>SLIDER IMAGE 2</h2>
    <table >
        <tr >
            <td >
                <input type="file" />
                
            </td>
          
        </tr>
  <tr >
            <td>
                image name:
            
                <input type="text" name="a1" />
                
            </td>
          
        </tr>
        <tr >
            <td>
                description:
            
                <input type="text" name="a2" />
                
            </td>
          
        </tr>        <tr>
             <td>    
                 <button type="submit">
                     Submit
                 </button>
            </td>
          
        </tr>
    </table>
  </div>
  <div class="column" style="background-color:#ccc;">
    <h2>SLIDER IMAGE 3</h2>
    <table >
        <tr >
            <td >
                <input type="file" />
                
            </td>
          
        </tr>
         <tr >
            <td>
                image name:
            
                <input type="text" name="a1" />
                
            </td>
          
        </tr>
        <tr >
            <td>
                description:
            
                <input type="text" name="a2" />
                
            </td>
          
        </tr>
         <tr>
             <td>    
                 <button type="submit">
                     Submit
                 </button>
            </td>
          
        </tr>
    </table>
  </div>
</div>

</body>
</html>
