<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome, ${firstname}</h2>


<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Details</th>
    <th>Category</th>
    <th>Quantity</th>
  </tr>

  <tr>
    <td>${product.id}</td>
    <td>${product.proname}</td>
    <td>${product.proprice}</td>
    <td>${product.prodetails}</td>
    <td>${product.procategory}</td>
    <td>${product.proquantity}</td>
  </tr>
</table>

 
</body>
</html>