package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class PythonDeveloperPage {

    SelenideElement
            sendInfoButton = $(By.xpath("//span[text()='Отправить']")),
            surnameAllert = $(By.xpath("//div[text()='Поле Фамилия не должно быть короче 2 символов']")),
            nameAllert = $(By.xpath("//div[text()='Поле Имя не должно быть короче 2 символов']")),
            emailAllert = $(By.xpath("//div[text()='Поле Email не должно быть короче 5 символов']")),
            phoneAllert = $(By.xpath("//div[text()='Поле обязательно для заполнения']"));


    public PythonDeveloperPage clickSendInfoButton() {
        sendInfoButton.scrollTo().click();
        return this;
    }

    public PythonDeveloperPage checkSurnameAllert() {
        surnameAllert.shouldBe(Condition.visible);
        return this;
    }

    public PythonDeveloperPage checkNameAllert() {
        nameAllert.shouldBe(Condition.visible);
        return this;
    }

    public PythonDeveloperPage checkEmailAllert() {
        emailAllert.shouldBe(Condition.visible);
        return this;
    }

    public PythonDeveloperPage checkPhonelAllert() {
        phoneAllert.shouldBe(Condition.visible);
        return this;
    }


}