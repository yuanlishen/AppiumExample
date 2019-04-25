import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {
    @ParameterizedTest
    @CsvSource({
            "18581760789,xxxxxx,用户名或密码错误",
            "1858176078,xxxxxx,手机号码填写错误"

    })
    public void PasswordLogin(String username,String password, String expection){
        //主界面
        MainPage mainPage=MainPage.start();
        //点击登录按钮后的页面，启动后进入到ProfilePage页
        ProfilePage profilePage=mainPage.gotoProfile();
        LoginPage loginPage = profilePage.gotoLogin();
        loginPage.passwordFail(username,password);
        //判断手机号是否正确
        assertThat(loginPage.getMessage(),equalTo(expection));

    }
}
