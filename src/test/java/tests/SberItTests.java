package tests;

import com.codeborne.selenide.CollectionCondition;
import helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.PythonDeveloperPage;
import pages.StartPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class SberItTests extends TestBase{

    StartPage startPage = new StartPage();
    PythonDeveloperPage pythonDeveloperPage = new PythonDeveloperPage();

    @Test
    @DisplayName("Проверка банера главной страницы")
    void checkBannerTest() {
        step("Открываем сайт https://developers.sber.ru/kak-v-sbere", () -> {
            open("https://developers.sber.ru/kak-v-sbere");
        });

        step("check banner", () -> {
            $("[data-testid='logo']").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Проверка текста раздела 'Эксперт Greenplum'")
    void checkGreenplumPage() {
        step("Открываем сайт https://developers.sber.ru/kak-v-sbere", () -> {
            open("https://developers.sber.ru/kak-v-sbere");
        });

        step("Нажимаем банер 'Эксперт Greenplum'", () -> {
            $("[href='/kak-v-sbere/vacancies/greenplum-expert']").click();
        });

        step("Проверяем отображение страницы 'Эксперт Greenplum' и проверяем текст", () -> {
            $("[class='plasma-b2c__sc-1o1f9t2-1 sc-hHEiqL TechnoBrandVacancyHeader__StyledDescription-sc-1adj6ed-3 DZavf bvvfTL fgOQrl']")
                    .shouldHave(text("Стань частью команды для разработки продукта, построенного на базе СУБД Greenplum"));
        });
    }

    @Test
    @DisplayName("PageObj Проверка предупреждений при отправке контактов для Python разработчиков")
    void pythonAllertPageCheck() {
        open("https://developers.sber.ru/kak-v-sbere");
        startPage.openPythonDeveloperPage();
        pythonDeveloperPage.clickSendInfoButton().checkEmailAllert().checkNameAllert().checkPhonelAllert().checkSurnameAllert();
    }

    @Test
    @DisplayName("Проверка раздела 'Команды'")
    void checkCommandPage() {
        step("Открываем сайт https://developers.sber.ru/kak-v-sbere", () -> {
            open("https://developers.sber.ru/kak-v-sbere");
        });

        step("Заходим в раздел 'Команды'", () -> {
            $(By.xpath("//a[@href='/kak-v-sbere/teams']/span")).click();
        });

        step("Проверка отображения страницы 'Команды'", () -> {
            $$(".sc-eCApnc.TechnoBrandTeamsCard__StyledTitle-sc-1ozryyp-2.btdoiY.bWnXfF").shouldHave(CollectionCondition.size(7));
            $(".slug__StyledTitleWrapper-sc-1f7qj0w-4.cRheXq").shouldHave(text("Наши команды В которых ты можешь работать"));
        });

        step("Проверка отображения команды 'SberDevices'", () -> {
            $(By.xpath("//h3[text()='SberDevices']")).shouldBe(visible);
            $(By.xpath("//h3[text()='SberDevices']/following-sibling::span")).shouldHave(text("Умные устройства и виртуальные ассистенты"));
        });

        step("Проверка отображения команды 'Platform V'", () -> {
            $(By.xpath("//h3[text()='Platform V']")).shouldBe(visible);
            $(By.xpath("//h3[text()='Platform V']/following-sibling::span")).shouldHave(text("Облачные инструменты и технологии для создания приложений"));
        });

        step("Проверка отображения команды 'Лаборатории'", () -> {
            $(By.xpath("//h3[text()='Лаборатории']")).shouldBe(visible);
            $(By.xpath("//h3[text()='Лаборатории']/following-sibling::span")).shouldHave(text("Развиваем науку и создаём инновации"));
        });

        step("Проверка отображения команды 'СберБанк Онлайн'", () -> {
            $(By.xpath("//h3[text()='СберБанк Онлайн']")).shouldBe(visible);
            $(By.xpath("//h3[text()='СберБанк Онлайн']/following-sibling::span")).shouldHave(text("Самый большой онлайн-банк страны"));
        });

        step("Проверка отображения команды 'Персональное финансовое планирование'", () -> {
            $(By.xpath("//h3[text()='Персональное финансовое планирование']")).shouldBe(visible);
            $(By.xpath("//h3[text()='Персональное финансовое планирование']/following-sibling::span")).shouldHave(text("Помогаем клиентам управлять деньгами"));
        });

        step("Проверка отображения команды 'SberData'", () -> {
            $(By.xpath("//h3[text()='SberData']")).shouldBe(visible);
            $(By.xpath("//h3[text()='SberData']/following-sibling::span")).shouldHave(text("Создаём хранилище данных для всего Сбера"));
        });

        step("Проверка отображения команды 'SberInfra'", () -> {
            $(By.xpath("//h3[text()='SberInfra']")).shouldBe(visible);
            $(By.xpath("//h3[text()='SberInfra']/following-sibling::span")).shouldHave(text("Развиваем современную облачную платформу Сбера"));
        });
    }

    @Test
    @DisplayName("Проверка раздела 'ДНК инженера' ")
    void checkDNKEngineerPage() {
        step("Открываем сайт https://developers.sber.ru/kak-v-sbere", () -> {
            open("https://developers.sber.ru/kak-v-sbere");
        });

        step("Заходим в раздел 'ДНК инженера'", () -> {
            $(By.xpath("//a[@href='/kak-v-sbere/engineer-dna']/span")).click();
        });

        step("Проверяем отображение текста в разделе 'ДНК инженера'", () -> {
            $$(".plasma-b2c__sc-1o1f9t2-1.sc-hHEiqL.Mdx__TextM-sc-1acuavt-7.DZavf.bvvfTL.iupCWW").get(0).shouldHave(text("В наших командах мы создаём атмосферу конструкторского бюро, где поддерживаем дух творчества и изобретательства. Мы не нанимаем тех, кто «просто пишет код». Мы не нанимаем тех, кто считает, что достаточно просто приходить в офис и делать то, что сказали. Больше всего мы ценим в людях интерес к своему делу, даже больше, чем интерес — страсть! Мы хотим, чтобы вы были влюблены в то, что делаете. Любая, даже самая крошечная деталь в наших продуктах должна вызывать у клиента реакцию WOW, а у вас чувство гордости! Потому что нам не все равно. Потому что нам по-настоящему интересно то, что мы делаем. И мы нанимаем только тех, кому так же интересно."));
        });
    }

    @Test
    @DisplayName("Проверка раздела 'Почему мы'")
    void checkWhyUsPage() {
        step("Открываем сайт https://developers.sber.ru/kak-v-sbere", () -> {
            open("https://developers.sber.ru/kak-v-sbere");
        });

        step("Заходим в раздел 'Почему мы'", () -> {
            $(By.xpath("//a[@href='/kak-v-sbere/why-us']/span")).click();
        });

        step("Проверяем текст раздела 'Почему мы'", () -> {
            $$(".sc-dlnjwi.Mdx__H1-sc-1acuavt-1.jFMDsI.laMLBM").get(0).shouldHave(text("Удобный график и скидки на ипотеку"));
        });
    }

}
