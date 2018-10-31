
    <div class="row">
    <div class="col-sm-8 col-sm-offset-2">
        <div class="col-sm-2 col-md-5">
            <img src="data:image/png; base64, ${userProfile.imagePath } "
            alt="" class="img-rounded img-responsive"width=300px />
        </div>
        <div class="col-sm-4 col-md-4">
            <blockquote>
                <p>${userProfile.firstname } ${userProfile.lastname }</p> <small><cite title="Source Title">Gotham, United Kingdom  <i class="glyphicon glyphicon-map-marker"></i></cite></small>
            </blockquote>
            <p> <i class="glyphicon glyphicon-envelope"></i> ${userProfile.email }
                <br
                /> <i class="glyphicon glyphicon-globe"></i> www.bootsnipp.com
                <br /> <i class="glyphicon glyphicon-gift"></i> January 30,${2018 - userProfile.age }</p>
                <p class="text-center"><a class="btn btn-primary" href="/qweqwe">Buy</a></p>
                <p class="text-center"><a class="btn btn-primary" href="/admin/product/add">Add</a></p>
        </div>
       </div>
    </div>
