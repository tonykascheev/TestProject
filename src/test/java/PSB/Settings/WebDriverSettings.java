package PSB.Settings;

import PSB.PageDirectory.AdminRolePage;
import PSB.PageDirectory.LoginPage;
import PSB.PageDirectory.docCreationPage;
import PSB.PageDirectory.documentsPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    String OS = System.getProperty("os.name");
    public static LoginPage loginPage;
    public static PSB.PageDirectory.documentsPage documentsPage;
    public static WebDriver driver;
    public static PSB.PageDirectory.docCreationPage docCreationPage;
    public static PSB.PageDirectory.AdminRolePage adminRolePage;

    @Before
    public void setup() {
        System.out.println(OS);
        //определение пути до драйвера и его настройка
        if (OS.toLowerCase().contains("win")) {System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriverW"));}
        else {System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriverU")); };

        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        documentsPage = new documentsPage(driver);
        docCreationPage = new docCreationPage(driver);
        adminRolePage = new AdminRolePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

   /* @AfterClass
    public static void tearDown() {
        documentsPage.entryMenu();
        documentsPage.userLogout();
        driver.quit();
    }*/


}
