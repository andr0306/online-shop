
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
    <div id="list">
        <div>
            <ul class="nav nav-pills nav-stacked">
                <li class="active"><a href="/"><i class="fa fa-home fa-fw" ></i>Home</a></li>
               <li class="dropdown">
          <a href="#" class="dropdown-toggle" class="fa fa-list-alt fa-fw" data-toggle="dropdown" role="button" aria-expanded="false">Add <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/addp">PC</a></li>
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/addt">Tablet</a></li>
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/addn">Notebook</a></li>
          </ul>
        </li>
               <li class="dropdown">
          <a href="#" class="dropdown-toggle" class="fa fa-list-alt fa-fw" class="fa fa-list-alt fa-fw" data-toggle="dropdown" role="button" aria-expanded="false">Lists <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/listp">PC</a></li>
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/listt">Tablet</a></li>
            <li><a href="${pageContext.request.contextPath}/admin/adminpage/listn">Notebook</a></li>
          </ul>
        </li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-bar-chart-o fa-fw"></i>Profile</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-table fa-fw"></i>Table</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-tasks fa-fw"></i>Forms</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-calendar fa-fw"></i>Calender</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-book fa-fw"></i>Library</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-pencil fa-fw"></i>Applications</a></li>
                <li><a href="http://www.jquery2dotnet.com"><i class="fa fa-cogs fa-fw"></i>Repair list</a></li>
            </ul>
        </div>
    </div>
</div>

<style>
#list{
		margin:auto;
		margin-left:500px";
		
	}
	
	li{
	text-align:center;
	}
	
	.dropdown-menu{
		text-align:center;
		width:50%;
		margin-left:25%;
	}
</style>