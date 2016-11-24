$(document).ready(function(){
	$("#ide").click(function(){
		$.get("otherservlet.html",{
		
		}, function(responseText, status){
			$("#output").html(responseText);
					});
	});
	
});









