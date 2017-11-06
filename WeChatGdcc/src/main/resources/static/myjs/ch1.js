
Ext.onReady(function() {
     
     
//	  Ext.MessageBox.confirm('tips','click me', 
//	  		function(id) 
//	  		{ 
//	  			alert('finished = '+ id);
//	  		} );
	  		
//	  Ext.MessageBox.prompt('tips2','please input:', 
//	  		function(id,msg) 
//	  		{ 
//	  			alert('finished = '+ id + " input = " + msg);
//	  		} ,
//	  		this,true,'i am default');
	  		
//	   Ext.MessageBox.wait('tips2','please input:', 
//	   						{
//	   							text:'progressing'} );
//	 
//		var config = {
//			title:'title',
//			msg:'dynamic text',
//			buttons:Ext.Msg.OK,
//			modal:true,
//			fn:function(){
//				Ext.TaskManager.stop(task);
//			}			
//		};  
//		
//		var msgBox = Ext.MessageBox.show(config);
//		
		var pb= new Ext.ProgressBar({
			title:'title',
			width:300,
			renderTo:'progressBar'			
		});
  		var count = 0;
		var per = 0;
		var perText = '';
		var task={
			run:function(){
				count++;
				if(count > 10)
				{
					pb.hide();
				}
				per = count / 10;
				perText =  per*100 + '%';
				//alert(perText);
				pb.updateProgress(per,perText,true);
			},
			interval:1000,
			repeat:10
		};
		Ext.TaskManager.start(task);

	
  		
});

