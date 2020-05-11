<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation2.jspf"%>

 <div class="container">
      <div class="row row-offcanvas row-offcanvas-left">


       <div class="col-xs-12 col-sm-9">
       <div style="background-color: RGB(240, 240, 240);  !important" class="jumbotron">
       <h1>Welcome page</h1>
        <p> <small>
        Welcome page
        </p>
        </div>
        <p>&copy; NetCrackerCompany 2020</p>
        <div style="height:75px; width:560px;"></div>
        <div style="height:75px; width:560px;"></div>
        </div><!--/span-->
        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
        <div class="list-group">
        <a href="#" class="list-group-item active">Menu</a>
        <a href="/list-bluecats" class="list-group-item">Go shopping</a>
<div class="bs-callout bs-callout-info">
  <h4>Заголовок компонента "Выноски"</h4>
  <p>...</p>
</div>
       </div>
       </div><!--/span-->

    </div><!--/.container-->
    <c:forEach  items="${listProducts}" var="product">
                 <tr>
                     <td>${product.id}</td>
                     <td>${product.name}</td>
                     <td>${product.description}</td>
                     <td>${product.count}</td>
                     <td>${product.price}</td>
                 </tr>
             </c:forEach>

<%@ include file="common/footer.jspf" %>
