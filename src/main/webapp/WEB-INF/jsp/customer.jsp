<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<body >
	<h1 align="center">DXC.technology</h1>
	<hr width="80%" size='2' color='black'>
	
	<center><c:if test="${not empty cust}">

		
			<c:forEach var="custValue" items="${cust}">
				${custValue}<br>
			</c:forEach>
		

	</c:if>
</body>
</html>
