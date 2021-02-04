package PSB;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public static LoginPage loginPage;
    public static DocumentsPage documentsPage;
    public static WebDriver driver;
    public static DocCreationPage docCreationPage;

    @Before
    public void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        documentsPage = new DocumentsPage(driver);
        docCreationPage = new DocCreationPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterClass
    public static void tearDown() {
        documentsPage.entryMenu();
        documentsPage.userLogout();
        driver.quit();
    }


}
