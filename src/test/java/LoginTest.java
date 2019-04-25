import org.junit.Test;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    @Test
    public void 非手机号(){
        //主界面
        MainPage mainPage=MainPage.start();
        //点击登录按钮后的页面，启动后进入到ProfilePage页
        ProfilePage profilePage=mainPage.gotoProfile();
        LoginPage loginPage = profilePage.gotoLogin();
        loginPage.passwordFail("1851876089","23434567");
        //判断手机号是否正确
        assertThat(loginPage.getMessage(),equalTo("手机号码填写错误"));

    }
}
