package com.bsb.hike;
import junit.framework.Assert;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;


public class ComposeNewChat extends UiAutomatorTestCase {
	
	public void testingComposeNewChat() throws UiObjectNotFoundException
	{
		getUiDevice().pressHome();
		UiObject Applications = new UiObject(
				new UiSelector().text("Apps"));
		Applications.clickAndWaitForNewWindow();
		
		
		//Assert.assertTrue("", true);
		UiObject apps = new UiObject(new UiSelector().text("hike"));
		apps.click();	
		
		// Click on compose option
		new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).
		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
		getChild(new UiSelector().className("android.widget.ImageView").index(0)).click();
		
		// Click on the texteditbox
		 new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.EditText").index(1)).click();
				
		
			//setting text
				
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.EditText").index(1)).setText("8750564839");
				
				//click on the contact in contact list.
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(2)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
				
				//android.widget.ListView
				
				
				
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.EditText").index(0)).click();
				
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(1)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");
				
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ImageButton").index(2).resourceId("com.bsb.hike:id/send_message")).click();


				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.ImageView").index(0)).
				click();


				//Click on Overflow menu->My profile
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				      click();


				//Click back
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).

				    click();


				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.ImageView").index(0)).
				click();

				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
				        click();

				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.Button").index(2)).
				        click();


				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.ImageView").index(0)).
				click();

				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(3)).click();

				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(4)).
				getChild(new UiSelector().className("android.widget.Button").index(2)).click();

				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(2)).
				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
				getChild(new UiSelector().className("android.widget.ImageView").index(0)).
				click();

				if(new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(4)).exists())
				{
				new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(4)).click();
				}


				else

				{
				getUiDevice().pressBack();
				getUiDevice().pressBack();
				}

				
		}
		
		
	}


