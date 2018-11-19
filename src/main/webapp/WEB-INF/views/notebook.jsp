<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <c:forEach items = "${notebook}" var="notebook">
			<div class="col-sm-6 col-md-4">
				<div class="thumbnail" >
					<h4 class="text-center"><span class="label label-info">${ notebook.brand}</span></h4>
					<img src="${pageContext.request.contextPath}${"resources/images/"}${notebook.img}"/>
					<div class="caption">
						<div align="center" class="row">
							<div class="col-md-6 col-xs-6">
								<h3>${ notebook.name}</h3>
							</div>
							<div class="col-md-6 col-xs-6 price">
								<h3>
								<label>$${ notebook.price}</label></h3>
							</div>
						</div>
						<p align = "center">${ notebook.description}</p>
						<div  class="row">
							<div  class="col-md-6">
								<button><a href="/${notebook.id}/basket">Buy</a></button>
								</div>
						</div>

						<p> </p>
					</div>
				</div>
			</div>
			</c:forEach>