package PSB.Settings;

import PSB.PageDirectory.AdminRolePage;
import PSB.PageDirectory.LoginPage;
import PSB.PageDirectory.DocCreationPage;
import PSB.PageDirectory.DocumentsPage;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    String OS = System.getProperty("os.name");
    public static LoginPage loginPage;
    public static DocumentsPage documentsPage;
    public static WebDriver driver;
    public static DocCreationPage docCreationPage;
    public static PSB.PageDirectory.AdminRolePage adminRolePage;


    @Before
    public void setup() {
        System.out.println(OS);
        //определение пути до драйвера и его настройка
        if (OS.toLowerCase().contains("win")) {
            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriverW"));
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriverU"));
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--verbose");
            driver = new ChromeDriver(options);
        }
        ;


        //создание экземпляра драйвера
        loginPage = new LoginPage(driver);
        documentsPage = new DocumentsPage(driver);
        docCreationPage = new DocCreationPage(driver);
        adminRolePage = new AdminRolePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();

    }


}