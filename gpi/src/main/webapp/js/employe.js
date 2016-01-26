var EmployeController={
	employeID:null,
		
	initialize:function(){


        $(document).off("submit","form[action='searchEmploye']").on("submit","form[action='searchEmploye']",function(){
            var form=this;
            var fields = $(form).serializeArray();
            var params={};
            jQuery.each(fields,function(i,field){
                params[field.name]=field.value;
            });
            $.ajax({
                url : "autoCompleteUser/1",
                type : "POST",
                async : false ,
                dataType : "html",
                data : $.extend(params,
                    {_tzcm : new Date().getTime()}
                ),
                success : function(data) {
                    if (data.status !=undefined) {
                        $('#fadeInOut').load(data);
                    } else{
                        alert("error");
                    }
                    return false ;
                }
            });
            return false;
        });
        EmployeController.autoCompleteUser();
	},
    

    autoCompleteUser:function(){
        $("#searchUser").autocomplete("autoCompleteUser", {
            max : 10,
            formatItem : function(data, i, n, value) {
                var obj = jQuery.parseJSON(value);
                var result="";
                result=obj.firstName;
                return result;
            },
            formatResult : function(data, value) {
                if (value != undefined) {
                    var obj = jQuery.parseJSON(value);
                    var result="";
                    result=obj.firstName;

                    return result;
                }
            }
        }).result(function(event,data,formatted){

            if (formatted != undefined) {
                var obj = jQuery.parseJSON(formatted);
                var result="";
                $("input[name='employeID']").val(obj.id);
                return false;
            }
        });
        return false;
    },

  
};

$(document).ready(function(){

    EmployeController.initialize();
});