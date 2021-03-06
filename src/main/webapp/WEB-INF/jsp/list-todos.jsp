<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation2.jspf"%>

<div class="container">
	<br>
	<div class="panel panel-success">
		<div class="panel-heading">
			<h3>YOUR CART</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="40%">Product</th>
						<th width="40%">Target Date</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listOrders}" var="order">
						<tr>
							<td>${order.id}</td>
							<td><fmt:formatDate value="${order.id}"
									pattern="dd/MM/yyyy" /></td>
							<a type="button" class="btn btn-danger"
								href="/delete-todo?id=${order.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>