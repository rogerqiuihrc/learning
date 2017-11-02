
Ext.onReady(function() {
	
	var tbconfig = {
		renderTo:'toolbar',
		width:500
	};   

	var tb = new Ext.toolbar.Toolbar(tbconfig);	
	tb.add([
		{
			text:'new',
			handler:onButtClick,
			iconCls:'newIcon'
		},
		'-',
		{
			text:'open',
			handler:onButtClick,
			iconCls:'openIcon'
		},
		'-',
		{
			text:'save',
			handler:onButtClick,
			iconCls:'saveIcon'
		},
		'-',
		{
			xtype:'textfield',
			hideLabel:true,
			width:150
		}
	]);
	
	function onButtClick(btn)
	{
		Ext.MessageBox.alert(btn.text);
	}
  		
});

