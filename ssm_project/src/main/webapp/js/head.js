

//以下为AJAX实例代码跟本项目无关

//$.ajax带json数据的异步请求  
var aj = $.ajax( {    
    url:'search',// 跳转到 action    
    data:{    
             selRollBack : selRollBack,    
             selOperatorsCode : selOperatorsCode,    
             PROVINCECODE : PROVINCECODE,    
             pass2 : pass2    
    },    
    type:'post',    
    cache:false,    
    dataType:'json',    
    success:function(data) {    
        if(data.msg =="true" ){    
            // view("修改成功！");    
            alert("修改成功！");    
            window.location.reload();    
        }else{    
            view(data.msg);    
        }    
     },    
     error : function() {    
          // view("异常！");    
          alert("异常！");    
     }    
});  