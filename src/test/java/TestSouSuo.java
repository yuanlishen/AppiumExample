////搜索->输入小米->点击股票类型->点击小米股票
//
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
//public class TestSouSuo {
//    private AppiumDriver<WebElement> driver;
//
//    @Before
//        public void before() throws MalformedURLException {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("platformName","Android");
//            capabilities.setCapability("deviceName","xxx");
//            capabilities.setCapability("appPackage","com.xueqiu.android");
//            capabilities.setCapability("appActivity",".view.WelcomeActivityAlias");
//            capabilities.setCapability("unicodeKeyboard","true");
//            capabilities.setCapability("resetKeyboard","true");
//
//            driver=new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
//
//    }
//
//    @Test
//    public void demo() throws InterruptedException, IOException {
//        Thread.sleep(5000);
//        //截图
//        FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("1.png"));
//        locate("tv_search").click();
//
//        Thread.sleep(3000);
//        locate("search_input_text").sendKeys("小米");
//
//        Thread.sleep(3000);
//        locate("//android.widget.TextView[@text='股票']").click();
//
//        Thread.sleep(3000);
//        locate("//android.widget.TextView[@text='小米集团-W']").click();
//
//
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
