
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class AppiumDemo {

    private  static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot,"app");
        File app = new File(appDir,"yiqizhangda.apk");

        if (!app.exists()){
            System.out.println("找不到apk");
        }else{
            System.out.println("找到了apk！！！");
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.yiqizhangda.parent.test");
        capabilities.setCapability("appActivity","com.kid17.parent.ui.splash.SplashActivity" );
        capabilities.setCapability("appWaitActivity","com.kid17.parent.ui.splash.SplashActivity" );
        AppiumDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Thread.sleep(5000);

       /* //new TouchAction(driver).tap(415, 621).perform();
        new TouchAction(driver).press(PointOption.point(765, 573)).moveTo(PointOption.point(3, 613)).release().perform();
        Thread.sleep(1000);
        new TouchAction(driver).press(PointOption.point(765, 573)).moveTo(PointOption.point(8, 573)).release().perform();
        Thread.sleep(1000);
        new TouchAction(driver).press(PointOption.point(765, 573)).moveTo(PointOption.point(8, 562)).release().perform();
        Thread.sleep(1000);*/

        for (int i=0;i<5;i++){
            SwipeScreen.swipeLeft(driver);
        }
        new TouchAction(driver).tap(PointOption.point(392, 980)).perform();

        Thread.sleep(5000);

        driver.findElementById("com.yiqizhangda.parent.test:id/et_phone_activity_login").sendKeys("15900796431");
        driver.findElementById("com.yiqizhangda.parent.test:id/btn_nextstep_activity_login").click();
        Thread.sleep(3000);
        driver.findElementById("com.yiqizhangda.parent.test:id/et_pwd_activity_input_pwd").sendKeys("123123");
        driver.findElementById("com.yiqizhangda.parent.test:id/btn_next_step_activity_input_pwd").click();





        Thread.sleep(3000);


        driver.quit();

    }

}