var EmployeController={
	employeID:null,
		
	initialize:function(){

		//basculer entre printer et pc page initCreateForm
		$('#dynamic_select').change(function () { // bind change event to select
			
			var url = $(this).val(); // get selected value
			
			var params={};
			 params["typeMateriel.typeMaterielID"] = $("#typeMaterielID").val();
			
			 if (url==1)	{
					$.ajax({
			        	
			            type : "POST",
			            url : "initAjouterComputer",
			            dataType : "html",
			            data : $.extend(params,
			                {_tzcm : new Date().getTime() }
			            ), 
			            success : function(data) {
			            	$("#default_formComputer").html(data);
			            }
			        });}
					else{$.ajax({
			        	
			            type : "POST",
			            url : "initAjouterImprimante",
			            dataType : "html",
			            data : $.extend(params,
			                {_tzcm : new Date().getTime() }
			            ), 
			            success : function(data) {
			            	$("#default_formComputer").html(data);
			            	
			            	 
			            }
			        });
					
					
					}

		});


		//Datepicker page  initCreateForm
	
		
		$(".datepicker").datepicker({dateFormat: 'dd/mm/yy'});

		$("textarea").keyup(function(e) {
		    while($(this).outerHeight() < this.scrollHeight + parseFloat($(this).css("borderTopWidth")) + parseFloat($(this).css("borderBottomWidth"))) {
		        $(this).height($(this).height()+1);
		    };
		});
       
    },

  
};

$(document).ready(function(){

    EmployeController.initialize();
});