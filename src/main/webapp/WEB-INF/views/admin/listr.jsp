<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="container">
	<div class="row">
    	<div class="col-md-8 col-md-offset-2">
    	    <div class="panel panel-default ticket-list">
              <div class="panel-heading">
                <h3 class="panel-title text-center">Notebooks</h3>
              </div>
              <div class="panel-body ">
                  <table class="table">
                    <thead class='table-head'>
                      <tr class='table-head'>
                     	 <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>Price</th>
                        <th>Delete</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach items = "${repairsList }" var="repair">
                      <tr>
                        <td>${ repair.id}</td>
                        <td>${ repair.device}</td>
                        <td>${ repair.model}</td>
                        <td>${ repair.problem}</td>
                        <td>${ repair.firstName}</td>
                        <td>$${ repair.phoneNumber}</td>
                        <td><a href = "${pageContext.request.contextPath }/admin/${repair.id}/deleterepair">Delete</a></td>
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