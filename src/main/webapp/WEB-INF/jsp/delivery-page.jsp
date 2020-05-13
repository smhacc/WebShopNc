<table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Title</th>
            <th width="120">Author</th>
            <th width="120">Price</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listBooks}" var="book">
            <tr>
                <td>${book.id}</td>
                <td><a href="/bookdata/${book.id}" target="_blank">${book.bookTitle}</a></td>
                <td>${book.bookAuthor}</td>
                <td>${book.price/100}${book.price%100}</td>
                <td><a href="<c:url value='/edit/${book.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${book.id}'/>">Delete</a></td>
                <td><a href="<c:url value='/save-order/${order.id == 8}'/>">Delete</a></td>

            </tr>
        </c:forEach>
    </table>

<form:form method="post" action="addDeveloper">
  <table>
    <tr>
      <td><form:label path="id">Id</form:label></td>
      <td><form:input path="id" /></td>
    </tr>
    <tr>
      <td><form:label path="name">Name</form:label></td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td><form:label path="specialty">Specialty</form:label></td>
      <td><form:input path="specialty" /></td>
    </tr>
    <tr>
      <td><form:label path="experience">experience</form:label></td>
      <td><form:input path="experience" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>