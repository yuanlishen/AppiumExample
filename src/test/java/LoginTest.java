import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    static MainPage mainPage;
    static ProfilePage profilePage;

    //所有参数运行之前去执行
    @BeforeAll
    static void beforeAll(){
        mainPage=MainPage.start();
        //进入个人页
        profilePage=mainPage.gotoProfile();

    }


    @ParameterizedTest
    @CsvSource({
            "18581760789,xxxxxx,用户名或密码错误",
            "1858176078,xxxxxx,手机号码填写错误"

    })
    void PasswordLogin(String username,String password, String expection){
        //主界面
//        MainPage mainPage=MainPage.start();
        //点击登录按钮后的页面，启动后进入到ProfilePage页profilePage=mainPage.gotoProfile();
//        ProfilePage profilePage=mainPage.gotoProfile();
        //进入登录页
        LoginPage loginPage = profilePage.gotoLogin();
        //输入用户名密码
        loginPage.passwordFail(username,password);
        //判断手机号是否正确
        assertThat(loginPage.getMessage(),equalTo(expection));
        //重新回到个人页
        profilePage=loginPage.gotoProfilePage();

    }
}
