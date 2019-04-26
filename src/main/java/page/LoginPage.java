package page;

import driver.Driver;
import org.openqa.selenium.By;
//登录页
public class LoginPage extends BasePage{
//    By other=By.xpath("//*[@text='手机及其他登录']");
//    By passwordLogin=By.xpath("//*[@text='邮箱手机号密码登录']");
    By other=text("手机及其他登录");
    By passwordLogin=text("邮箱手机号密码登录");
    By username=By.id("login_account");
    By password=By.xpath("//*[@password='true']");
    By login=By.id("button_next");
    By msg=By.id("md_content");

    String message;


    public LoginPage passwordFail(String username, String password){
//      Driver.getCurrentDriver().findElement(other).click();
//      Driver.getCurrentDriver().findElement(passwordLogin).click();
//      Driver.getCurrentDriver().findElement(this.username).sendKeys(username);
//      Driver.getCurrentDriver().findElement(this.password).sendKeys(password);
//      Driver.getCurrentDriver().findElement(login).click();
        find(other).click();
        find(passwordLogin).click();
        find(this.username).sendKeys(username);
        find(this.password).sendKeys(password);
        find(login).click();
        message = find(msg).getText();
        find((By.id("md_buttonDefaultPositive"))).click();
        return this;
    }
    public String getMessage(){
        return message;
    }

    public ProfilePage gotoProfilePage(){
//        find(By.id("iv_close")).click();
//            find(By.id("iv_action_back")).click();
            find(By.xpath("//*[contains(@resource-id,'iv_close') or contains(@resource-id,'iv_action_back')]")).click();
        return new ProfilePage();

    }
}
