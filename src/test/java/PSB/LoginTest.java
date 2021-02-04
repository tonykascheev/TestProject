package PSB;


import org.junit.Assert;
import org.junit.Test;


public class LoginTest extends WebDriverSettings {


    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        System.out.println("ntcn 1");
        loginPage.onPage();
        //вводим логин
        System.out.println("test 2");
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //получаем отображаемый логин
        String user = documentsPage.getUserName();
        //и сравниваем его с логином из файла настроек
        Assert.assertEquals(ConfProperties.getProperty("user"), user);
        System.out.println(ConfProperties.getProperty("user"));
        System.out.println(user);
    }


}
