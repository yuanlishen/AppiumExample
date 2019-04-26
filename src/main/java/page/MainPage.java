package page;

import driver.Driver;
import org.openqa.selenium.By;

public class MainPage extends BasePage{
    By profile= By.id("user_profile_icon");

    public static MainPage start(){
        Driver.start();
        return new MainPage();
    }
    //点击首页的头像
    public ProfilePage gotoProfile(){
        Driver.getCurrentDriver().findElement(profile).click();
        //点击后进入到个另外一个页面；
        return new ProfilePage();
    }
    public SearchPage gotoSearch(){
        find(By.id("home_search")).click();
        return new SearchPage();
    }
}
