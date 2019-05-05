package page;
//所有父类的基类，定义的是简单的方法；

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    //查找元素     find是定位符
    static WebElement find(By locator){
        //todo: 只是demo，更好的是根据弹窗列表进行批量检索
       try {
           return Driver.getCurrentDriver().findElement(locator);
       }catch(Exception e){
           e.printStackTrace();
           Driver.getCurrentDriver().findElement(text("下次再说")).click();
           return Driver.getCurrentDriver().findElement(locator);
       }
    }
    // locator 也是定位符
    static By locator(String locator){
        if(locator.matches("/.*")){
            return By.xpath(locator);
        }else {
            return By.id(locator);
        }
    }

    static By text(String content){
        return By.xpath("//*[@text='"+ content + "']");
    }
}
