console.log("Test");
function myFunction() {
	var one = document.getElementById("one").value;        
    var two = document.getElementById("two").value;
    var three = document.getElementById("three").value;
    var four = document.getElementById("four").value;
    if(one < 0 || two < 0 || three < 0 || four < 0){
    	window.alert("You need a national treasure to become a treasure yourself!");
    }
    else{
    var itemArray = [one, two, three, four];
    var priceArray = [2.55, 12.99, 3.50, 6.99];
	var total = 0;
    for (var i = 0; i < itemArray.length; i++){
    	total += (itemArray[i] * priceArray[i]);
    }
    var tax = total * .06;
    var taxFixed = tax.toFixed(2);
    var totalFixed = total.toFixed(2);
    var totalCart = tax + total;
    var totalCartFixed = tax.toFixed(2);
	window.alert("The total is: "+"$ "+ totalFixed + " with a tax of $" + taxFixed + " totaling to : $" + totalCartFixed);
    }
   }


function mouseOver() {
  document.getElementById("yellow").style.color = "yellow";
}
