<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <c:forEach items = "${tablet}" var="tablet">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center"><span class="label label-info">${ tablet.brand}</span></h4>
					<img src="http://placehold.it/650x450&text=Galaxy S5" class="img-responsive">
					<div class="caption">
						<div class="row">
							<div class="col-md-6 col-xs-6">
								<h3>${ tablet.name}</h3>
							</div>
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>$${ tablet.price}</label></h3>
							</div>
						</div>
						<p>${ tablet.description}</p>
						<div class="row">
							<div class="col-md-6">
								<a class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> Like</a> 
							</div>
							<div class="col-md-6">
								<a href="/${tablet.id}/basket" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
						</div>

						<p> </p>
					</div>
				</div>
			</div>
			</c:forEach>