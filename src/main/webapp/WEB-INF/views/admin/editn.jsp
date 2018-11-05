<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<%@ page contentType="text/html; charset=UTF-8" %>


 <form:form method="POST" action="${pageContext.request.contextPath}/admin/${notebookId}/editnotebook" modelAttribute="notebook">
        <div id="frm">
             <h4 style="text-align:center">edit notebook:</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="concept" class="col-sm-3 control-label">Brand</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="brand" name="brand">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Name</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="name" name="name">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Description</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="description" name="description">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Price</label>
                        <div class="col-sm-9">
                            <input type="number" class="form-control" id="price" name="price">
                        </div>
                    </div>
                      <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Img</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="img" name="img">
                        </div>
                    </div> 
                               
                    <div class="form-group">
                        <div class="col-sm-12 text-right">
                            <button type="submit" class="btn btn-default preview-add-button">
                                <span class="glyphicon glyphicon-plus"></span> Add
                            </button>
                             <a href="/admin" class="btn btn-success btn-product"> Back</a>
                        </div>
                    </div>
                </div>
            </div>            
        </div>
        </form:form>
        
        <style>
        	#frm{
        	width: 60%;
        	margin:auto;
        	}
        </style>