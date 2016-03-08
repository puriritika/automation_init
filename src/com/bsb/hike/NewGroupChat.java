package com.bsb.hike;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class NewGroupChat extends UiAutomatorTestCase {

	public void testGroupChat() throws UiObjectNotFoundException
	{
		getUiDevice().pressHome();
		UiObject apps = new UiObject(new UiSelector().text("hike"));
		UiObject apps1 = new UiObject(new UiSelector().className("android.widget.FrameLayout"));
		
		apps.click();
	
		
		
		
		
	}
	
}
		/*
		Applications.clickAndWaitForNewWindow();
		
		
		//Assert.assertTrue("", true);
		UiObject apps = new UiObject(new UiSelector().text("hike"));
		apps.click();	
		
		
		new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).
		getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).
		getChild(new UiSelector().className("android.widget.ImageView").index(0)).
		click();	
		
		new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
		getChild(new UiSelector().className("android.widget.ListView").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).click();
		
		
	}*/

