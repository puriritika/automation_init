package com.bsb.hike;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;


public class Signup extends UiAutomatorTestCase {
	
	public void testingSignup() throws UiObjectNotFoundException {
		
	//new UiObject(new UiSelector().className("android.widget.ImageView").index(0)).click();	
	//new UiObject (new UiSelector().className("android.widget.Button").index(1)).clickAndWaitForNewWindow();
	//new UiObject(new UiSelector().className("android.widget.TextView").index(1)).setText("Ritika");
	new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).getChild(new UiSelector().className("android.view.View").index(0)).getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.ViewFlipper").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).getChild(new UiSelector().className("android.widget.EditText").index(0)).setText("Ritika");
	new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).getChild(new UiSelector().className("android.view.View").index(0)).getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.ViewFlipper").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).getChild(new UiSelector().className("android.widget.EditText").index(1)).setText("25");
	
	
	//new UiObject(new UiSelector().className("android.widget.TextView").index(0)).setText("25");
	//new UiObject(new UiSelector().className("android.view.View").index(0)).click();
	//android.view.View
	new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
	
	
	if(new UiObject(new UiSelector().className("android.widget.TextView").text("Tell us more")).exists())
	{
		UiObject st = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1));
		st.getChild(new UiSelector().className("android.widget.TextView").text("I am a girl").index(2)).clickAndWaitForNewWindow();
		//new UiObject(new UiSelector().className("android.widget.TextView").text("I am a girl").index(2)).click();	
		//new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).clickAndWaitForNewWindow();
		
	
}
	
	if(new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
	getChild(new UiSelector().className("android.view.View").index(0)).
	getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).exists())
	{
	
		new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(0).
		getChild(new UiSelector().className("android.view.View").index(0)).
		getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).click();	
	}
	
	
	
	//getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
	getChild(new UiSelector().className("android.widget.ViewFlipper").index(0)).
	getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
	getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).
	getChild(new UiSelector().className("android.widget.EditText").index(0)).setText("Ritika");
	//new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).getChild(new UiSelector().className("android.view.View").index(0)).getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).getChild(new UiSelector().className("android.widget.ViewFlipper").index(0)).getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).getChild(new UiSelector().className("android.widget.RelativeLayout").index(1)).getChild(new UiSelector().className("android.widget.EditText").index(1)).setText("25")
	
	
	
	
	}
	
}
