<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <c:forEach items = "${notebook}" var="notebook">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center"><span class="label label-info">${ notebook.brand}</span></h4>
					<img src="${pageContext.request.contextPath}${"resources/images/"}${notebook.img}"/>
					<div class="caption">
						<div class="row">
							<div class="col-md-6 col-xs-6">
								<h3>${ notebook.name}</h3>
							</div>
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>$${ notebook.price}</label></h3>
							</div>
						</div>
						<p>${ notebook.description}</p>
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