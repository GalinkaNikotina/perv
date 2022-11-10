import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    private static String baseUrl = "https://idemo.bspb.ru/";
    private SelenideElement loginInput = $(By.xpath ("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath ("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath ("//button[@id='login-button']"));

    private SelenideElement codeInput = $(By.xpath ("//input[@name='otpCode']"));

    private SelenideElement codeBtn = $(By.xpath ("//button[@id='login-otp-button']"));

    private SelenideElement overviewA = $(By.xpath ("//a[@id='bank-overview']"));
    @BeforeAll
    static void beforeConfig(){
        Configuration.timeout= 3000;
        Configuration.browserSize = "1920x1000";
    }
    @BeforeEach

    public void before() {
        open(baseUrl);
    }
    @Test
    public void test(){
        System.out.println();
        loginInput.should(Condition.visible).val("demo");
        passwordInput.should(Condition.visible).val("demo");
        loginBtn.should(Condition.visible).click();
        codeInput.should(Condition.visible).val("0000");
        codeBtn.should(Condition.visible).click();
        sleep(1000000000);



    }
    @AfterEach
    public void after(){

    }



}
