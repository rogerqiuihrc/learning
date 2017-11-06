
Ext.onReady(function() {
	Ext.QuickTips.init();
	
	Ext.regModel('PostInfo',{
		fields:[{name:'province'},{name:'post'}]		
	});
	
	Ext.regModel('User',{
		fields:[{name:'id'},{name:'userName'},{name:'birthDay'},{name:'sex'},{name:'address'}]		
	});
	
	var postStore = Ext.create('Ext.data.Store', {
	    model:'PostInfo',	   
	    data:[
		        { 'province': 'Lisa', "post":"555-111-1224"  },
		        { 'province': 'Bart', "post":"555-222-1234" },
		        { 'province': 'Homer',  "post":"555-222-1244"  }	      
	    	]	   
	});
	
	var userStore = Ext.create('Ext.data.Store', {
	    model:'User',	   
	    proxy:{
	    	type:'ajax',
	    	url:'http://localhost:8011/users/get?id=1',
	    	 reader:new Ext.data.JsonReader({  
                fields:[{name:'id'},{name:"userName"},{name:"birthDay"},{name:'sex'},{name:'address'}] }) 
	    }  
	});
	
	var frmconfig = {
		title:'Form1',
		
		frame:true,
		renderTo:'form',
		defaults:{
			labelSeparator:':',
			labelWidth:50,
			width:150,
			allowBlank:true,
			blankText:'not empty',
			labelAlign:'left',
			msgTarget:'qtip'
		},
		items:[
			{
				xtype:'textfield',
				name:'username',
				fieldLabel:'name',
				emptyText:'qiuqb',
				selectOnFocus:true,
				allowBlank:false,
				vtype:'alpha'
			},
			{
				xtype:'textfield',
				name:'password',
				fieldLabel:'password',
				inputType:'password',
				emptyText:'123456',
				selectOnFocus:true,
				allowBlank:false
			},
			{
				xtype:'radio',	
				name:'sex',
				fieldLabel:'sex',
				boxLabel:'man'
			},
			{
				xtype:'checkboxgroup',	
				name:'hobby',
				fieldLabel:'hobby',
				columns:2,
				items:[
						{boxLabel:'swim',name:'swim'},
						{boxLabel:'music',name:'music'},
				]
			},
			{
				xtype:'numberfield',
				hideTrigger:true,
				fieldLabel:'age',
				allowDecimals:false
			},
			{
				xtype:'numberfield',
				fieldLabel:'money',
				allowDecimals:true,
				decimalPrecision:2
			},
			{
				xtype:'textarea',
				name:'memo',
				fieldLabel:'memo',
				width:200
			}
			,
			{
		        xtype: 'datefield',
		        anchor: '100%',
		        fieldLabel: 'Date',
		        name: 'date',
		        // The value does not match the format, but does match an altFormat; will be parsed
		        // using the altFormat and displayed using the format.
		        format: 'm d Y',
		        altFormats: 'm,d,Y|m.d.Y',
		        value: '2.4.1978',
		        disabledDays:  [0, 6]
    		},
    		{
		        xtype: 'triggerfield',
		        fieldLabel: 'Trigger',
		        emptyText: 'click the trigger',
		        onTriggerClick:showValue		        
    		},
    		{
		        xtype: 'spinnerfield',
		        fieldLabel: 'salary',	
		        value:100,
		        id:'salary',
		        onSpinUp:function()
		        {
		        	var salcomp = Ext.getCmp('salary');
		        	salcomp.setValue(Number(salcomp.getValue())+1);
		        },
		        onSpinDown:function()
		        {
		        	var salcomp = Ext.getCmp('salary');
		        	salcomp.setValue(Number(salcomp.getValue())-1);
		        }
    		},
    		{
		        xtype: 'combo',
		        listConfig:{
		        	emptyText:'no match',
		        	maxHeight:60
		        },
		        name:'post',
		        fieldLabel:'zipCode',
		        triggerAction:'all',
		        store:postStore,
		        displayField:'province',
		        valueField:'post',
		        queryMode:'local',
		        forceSelection:true,
		        typeAhead:true,
		        value:'555-222-1244'
    		}
    		,
    		{
		        xtype: 'combo',
		        listConfig:{
		        	emptyText:'no match',
		        	maxHeight:60
		        },
		        name:'user',
		        fieldLabel:'userInfo',
		        triggerAction:'all',
		        store:userStore,
		        displayField:'userName',
		        valueField:'id',
		        queryMode:'remote',
		        forceSelection:true,
		        typeAhead:true
    		}
    		,
    		{
    			title:'productInfo',
		        xtype: 'fieldset',
		        collapsible:true,
		        bodyPadding:5,
		        defaults:{
		        	labelSeperator:':',
		        	labelWidth:50,
		        	width:160
		        },
		        defaultType:'textfield',
		        items:[
		        	{fieldLabel:'source'},
		        	{fieldLabel:'price'}
		        ]
    		},
    		{
    			title:'upload',
		        xtype: 'filefield',
		        fieldLabel:'photo',
		        anchor:'100%',
		        buttonText:'select photo ...'		        
    		}
			],
		buttons:[{
			text:'login',
			handler:showValue
			}
		]
		
	};	
	
	var frm = new Ext.form.Panel(frmconfig);	
	
	//frm.submit();
	
	function showValue()
	{
		var memo = frm.getForm().findField('memo');
		Ext.MessageBox.alert(memo.getValue());
	}
	
//	Ext.Ajax.request({
//		url:'http://localhost:8011/users/get?id=1',
//		
//		method : 'get',
//		success : function() {
//			Ext.MessageBox.alert("success");
//			
//		},
//		failure : function() {
//			Ext.MessageBox.alert("failure");
//		}
//	});
				
	
	
});

