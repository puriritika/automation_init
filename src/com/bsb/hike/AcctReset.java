package com.bsb.hike;
import com.android.uiautomator.core.UiObject;
//android.support.test.uiautomator.UiObject;
//android.support.test.uiautomator.UiSelector;

import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;

public class AcctReset extends UiAutomatorTestCase{

	public void testAcctReset() throws UiObjectNotFoundException{
	
	
	
		UiObject su = new UiObject(new UiSelector().className("android.widget.LinearLayout"));
		su.getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
		
		//android.widget.LinearLayout
		UiObject st = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4));
		st.getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.TextView").text("Settings")).click();
		
		UiObject sy = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0));
		if (sy.exists())
		{
			new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4)).click();
		}
		
		UiObject s = new UiObject(new UiSelector().className("android.view.View").index(0));
		if (s.exists())
		{
			UiObject g = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(1));
			UiObject t = g.getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.ListView").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout").index(0));
		    t.clickAndWaitForNewWindow();
		    
		    
		}
		
		UiObject g = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).getChild(new UiSelector().className("android.widget.FrameLayout")).getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout")).getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.TextView").text("Account Backup"));
		//new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
		
	new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.ListView")).getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
	 UiObject j = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0));
	 if(j.exists())
	 {
		 j.getChild(new UiSelector().className("android.widget.LinearLayout").index(4)).getChild(new UiSelector().className("android.widget.Button").index(2)).click();
	 }
	
	 
	}
		//new UiObject(new Ui	Selector().className("android.widget.TextView")).click();
		//UiObject st = new UiObject(new UiSelector().className("android.widget.FrameLayout"));
		//if(st.getChild(new UiSelector().className("android.widget.LinearLayout")).getChild(new UiSelector().className("android.widget.TextView").text("Settings")).exists())
		//{
			//UiObject sj = st.getChild(new UiSelector().className("android.widget.LinearLayout")).getChild(new UiSelector().className("android.widget.TextView").text("Settings"));
		    //android.widget.LinearLayout
			//UiObject sj = 	new UiObject(new UiSelector().className("android.widget.LinearLayout"));
			//sj.click();
		//}
		//android.widget.TextView
	}

