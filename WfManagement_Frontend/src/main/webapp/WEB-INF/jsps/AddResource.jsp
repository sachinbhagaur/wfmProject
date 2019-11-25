<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<form>	
     <table>		
              
             <tr>
				<td>
				<label for="name">Name: </label>
				</td>
				<td>
				<input id="name" maxlength="50" name="name" type="text" />
				</td>
			</tr> 
              <tr>
					<td><label for="role">Role: </label></td>
					<td><input id="role" maxlength="50" name="role" type="text" /></td>
				</tr>
              
              <tr>			
               <td>				
                   Email Address:			
               </td>			
                <td>				
                   <input type=”text” email=””>			
                </td>		
           </tr>
            <tr>
                 <td>				
                   Password:			
                 </td>			
                 <td>				
                  <input type=”Password” name=””>	 		
                 </td>
                 </tr>		
              
           
           <tr>
           <td>				
                Gender:			
            </td>
           <td>
            <input type="radio" name="gender" value="male" checked> Male<br>
  			<input type="radio" name="gender" value="female"> Female<br>
  			<input type="radio" name="gender" value="transgendar"> Transgendar
          </td>
          </tr>
           	
     </table>
</form> 

</body>
</html>