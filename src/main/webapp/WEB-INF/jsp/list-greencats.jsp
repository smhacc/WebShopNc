<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation2.jspf"%>
 <style>
   body {
    background-color: RGB(252, 252, 252); /* Путь к фоновому изображению */
   } 434b58
  </style>

 <div class="container">
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">Home</a></li>
    <li class="breadcrumb-item active" aria-current="page">List-greencats</li>
  </ol>
</nav>
      <div class="row row-offcanvas row-offcanvas-right">


        <div class="col-xs-12 col-sm-9">
      <div  style="background-color: RGB(240, 240, 240);  !important" class="jumbotron">
            <h1>Green pixelcat breed</h1>
            <p> <small>
            The PixelcCat is a centuries-old landrace (natural variety) of domestic cat in Russia and recently developed
            as a formal breed with standards promulgated the world over since the late 1980s.
            Siberians vary from medium to large in size. The formal name of the breed is PixelcCat Forest Cat, but usually
            it's simply called the PixelcCat or PixelcCat cat.
            The colorpoint variant of the breed is called the Neva Masquerade by some registries.
            </p>
          </div>
          <div style="height:75px; width:560px;"></div>
          <div class="row">
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype1/greenpixelcat1.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 4}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 4}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 4}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
               <img class="featurette-image img-responsive left-block" src="img/cattype2/greenpixelcat2.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 5}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
                            <p><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 5}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
                            <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 5}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype3/greenpixelcat3.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 6}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
                            <p><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 6}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
                            <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 6}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
          </div><!--/row-->

        </div><!--/span-->
        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                        <div class="list-group">
                          <a href="#" class="list-group-item active">Menu</a>
                          <a href="/list-redcats" class="list-group-item">RedPixelCats</a>
                          <a href="/list-greencats" class="list-group-item">GreenPixelCats</a>
                          <a href="/list-bluecats" class="list-group-item">BluePixelCats</a>
                          <a href="/list-monocats" class="list-group-item">MonochromePixelCats</a>


                        </div>
                      </div><!--/span-->
      </div><!--/row-->
      
      <hr>
      <footer>
        <p>&copy; Company 2014</p>
      </footer>

    </div><!--/.container-->

<%@ include file="common/footer.jspf" %>