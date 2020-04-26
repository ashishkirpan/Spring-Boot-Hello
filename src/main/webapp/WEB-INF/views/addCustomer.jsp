<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>  

<%@ taglib  uri="http://www.springframework.org/tags/form"  prefix="form" %>
  
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">


<h2> Spring Customer CRUD Application </h2>

<c:if test="${customer!=null}">



<div >

<form:form   modelAttribute="customer"  action="${pageContext.servletContext.contextPath}/spring/add"  method="post" >
<h2> Add Customer </h2>
<table>

<tr>
<td><form:label path="customerId">CUSTOMER ID</form:label>   </td>
<td><form:input path="customerId"/>  </td>
</tr>

<tr>
<td><form:label path="firstName">FIRST NAME</form:label>   </td>
<td><form:input path="firstName"/>  </td>
</tr>

<tr>
<td><form:label path="lastName">LAST NAME</form:label>   </td>
<td><form:input path="lastName"/>  </td>
</tr>

<tr>
<td><form:label path="gender">GENDER</form:label>   </td>
<td><form:input path="gender"/>  </td>
</tr>

<tr>
<td><form:label path="email">EMAIL</form:label>   </td>
<td><form:input path="email"/>  </td>
</tr>

<tr>
<td><form:label path="address">ADDRESS</form:label>   </td>
<td><form:input path="address"/>  </td>
</tr>

<tr>
<td><form:label path="city">CITY</form:label>   </td>
<td><form:input path="city"/>  </td>
</tr>

<tr>
<td><form:label path="state">STATE</form:label>   </td>
<td><form:input path="state"/>  </td>
</tr>

<tr>
<td> <input type="submit"  value="ADD CUSTOMER" class="btn btn-primary"> </td>
</tr>



</table>

</form:form>

</div>

</c:if>

<hr/>





<div align="right">
<a href="${pageContext.servletContext.contextPath}/spring/new"><input  type="button"  value="ADD CUSTOMER"  class="btn btn-primary"></a>

</div>


<table class="table table-hover table-striped table-responsive">
<thead>
<tr>
<th>CUSTOMER ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>GENDER</th>
<th>EMAIL</th>
<th>ADDRESS</th>
<th>CITY</th>
<th>STATE</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
</thead>
<tbody>

<c:forEach var="c"  items="${customers}">
<tr>
<td>${c.customerId}</td>
<td>${c.firstName}</td>
<td>${c.lastName}</td>
<td>${c.gender}</td>
<td>${c.email}</td>
<td>${c.address}</td>
<td>${c.city}</td>
<td>${c.state}</td>
<td><a href="${pageContext.servletContext.contextPath}/spring/edit/${c.customerId}"><input  type="button"  value="EDIT"  class="btn btn-info"></a></td>
<td><a href="${pageContext.servletContext.contextPath}/spring/delete?customerId=${c.customerId}"><input  type="button"  value="DELETE"  class="btn btn-danger"></a></td>
</tr>
</c:forEach>



</tbody>
</table>




</div>


</body>
</html>