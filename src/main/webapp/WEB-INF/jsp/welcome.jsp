<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<html>
   <head>
      <title>Using GET Method to Read Form Data</title>
   </head>

   <body>
      <h1>Using GET Method to Read Form Data</h1>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("description")%>
         </p></li>
      </ul>

   </body>
</html>
<div class="container">

	<div class="panel panel-primary">
		<div class="panel-heading">Home Page</div>
		<div class="panel-body">
			Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your
			todo's.
		</div>
	</div>
</div>


<%@ include file="common/footer.jspf"%>