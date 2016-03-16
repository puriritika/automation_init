package com.hike.test; 

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;



import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;

public class NewGroupChat extends UiAutomatorTestCase

{

	public void testAutomation() throws UiObjectNotFoundException

	{
	
		try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//mdevice.setOrientationNatural();
		
		// for accessing the 3 dot menu
		if(new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
		        getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
		        getChild(new UiSelector().className("android.view.View").index(0)).
		        getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
		        getChild(new UiSelector().className("android.widget.RelativeLayout")).exists())
		{
	new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
	        getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
	        getChild(new UiSelector().className("android.view.View").index(0)).
	        getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
	        getChild(new UiSelector().className("android.widget.RelativeLayout").index(3)).click();
		}
		
		
		
		else
		{
			System.out.println("Wrong input");
		}

	}
	
	
	//New group chat element click
	public void testElementClick() throws UiObjectNotFoundException
	
	{
		UiObject rs = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
		getChild(new UiSelector().className("android.widget.ListView").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(1));
		
		if(rs.exists())
		{
			rs.click();
		}
		else
		{
			System.out.println("Incorect input");
		}
		
	}
	
	//Group chat creation screen
	
public void testNameEnter() throws UiObjectNotFoundException, InterruptedException
	
	{
	    System.out.println("setting group name");
		
	   
		
	    new UiObject(new UiSelector().text("Name the group")).setText("Test");
	    
	    /*UiDevice ut = UiDevice.getInstance();
	    ut.pressBack();*/
	   
	    
	    
	    Thread.sleep(3000);
		
		UiObject next = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(1)).
        getChild(new UiSelector().resourceId("com.bsb.hike:id/done_container").index(1));
	
	if(next.exists())
	{
	System.out.println("click on next");
	next.click();	
	}
	
	else
	{
	System.out.println("Incorect input");
	}
	
	Thread.sleep(10000);
	}
		
		
	
	
	public void testPMemberAddition() throws UiObjectNotFoundException
	{
		
		
		
		UiObject st = new UiObject(new UiSelector().className("android.widget.CheckBox").instance(0));
		
		
		if(!st.isChecked())
		{
			
		st.click();
		}
		
		
		else
		{
			System.out.println("Wrong input");
		}
		
		
		 new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.CheckBox").index(0)).click();
		 
		 System.out.println("Second user entered");
		
	
		
		
	}
	
	public void testQDoneButtonClick() throws UiObjectNotFoundException
	
	{
		
		
		
		UiObject rs = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
        getChild(new UiSelector().className("android.widget.LinearLayout").index(2));
		
		
		if(rs.exists())
		{
			System.out.println("Button Click");
			rs.click();
		}
		
		
		
		System.out.println("Success");
		
	}
	
	
	
	/*public void sanjitCLick() throws UiObjectNotFoundException, InterruptedException{
		Thread.sleep(3000);
		new UiObject(new UiSelector().className("android.widget.TextView").text("Done")).click();
		
		System.out.println("sanjit");
	}*/
	
//	public void testRTextEnter() throws UiObjectNotFoundException
//	
//	{
//		new UiObject(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");	
	/*
	new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
	getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
	getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
	getChild(new UiSelector().className("android.view.View").index(0)).
	getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
	getChild(new UiSelector().className("android.view.View").index(0)).
	getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
	getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).click();
	new UiObject(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");	*/
//		
//	}	
	
	
}
	
	

	
	

	
	


