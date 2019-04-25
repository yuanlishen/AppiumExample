////行情->板块->食品饮料->滑动到页面底部，点击最后一个
//
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.touch.offset.PointOption;
//import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebElement;
//import io.appium.java_client.AppiumDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class TestHuaDong {
//    private AppiumDriver<WebElement> driver;
//
//    @Before
//    public void before() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("deviceName","xxx");
//        capabilities.setCapability("appPackage","com.xueqiu.android");
//        capabilities.setCapability("appActivity",".view.WelcomeActivityAlias");
//        capabilities.setCapability("unicodeKeyboard","true");
//        capabilities.setCapability("resetKeyboard","true");
//        //获取权限
//        capabilities.setCapability("autoGrantPermissions","true");
//
//
//        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//        driver = new AndroidDriver(remoteUrl,capabilities);
////        driver=new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//
//    }
//
//    @Test
//    public void demo() throws InterruptedException, IOException {
//        Thread.sleep(5000);
//        //截图
//        FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("1.png"));
//        locate("//*[@text='行情']").click();
//        Thread.sleep(3000);
//        locate("//*[@text='板块']").click();
//        Thread.sleep(3000);
//        locate("//*[@text='食品饮料']").click();
//        Thread.sleep(3000);
//        //左右滑动
////        new TouchAction(driver)
////                .press(PointOption.point(600,1400))
////                .moveTo(PointOption.point(200,1400))
////                .release()
////                .perform();
////        Thread.sleep(5000);
//        //上下滑动
//        new TouchAction(driver)
//                .press(PointOption.point(600,1400))
//                .moveTo(PointOption.point(600,400))
//                .release()
//                .perform();
//        Thread.sleep(5000);
//    }
//    public WebElement locate(String locator){
//        if(locator.matches("\\/\\/.*")){
//            return driver.findElementByXPath(locator);
//        }else {
//            return driver.findElementById(locator);
//        }
//    }
//
//
//
//    @After
//    public void teardown(){
//        driver.quit();
//    }
//
//}
