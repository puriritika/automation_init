android create uitest-project -n HikeApp -t 10 -p . 
ant build
adb push ./bin/HikeApp.jar /data/local/tmp/
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.HikeApp
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.Signup
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.AcctReset
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.DeleteAcct
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.ComposeNewChat	
#adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.StatusUpdates
adb shell uiautomator runtest HikeApp.jar -c com.bsb.hike.NewGroupChat



