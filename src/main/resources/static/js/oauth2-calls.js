$(document).ready(function(){

	$.ajaxSetup({
		beforeSend : function(xhr, settings) {
		  if (settings.type == 'POST' || settings.type == 'PUT'
		      || settings.type == 'DELETE') {
		    if (!(/^http:.*/.test(settings.url) || /^https:.*/
		        .test(settings.url))) {
		      // Only send the token to relative URLs i.e. locally.
		      xhr.setRequestHeader("X-XSRF-TOKEN",
		          Cookies.get('XSRF-TOKEN'));
		    }
		  }
		}
		});
	
	
	window.fbAsyncInit = function() {
		FB.init({
			appId : '{your-app-id}',
			cookie : true,
			xfbml : true,
			version : '{api-version}'
		});
		FB.AppEvents.logPageView();
	};

	(function(d, s, id) {
		var js, fjs = d.getElementsByTagName(s)[0];
		if (d.getElementById(id)) {
			return;
		}
		js = d.createElement(s);
		js.id = id;
		js.src = "https://connect.facebook.net/en_US/sdk.js";
		fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));


	$.get("/user", function(data) {
		$("#user").html(data.userAuthentication.details.name);
		$(".unauthenticated").hide()
		$(".authenticated").show()
	});
});

