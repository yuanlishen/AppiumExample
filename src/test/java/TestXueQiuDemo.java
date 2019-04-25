//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//import io.appium.java_client.AppiumDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class TestXueQiuDemo {
//    private AppiumDriver<WebElement> driver;
//
//    @Before
//    public void before() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("deviceName","xxx");
//        capabilities.setCapability("appPackage","com.xueqiu.android");
//        capabilities.setCapability("appActivity",".view.WelcomeActivityAlias");
//
//        driver=new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//
//    }
//
//    @Test
//    public void demo() throws InterruptedException {
//        Thread.sleep(5000);
////        locate("//*[@text='自选']").click();
//        locate("user_profile_icon").click();
//        Thread.sleep(3000);
////        locate("//*[@text='美股']").click();
//        locate("tv_login").click();
//        Thread.sleep(3000);
//        locate("tv_login_by_phone_or_others").click();
//        Thread.sleep(3000);
//        locate("tv_login_with_account").click();
//        Thread.sleep(3000);
//        locate("login_account").sendKeys("18518760789");
//        Thread.sleep(3000);
//        locate("login_password").sendKeys("123456");
//        Thread.sleep(3000);
//
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
