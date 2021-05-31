
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            input[type=text],input[type=time],input[type=date],input[type=number]
            ,input[type=drop],input[type=description]
            {
  width: 500;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: #3CBC8D;
  color: white;
  
  
  
  }
  table, th, td {
  border: 1px solid black;
  
   
  
  }

  
        </style>
          
    </head>
    
    <body>
        <div
        <h1 ><b>Admin Control</b></h1>
      
      
        
        <div class="center" style="text-align:center">
        <form action="adminupdate" method="post" enctype="multipart/form-data">

                           <fieldset>
        
             <legend>Add Details</legend>
          <hr>
<!--          <table style="align="center" style="margin: 0 auto">-->
<table style="margin-left:auto;margin-right:auto;">
             <tr>
    <td><label for="id"><b>ID</b></label></td>
    <td><input type="number" name="number" placeholder="Enter ID" required></td>
  </tr>
  
  <tr>
    <td> <label for="heading"><b>Heading</b></label></td>
    <td><input type="text" name="heading" placeholder="Enter Heading" required><br/></td>
  </tr>
  
  <tr>
    <td><label for=Author"><b>Author</b></label></td>
    <td> <input type="text" name="author" placeholder="Enter Author Name" required>  
    
    </td>
  </tr>
  
  
  <tr>
    <td> <label for="Description"><b>Description</b></label></td>
    <td><input type="text" name="description" placeholder="Add Description" required></td>
  </tr>
  
  <tr>
      <td><label for="uploadimage"><b>Upload Image</b></label></td>
      <td><input type="file" name="file" id="file" ></td>
  
  </tr>
  
  
 
  
  
  
  <tr>
      <td><label for="category"><b>Select Category</b></label></td>
      <td><select name="drop1" >
                  <option value="Select">Select Category</option>
                <option value="Economy">Economy</option>
                <option value="Sport">Sport</option>
                <option value="Entertainment">Entertainment</option>
                <option value="Politics">Politics</option>
                <option value="Economy">Economy</option>
                  
                  
                  </select></td>
  </tr>
  <tr>
      <td><label>Select CAtegory to approval: </label></td>
      <td><select name="drop3">
              <option value="true">True</option>
              <option value="false">FALSE</option>
          </select>
      </td>
      
      
  </tr>
  
   <tr>
      <td><label>Set Images as slider: </label></td>
      <td><select name="drop2">
              <option value="yes">YES</option>
              <option value="no">NO</option>
          </select>
      </td>
      
      
  </tr>
 
  <tr>
  
  <button type="submit">Submit</button>
 
      </tr>
  

        
         </table>
      </form>
             <hr>
            </fieldset>
        </div>
        
    </body>
</html>
