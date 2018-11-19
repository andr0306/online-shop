<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <c:forEach items = "${tablet}" var="tablet">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center"><span class="label label-info">${ tablet.brand}</span></h4>
					<img src="${pageContext.request.contextPath}${"resources/images/"}${tablet.img}"/>
					<div class="caption">
						<div align="center" class="row">
							<div class="col-md-6 col-xs-6">
								<h3>${ tablet.name}</h3>
							</div>
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>$${ tablet.price}</label></h3>
							</div>
						</div>
						<p align = "center">${ tablet.description}</p>
						<div  class="row">
							<div  class="col-md-6">
								<button><a href="/${tablet.id}/basket">Buy</a></button>
								</div>
						</div>

						<p> </p>
					</div>
				</div>
			</div>
			</c:forEach>