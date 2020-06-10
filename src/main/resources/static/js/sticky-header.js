/**
 * 
 */

$(function() {
	$('.page-header').each(function() {

		var $window = $(window), // ウィンドウをオブジェクト化
		$header = $(this), // ヘッダーをオブジェクト化
		headerOffsetTop = $header.offset().top; // ヘッダーのデフォルト位置を取得

		// ウィンドウのスクロールイベントを監視
		// ウィンドウがスクロールされるごとに処理実行
		$window.on('scroll', function() {

			// ウィンドウのスクロール量をチェックし、ヘッダーのデフォルト位置を過ぎていればクラス付与
			// そうでなければ削除
			if ($window.scrollTop() > headerOffsetTop) {
				$header.addClass('sticky');
			} else {
				$header.removeClass('sticky');
			}

		});

		// ウィンドウのスクロールイベント発生
		// ヘッダーの初期位置調整のため
		$window.trigger('scroll');

	});

});
