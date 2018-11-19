var price = document.getElementById("price").innerHTML;
parseInt(price);
function func1(){
    var number = document.getElementById("number").value;
    var sum = document.getElementById("sum");
    sum.innerHTML = "$"+ price * number;
}