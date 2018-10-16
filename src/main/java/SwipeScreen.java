import java.time.Duration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class SwipeScreen {

    public static void swipeUp(AppiumDriver driver) {

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action = new TouchAction(driver).press(PointOption.point(width / 2, height * 4 / 5)).
                moveTo(PointOption.point(width / 2, height / 4)).release();
        action.perform();
    }

    public static void swipeDown(AppiumDriver driver) {

        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action = new TouchAction(driver).press(PointOption.point(width / 2, height / 4))
                .moveTo(PointOption.point(width / 2, height * 3 / 4)).release();
        action.perform();
    }

    public static void swipeLeft(AppiumDriver driver) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action = new TouchAction(driver).press(PointOption.point(width * 3 / 4, height / 2))
                .moveTo(PointOption.point(width / 4, height / 2)).release();
        action.perform();
    }

    public static void swipeRight(AppiumDriver driver) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        TouchAction action = new TouchAction(driver).press(PointOption.point(10, height / 2))
                .moveTo(PointOption.point(width * 3 / 4 + 10, height / 2)).release();
        action.perform();
    }


    public static void tochButton(AppiumDriver driver){
        (new TouchAction(driver)).press(PointOption.point(152, 709))
                .moveTo(PointOption.point(169,706)).release().perform();
    }



}
