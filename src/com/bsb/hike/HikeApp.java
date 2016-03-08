package com.bsb.hike;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;
//import com.bsb.hike.qa.dbmanager.RedisServiceManagerUtil;

public class HikeApp extends UiAutomatorTestCase {
	

	public void testingHike() throws UiObjectNotFoundException {
			getUiDevice().pressHome();
			UiObject Applications = new UiObject(
					new UiSelector().text("Apps"));
			Applications.clickAndWaitForNewWindow();

			UiObject apps = new UiObject(new UiSelector().text("hike"));
			apps.click();	
			// com.sec.android.app.popupcalculator:id/r11
			//apps.click();
			
			
			//UiObject Application = new UiObject(
					//new UiSelector().classNameMatches("android.widget.LinearLayout"));
			//Application.click();
			UiObject txt = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/hike_messenger_img"));
				txt.click();
			UiObject txt1 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/btn_continue"));
                txt1.click();
               
                
               // UiObject addNoteText = new UiObject(new UiSelector()
                //.resourceId("com.bsb.hike:id/et_enter_num"));
                //addNoteText.setText("9999683956");
                
                new UiObject(new UiSelector().text("Phone Number")).click();
            	new UiObject(new UiSelector().className("android.widget.EditText").index(1)).setText("9999683956");
            	new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
            	// This is where I need to suppress the keyboard to view the app instead of just the keyboard itself.

            	//new UiObject(new UiSelector().resourceId("com.bsb.hike:id/done_container");
                
              UiObject addNoteText1 = new UiObject(new UiSelector()
               .className(android.widget.LinearLayout.class.getName()).index(1));
               addNoteText1.clickAndWaitForNewWindow();
               UiObject addNoteText2 = new UiObject(new UiSelector()
               .resourceId("android:id/button1"));
             
            	addNoteText2.clickAndWaitForNewWindow(); 
            	
            	

            	//android.widget.EditText
              
               //android:id/button1
              
                
}
}
