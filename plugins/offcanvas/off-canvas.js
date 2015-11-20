$(document).ready(function(){
	$('.main-nav').navgoco({
		accordion:true,
		save: true,
		cookie: {
			name: 'navi',
			expires: false,
			path: '/'
		},
		slide: {
			duration: 400,
			easing: 'swing'
		}
	});
	$("#off-canvas,.main-nav a,.overlay").on("swipe",function(){
		$('body').removeClass('menu-open');
		$('#off-canvas,.overlay').removeClass('open'); 
	});
	//off-canvas-menu
    $('.menu-off').click(function(){
      var navPosition;
      navPosition = $(this).attr('data-position');
      $('#off-canvas.' + navPosition + '').addClass('open');
      $('body').addClass('menu-open');
      return false;
    });
    return $('.overlay').click(function() {
      $('body').removeClass('menu-open');
      return $('#off-canvas,.overlay').removeClass('open');
    });
});