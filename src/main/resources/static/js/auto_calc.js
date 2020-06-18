/**
 * 
 */

$(function() {
	calc_subTotal();

	$(".item-quantity").on("change", function() {
		calc_subTotal();
	});

	function calc_subTotal() {
		var subTotal = 0, $itemPrice = $("#item-price").text(), $quantity = $(
				".item-quantity option:selected").val();

		console.log($itemPrice);

		var $int_itemPrice = parseInt($itemPrice.replace(/,/, ''));
		subTotal = $int_itemPrice * $quantity;
		$("#total-price").text(subTotal.toLocaleString());
	}

});
