var listController = {

	initialize : function() {
		
		
			
			
	
	$(document).off("keyup","#searchMateriel").on("keyup","#searchMateriel",function() {
		var params={};
		var fields = $(this).parents("form").serializeArray();
		jQuery.each(fields,function(i,field){
			params[field.name]=field.value;	
		});
		$.ajax({
			type : "POST",
			url : "searchMateriel",
			data : params,
			dataType : "html",
			success : function(data) {
				$("#page-wrapper").html(data);
				$("#page-wrapper").find("input[name='q']").select().setCursorPosition($("#page-wrapper").find("input[name='q']").val().length);
			},
			});
		
	});
		
	
	
	
	

	},
	

	
};

$(document).ready(function() {

	$('.footable1').footable(); 
	
	$('table').DataTable();
	 
	listController.initialize();
});