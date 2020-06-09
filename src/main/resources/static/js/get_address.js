/**
 * 
 */
$(function() {

	$('#get_address_btn').on('click', function() {
		AjaxZip3.zip2addr('zipcode', '', 'address', 'address');

		AjaxZip3.onFailure = function() {
			alert('郵便番号に該当する住所が見つかりません。');

		};

		return false;
	});

});
