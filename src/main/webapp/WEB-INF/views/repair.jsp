<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->


       <form:form method="POST" action="${pageContext.request.contextPath }" modelAttribute="repair">
        <div class="col-sm-5">
            <h4>Repair List:</h4>
            <div class="panel panel-default">
                <div class="panel-body form-horizontal payment-form">
                    <div class="form-group">
                        <label for="concept" class="col-sm-3 control-label">Device</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="device" name="device">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Model</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="model" name="model">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="description" class="col-sm-3 control-label">Problem</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="problem" name="problem">
                        </div>
                    </div> 
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Your name</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="firstName" name="firstName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="amount" class="col-sm-3 control-label">Phone number</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
                        </div>
                    </div>
                     
                               
                    <div class="form-group">
                        <div class="col-sm-12 text-right">
                            <button type="submit" class="btn btn-default preview-add-button">
                                <span class="glyphicon glyphicon-plus"></span> Add
                            </button>
                             <a href="/admin/adminpage" class="btn btn-success btn-product"> Back</a>
                        </div>
                    </div>
                </div>
            </div>            
        </div>
        </form:form>