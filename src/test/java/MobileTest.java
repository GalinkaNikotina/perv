import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MobileTest {


    private static String baseUrl = "https://idemo.bspb.ru/vendors/unified-phone-payment";

    private SelenideElement dataInput = $(By.xpath ("//input[@name='payment.time']"));

    private SelenideElement numberInput = $(By.xpath ("//input[@name='phoneNumber']"));

    private SelenideElement operatorInput = $(By.xpath ("//input[@id='mobile-operator']"));

    private SelenideElement moneyInput = $(By.xpath ("//input[@name='payment.amount']"));

    private SelenideElement commentInput = $(By.xpath ("//input[@name='payment.comment']"));

    private SelenideElement avtoBtn = $(By.xpath ("//button[@id='show-suggest-subscription']"));

    private SelenideElement komInput = $(By.xpath("//input[@id='free-amount']"));


    @BeforeAll
    static void beforeConfig(){
        Configuration.timeout= 9999000;
        Configuration.browserSize = "1920x1000";
    }
    @BeforeEach

    public void before() {
        open(baseUrl);
    }
    @Test
    public void test(){
        System.out.println();
        dataInput.should(Condition.visible).val("12.11.2022");
        numberInput.should(Condition.visible).val("+7(911)111-11-11");
        operatorInput.should(Condition.visible).click();
        moneyInput.should(Condition.visible).val("150.00");
        commentInput.should(Condition.visible).val("Перевод");
        avtoBtn.should(Condition.visible).click();
        komInput.should(Condition.visible).val();



        sleep(1000000000);



    }
    @AfterEach
    public void after(){

    }



}
