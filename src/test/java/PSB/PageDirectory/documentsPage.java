package PSB.PageDirectory;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class documentsPage {
    public WebDriver driver;

    public documentsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//body/div[@id='app']/section[1]/nav[1]/section[1]/section[1]/span[1]")
    private WebElement userMenu;

    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "//h5[contains(text(),'Электронное досье')]")
    private WebElement Title;
    @FindBy(xpath = "//span[contains(text(),'Выйти')]")
    private WebElement logoutBtn;
    @FindBy(xpath = "//button[contains(text(),'Документ')]")
    private WebElement documentBtn;
    @FindBy(xpath = "//span[contains(text(),'Администрирование')]")
    private WebElement adminTab;
    @FindBy(xpath = "//span[contains(text(),'Документы')]")
    private WebElement documentsTab;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/nav[1]/section[1]/section[1]/*[2]")
    private WebElement systemMenu;

    /**
     * метод для получения имени пользователя из меню пользователя
     */
    @Step("Выбран раздел администрирование")
    public void setAdminTab() {
        adminTab.click();
    }

    public void onPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(Title));
        assertEquals(Title.getText(), "Электронное досье");
    }


    public String getUserName() {
        onPage();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/section[1]/nav[1]/section[1]/section[1]/span[1]")));
        String userName = userMenu.getText();
        return userName;
    }

    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        systemMenu.click();
    }

    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click();
    }

    public void newDoc() {
        documentBtn.click();

    }
}


