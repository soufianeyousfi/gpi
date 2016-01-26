var etat=0;
var etat2=0;
$(document).ready(function(){	
	
//  	$('form[action="addPropriete"]').unbind('submit').bind('click', function () { 
// 		alert("submit");
// 		return false;
 





    
    
$('#initcreate').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");

	
	var url = $(this).val(); // get selected value
		$.ajax({
			
			type : "POST",
			url : "initCreate",
			dataType : "html",
			success : function(data) {
				
				$("div.box.span12").html(data);
			}
		});
return false;
	
	
});
    
$('#listImprimante').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");

	var url = $(this).val(); // get selected value
		$.ajax({
			
			type : "POST",
			url : "listImprimante",
			dataType : "html",
			success : function(data) {
				
				$("div.box.span12").html(data);
			}
		});
return false;
	
	
});
$('#listComputer').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "listComputer",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#initAddUser').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "initAddUser",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#listUser').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "listUser",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#initAddEntreprise').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "initAddEntreprise",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#listEntreprise').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "listEntreprise",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#listGroup').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	$(this).parent("li").addClass("active");
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "listGroup",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});
$('#listArchive').bind("click",function () { // bind change event to select
	$(".span2 li").siblings().removeClass("active");
	
	$(this).parent("li").addClass("active");
	$(this).parent("li").siblings().removeClass("active");
	
	
	var url = $(this).val(); // get selected value
	$.ajax({
		
		type : "POST",
		url : "listArchive",
		dataType : "html",
		success : function(data) {
			
			$("div.box.span12").html(data);
		}
	});
	return false;
	
	
});

});
		 
$(document).off("click","a.initUpdateUser").on("click","a.initUpdateUser",function(){

	
	var url=$(this).attr("href");
	$("div.box.span12").load(url);
	return false;
});
$(document).off("click","#updateUserSubmit").on("click","#updateUserSubmit",function(){

	
	var url=$(this).attr("href");
	$("div.box.span12").load(url);
	return false;
});
	
	

	
	
		
$(document).off("click","#updateUserSubmit").on("click","#updateUserSubmit",function(){

	

	$("div.box.span12").load("updateUser");
	return false;
});
	
	

