<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation2.jspf"%>
 <style>
   body {
    background-color: RGB(252, 252, 252); /* Путь к фоновому изображению */
   } 434b58
  </style>

 <div class="container">
      <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#menu1">RedPixelCats</a></li>
        <li><a data-toggle="tab" href="#menu2">GreenPixelCats</a></li>
        <li><a data-toggle="tab" href="#menu3">BluePixelCats</a></li>

      </ul>

      <div class="tab-content">

        <div id="menu3" class="tab-pane fade">
                  <div style="height:75px; width:560px;"></div>

          <div class="row">
         <div class="col-6 col-sm-6 col-lg-4">
           <img class="featurette-image img-responsive left-block" src="img/cattype1/bluepixelcat1.png" width="170" height="170" alt="Generic placeholder image">
           <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 7}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
             <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 7}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
           <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 7}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
           <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
           <p><a class="btn btn-default btn-success" href="/new?count=1{product.count}" role="button">Add to cart &raquo;</a></p>
         </div><!--/span-->
         <div class="col-6 col-sm-6 col-lg-4">
           <img class="featurette-image img-responsive left-block" src="img/cattype2/bluepixelcat2.png" width="170" height="170" alt="Generic placeholder image">
           <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 8}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
           <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 8}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
           <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 8}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
           <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
           <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
         </div><!--/span-->
         <div class="col-6 col-sm-6 col-lg-4">
           <img class="featurette-image img-responsive left-block" src="img/cattype3/bluepixelcat3.png" width="170" height="170" alt="Generic placeholder image">
           <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 9}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
           <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 9}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
           <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 9}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
           <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
           <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
         </div><!--/span-->
         </div><!--/row-->
        </div>
        <div id="menu1" class="tab-pane fade">


          <div style="height:75px; width:560px;"></div>


          <div class="row">

            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype1/redpixelcat1.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 1}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 1}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 1}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
               <img class="featurette-image img-responsive left-block" src="img/cattype2/redpixelcat2.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 2}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 2}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 2}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype3/redpixelcat3.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 3}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 30rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 3}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 3}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
          </div><!--/row-->
           </div>
        <div id="menu2" class="tab-pane fade">


         <div style="height:20px; width:560px;"></div>


         <div class="container">
            <h1>Green pixelcat breed<h1>
            <h1 style="width: 90rem;"><small>The PixelcCat is a centuries-old landrace (natural variety) of domestic cat in Russia and recently developed
            as a formal breed with standards promulgated the world over since the late 1980s.
            Siberians vary from medium to large in size. The formal name of the breed is PixelcCat Forest Cat, but usually
            it's simply called the PixelcCat or PixelcCat cat.
            The colorpoint variant of the breed is called the Neva Masquerade by some registries.</h2>
          <div style="height:80px; width:560px;"></div>
          <div class="row">
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype1/greenpixelcat1.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 4}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 25rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 4}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 4}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype2/greenpixelcat2.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 5}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 25rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 5}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 5}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
            <div class="col-6 col-sm-6 col-lg-4">
              <img class="featurette-image img-responsive left-block" src="img/cattype3/greenpixelcat3.png" width="170" height="170" alt="Generic placeholder image">
              <h3><c:forEach items="${listProducts}" var="product"><c:if test="${product.id == 6}"><tr><td>${product.name}</td> </tr></c:if> </c:forEach></h3>
              <p style="width: 25rem;"><c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 6}"> <tr><td>${product.description}</td> </tr> </c:if></c:forEach></p>
              <h4>Price: <c:forEach  items="${listProducts}" var="product"><c:if test="${product.id == 6}"> <tr><td>${product.price}</td> </tr> </c:if></c:forEach>$
              <span class="text-muted"><h5>All prices are not include tax.</h5></span></h4>
              <p><a class="btn btn-default btn-success" href="#" role="button">Add to cart &raquo;</a></p>
            </div><!--/span-->
          </div><!--/row-->
         </div>
      </div>





      <hr>
      <footer>
        <p>&copy; Company 2014</p>
      </footer>


    </div><!--/.container-->

<%@ include file="common/footer.jspf" %>