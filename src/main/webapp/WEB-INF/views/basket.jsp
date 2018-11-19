<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<script src="<c:url value="/resources/js/1.js" />" defer></script>
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<div class="container">
    <div class="row">
        <div class="col-sm-12 col-md-10 col-md-offset-1">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th></th>
                        <th>Quantity</th>
                        <th class="text-center">Price</th>
                        <th class="text-center">Total</th>
                        <th> </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="col-sm-8 col-md-6">
                        <div class="media">
                            <a class="thumbnail pull-left"> <img class="media-object" src="/${"resources/images/"}${notebook.img}"> </a>
                            <div class="media-body" align="center">
                                <h4 class="media-heading"><a href="#"> </a>${notebook.brand} </h4>
                                <h5 class="media-heading">${notebook.name}<a href="#"></a></h5>
                                <span>Статус: </span><span class="text-success"><strong>В наявності</strong></span>
                            </div>
                        </div></td>
                        <td class="col-sm-1 col-md-1" style="text-align: center">
                        <input type = "number" class="form-control" id="number" onchange="func1()">
                        </td>
                        <td class="col-sm-1 col-md-1 text-center" id="price">${notebook.price}</td>
                        <td class="col-sm-1 col-md-1 text-center" id="sum">$600</td>
                        <td class="col-sm-1 col-md-1">
        
                    </tr>
                    <tr>
                        <td>   </td>
                        <td>   </td>
                        <td>   </td>
                        <td>
                        <button type="button" class="btn btn-default">
                            <span class="glyphicon glyphicon-shopping-cart"></span> Continue Shopping
                        </button></td>
                        <td>
                        <button type="button" class="btn btn-success">
                            Checkout <span class="glyphicon glyphicon-play"></span>
                        </button></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>