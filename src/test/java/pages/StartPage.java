package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class StartPage {

    SelenideElement
            pythonDeveloperPage = $(By.xpath("//div[text()='Python-разработчик']"));

    public StartPage openPythonDeveloperPage() {
        pythonDeveloperPage.click();
        return this;
    }

}
