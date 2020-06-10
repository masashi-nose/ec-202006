/**
 * 
 * 
 */

$(function(){
	
	$('.slideshow').each(function(){
	
		var $slides = $(this).find('img'),	//全てのスライド要素
			slideCount = $slides.length,	//スライドの点数
			currentIndex = 0;				//現在のスライドを表すインデックス
	
		//現在のスライドをフェードイン
		$slides.eq(currentIndex).fadeIn();
		
		//5000ミリ秒ごとにshowNextSlide関数実行
		setInterval(showNextSlide, 5000);
		
		//次のスライドを表示する関数
		function showNextSlide(){
			
			//次に表示するスライドのインデックス
			//（もし最後のスライドならば、最初に戻る）
			var nextIndex = (currentIndex + 1) % slideCount;
			
			//現在のスライドをフェードアウト
			$slides.eq(currentIndex).fadeOut();
			
			//次のスライドをフェードイン
			$slides.eq(nextIndex).fadeIn();
			
			//現在のスライドのインデックスを更新
			currentIndex = nextIndex;
			
		}
		
		
		
	});
	
	
});