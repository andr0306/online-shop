<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              <div class="panel-heading">
                <h3 class="panel-title text-center">Ticket</h3>
              </div>
              <div class="panel-body ">
                  <table class="table">
                    <thead class='table-head'>
                      <tr class='table-head'>
                     	 <th>ID</th>
                     	 <th>Brand</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Edit</th>
                        <th>Delete</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${tabletsList }" var="tablet">
                      <tr>
                        <td>${ tablet.id}</td>
                        <td>${ tablet.brand}</td>
                        <td>${ tablet.name}</td>
                        <td>${ tablet.description}</td>
                        <td>$${ tablet.price}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${tablet.id}/edittablet">Edit</a></td>
                         <td><a href = "${pageContext.request.contextPath }/admin/${tablet.id}/deletetablet">Delete</a></td>
                      </tr>
                      </c:forEach>
                    </tbody>
                  </table>    	
              </div>
            </div>
            <a href="/admin" class="btn btn-success btn-product"> Back</a>
    	</div>
	</div>
</div>