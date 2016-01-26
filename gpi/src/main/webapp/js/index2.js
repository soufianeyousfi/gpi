/**
 * Created by MON HP on 07/05/2015.
 */
$(document).ready(function(){

    $(document).off("change","select[class='filiere']").on("change","select[class='filiere']",function(){
        var params={};
        /*var fields = $(this).serializeArray();
        jQuery.each(fields,function(i,field){
            params[field.name]=field.value;
        });*/
        params["filiereID"]=$(this).val();

        $.ajax({
            type : "POST",
            url : "getNiveauByFiliere",
            dataType : "html",
            data : $.extend(params,
                {_tzcm : new Date().getTime() }
            ),
            success : function(data) {
                alert();
                $("select[class='niveau']").html(data);
            }
        });
    });


});