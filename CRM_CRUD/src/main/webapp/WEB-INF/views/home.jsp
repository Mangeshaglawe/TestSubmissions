<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Relationship Management Page</title>
</head>
<body>
	<div align="center">
		<h1>Customer List</h1>
		<h3>
			<!--  <button type="submit" value="newCustomer"  style="background-color: gray;">Add Customer</button>-->
			<a href="newCustomer">New Customer</a>
		</h3>
		<table border="1">

			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Action</th>

			<c:forEach var="customer" items="${customers}">
				<tr>

					<td>${customer.first_name}</td>
					<td>${customer.last_name}</td>
					<td>${customer.email}</td>

					<td><a href="editCustomer?id=${customer.id}">Edit</a> 
					<a href="deleteCustomer?id=${customer.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>