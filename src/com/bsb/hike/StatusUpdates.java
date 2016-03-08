package com.bsb.hike;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;
//import com.bsb.hike.qa.dbmanager.RedisServiceManagerUtil;

public class StatusUpdates extends UiAutomatorTestCase {
	

	public void testingStatus() throws UiObjectNotFoundException {
			getUiDevice().pressHome();
			UiObject Applications = new UiObject(
					new UiSelector().text("Apps"));
			Applications.clickAndWaitForNewWindow();

			UiObject apps = new UiObject(new UiSelector().index(23).text("hike"));
			apps.click();	
			//click on overflow menu
			new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.ListView").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
			
			//click on the timeline
			
			//android.widget.FrameLayout
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).getChild(new UiSelector().className("android.widget.TextView").index(0)).click();
			
			//click on the post status button
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(1)).
			getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
		
			//new UiObject(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
	
			//select the status
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
			getChild(new UiSelector().className("android.widget.GridView").index(0)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
			
			//click on post
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).click();
			
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
			getChild(new UiSelector().className("android.widget.TextView").index(0)).click();
			
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).getChild(new UiSelector().className("android.widget.Button").index(0)).click();
			
			
			
			
			
			
			//com.bsb.hike:id/avatar
			//android.widget.RelativeLayout
			//android.widget.TextView
			
			//android.widget.TextView
			//getChild(new UiSelector().className("android.widget.TextView").index(0)).click();
			
			//android.view.View
			
	//android.widget.FrameLayout
	
	
	}
	
}