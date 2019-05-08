<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<nav class="navbar">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">Online-shop</a>
    </div>

    <div class=" navbar-collapse collapse ">
      <ul class="nav navbar-nav">
        <li><a href="${pageContext.request.contextPath}/repair">Ремонт</a></li>
        </ul>

      <ul class="nav navbar-nav navbar-right" style="width: 300px;">
			<sec:authorize access="!isAuthenticated()">
		            <li><a href="/login">Логін</a></li>	            
		            <li><a href="/register">Реєстрація</a></li>		
		     </sec:authorize>
		     
		     <sec:authorize access="isAuthenticated()">
		     		<sec:authentication property="principal.username" var="username"/>
	     			<li><a href="/admin">${username}</a></li>

					<c:url var="logoutUrl" value="/logout" />
					<form:form action="${logoutUrl}" method="post" cssStyle="padding-top: 7px;">
						<li><input class="btn btn-danger" type="submit" value="logout" /></li>
					</form:form>
			</sec:authorize>
      </ul>
    </div>
  </div>
</nav>
