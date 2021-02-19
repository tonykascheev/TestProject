package PSB.TestDirectory;


import PSB.Settings.ConfProperties;
import PSB.Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;


public class FailLoginTest extends WebDriverSettings {


    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        loginPage.onPage();
        //вводим логин
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //вводим пароль
        loginPage.inputPasswd("IncorrectPassword");
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //Проверяем сообщение
        loginPage.CheckNotifMessage();
    }


}
