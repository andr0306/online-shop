<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <c:forEach items = "${pc}" var="pc">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center"><span class="label label-info">${pc.brand}</span></h4>
					<img src="${pageContext.request.contextPath}${"resources/images/"}${pc.img}"/>
					<div class="caption">
						<div class="row">
							<div class="col-md-6 col-xs-6">
								<h3>${ pc.name}</h3>
							</div>
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>$${ pc.price}</label></h3>
							</div>
						</div>
						<p>${ pc.description}</p>
						<div class="row">
							<div class="col-md-6">
								<a class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> Like</a> 
							</div>
							<div class="col-md-6">
								<a href="/${notebook.id}/basket" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
						</div>

						<p> </p>
					</div>
				</div>
			</div>
			</c:forEach>