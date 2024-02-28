$(function(){


	$("#menubtn").on("click", function(){
		if ($("header > nav").hasClass("open")) {
			$("header > nav").removeClass("open")
		}else{
			$("header > nav").addClass("open")
		}	
	})
	$("#FB").on("click",function(){
            window.open('http://www.facebook.com/share.php?u='.concat(encodeURIComponent(location.href)),"_blank","toolbar=yes,location=yes,directories=no,status=no,menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=600,height=400" )
        })
	$('.one-time').click({
	  dots: true,
	  infinite: true,
	  speed: 300,
	  slidesToShow: 1,
	  adaptiveHeight: true
})
})