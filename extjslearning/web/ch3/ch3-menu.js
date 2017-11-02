
Ext.onReady(function() {
	
	var tbconfig = {
		renderTo:'toolbar',
		width:500
	};  
	
	var fmenu = new Ext.menu.Menu({
		shadow:'frame',
		allowOtherMenus:true,
		items:[
			
			{
				text:'open',				
				handler:onButtClick				
			}		
		]
		
	});

	var tb = new Ext.toolbar.Toolbar(tbconfig);	
	tb.add([
		{
			text:'new',
			id:'new',
			handler:onButtClick,
			iconCls:'newIcon'
		},
		'-',
		{
			text:'open',
			id:'open',
			handler:onButtClick,
			iconCls:'openIcon'
		},
		'-',
		{
			text:'save',
			id:'save',
			handler:onButtClick,
			iconCls:'saveIcon'
		},
		{
			text:'toggle',
			id:'toggle',
			handler:onToogleSave,
			iconCls:'saveIcon'
		},
		'-',
		{
			xtype:'textfield',
			hideLabel:true,
			width:150
		},		
		'<a href="http://news.sina.com.cn/">sina</a>',
		{
			text:'file',menu:fmenu
		}
		
	]);
	var btn = new Ext.button.Button({
		text:'toggle',
		renderTo:'btn',
		handler: onToogleSave
	});
	
	
	
	var enable = true;
	function onToogleSave(btn)
	{
		if(enable)
		{
			tb.disable();
		}
		else
		{
			tb.enable();
		}
		enable = !enable;
	}
	
	function onButtClick(btn)
	{
		Ext.MessageBox.alert(btn.id);
	}
  		
});

