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
						<th width="40%">sum</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listOrders}" var="order">
						<tr>
							<td>${order.id}</td>
							<td>${order.price}</td>
							<td>${order.name}</td>

							<td><a type="button" class="btn btn-danger"
								href="/delete-order/${order.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
<p><a class="btn btn-default btn-warning" href="/list-bluecats" role="button">Back</a></p>

</div>
<%@ include file="common/footer.jspf"%>