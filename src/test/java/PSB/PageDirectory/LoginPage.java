package PSB.PageDirectory;

import PSB.Settings.ConfProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//body/div[@id='app']/div[1]/section[1]/form[1]/input[1]")
    private WebElement loginField;
    @FindBy(xpath = "//h5[contains(text(),'Вход в систему')]")
    private WebElement loginHeader;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//button[contains(text(),'Войти')]")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//body/div[@id='app']/div[1]/section[1]/form[1]/input[2]")
    private WebElement passwdField;

    public void onPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(loginHeader));
        assertEquals(loginHeader.getText(), "Вход в систему");
    }

    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click();
    }
    public void Auth () {
      inputLogin(ConfProperties.getProperty("login"));
      inputPasswd(ConfProperties.getProperty("password"));
      clickLoginBtn();
    };
}

