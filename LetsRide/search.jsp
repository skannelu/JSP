<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
<center><img src="letsride.png" align="middle" alt="Lets Ride" ><center>
 <form method="post" name="frm" action="Search">
      <table border="0" width="300" align="center" bgcolor="#e9f">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        <h3>Search rides</h3></td></tr>
        <tr><td ><b>Source</b></td>
        <td>: <input  type="text" name="pid" id="pid">
        <tr><td ><b>Destination</b></td>
          <td>: <input  type="text" name="destination" id="destination">
        </td></tr>        
        <tr><td colspan=2 align="center">
        <input  type="submit" name="submit" value="Search"></td></tr>
      </table>
    </form>
</body>
</html>