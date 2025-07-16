<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h2>Welcome</h2>

<table border="1">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Details</th>
    <th>Category</th>
    <th>Quantity</th>
  </tr>

  <c:if test="${not empty productList}">
  <c:forEach var="product" items="${productList}">
    <tr>
      <td>${product.id}</td>
      <td>${product.proname}</td>
      <td>${product.proprice}</td>
      <td>${product.prodetails}</td>
      <td>${product.procategory}</td>
      <td>${product.proquantity}</td>
    </tr>
  </c:forEach>
</c:if>
  
</table>
