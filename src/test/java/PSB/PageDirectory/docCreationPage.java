package PSB.PageDirectory;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class docCreationPage {
    public WebDriver driver;
    public static WebElement[] x;

    public docCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h5[contains(text(),'Добавление документа')]")
    private WebElement Title;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[1]/section[1]/section[1]/section[1]/section[1]/input[1]")
    private WebElement GKField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[2]/section[1]/section[1]/section[1]/input[1]")
    private WebElement ULField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[3]/section[1]/section[1]/div[1]/input[1]")
    private WebElement INNField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[4]/section[1]/section[1]/section[1]/input[1]")
    private WebElement RazdelDField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[5]/section[1]/section[1]/section[1]/input[1]")
    private WebElement FormDocField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[7]/section[1]/section[1]/div[1]/input[1]")
    private WebElement CatalogField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[8]/section[1]/section[1]/section[1]/section[1]/input[1]")
    private WebElement ShortTitle;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[9]/section[1]/section[1]/section[1]/input[1]")
    private WebElement FullTitle;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[1]")
    private WebElement ClassifGSGO;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[2]")
    private WebElement ClassifGSReg;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[3]")
    private WebElement ClassifOPKGO;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[4]")
    private WebElement ClassifOPKReg;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[2]/section[1]/div[1]/input[1]")
    private WebElement Attachment;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[1]/div[1]/input[1]")
    private WebElement Name;
    @FindBy(xpath = "//span[contains(text(),'Документ ЮЛ')]")
    private WebElement DocUL;
    @FindBy(xpath = "//span[contains(text(),'Документ ГК')]")
    private WebElement DocGK;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[5]/section[1]/section[1]/section[1]/input[1]")
    private WebElement Year;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[6]/section[1]/section[1]/input[1]")
    private WebElement Quarta;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[6]/section[1]/section[1]/input[1]")
    private WebElement Status;
    @FindBy(xpath = "//span[contains(text(),'Документ Клиента')]")
    private WebElement DocClient;
    @FindBy(xpath = "//span[contains(text(),'Документ Банка')]")
    private WebElement DocBank;
    @FindBy(xpath = "//span[contains(text(),'Активно')]")
    private WebElement NotificationYes;
    @FindBy(xpath = "//span[contains(text(),'Неактивно')]")
    private WebElement NotificationNo;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[8]/section[1]/input[1]")
    private WebElement Date;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[9]/section[1]/input[1]")
    private WebElement ExpirationDate;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[10]/label[1]")
    private WebElement VerificationYes;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[10]/label[2]")
    private WebElement VerificationNo;
    @FindBy(xpath = "//button[contains(text(),'Добавить')]")
    private WebElement AddButton;

    @Step("Пользователь находится на странице создания документа")
    public void onPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(Title));
        assertEquals(Title.getText(), "Добавление документа");
    }

    @Step("Пользователь заполнил поле Группа компаний")
    public void gkField(String GK) {
        GKField.sendKeys(GK);
        driver.findElement(By.xpath("//li[contains(text(),'" + GK + "')]")).click();
    }

    @Step("Поле Раздел досье заполнено")
    public void razdelDField(String RazdelD) {
        RazdelDField.sendKeys(RazdelD);
        driver.findElement(By.xpath("//li[contains(text(),'" + RazdelD + "')]")).click();
    }

    @Step("Поле Формат документа заполнено")
    public void formDocField(String FormDoc) {
        FormDocField.sendKeys(FormDoc);
        driver.findElement(By.xpath("//li[contains(text(),'" + FormDoc + "')]")).click();
    }

    @Step("Выбран каталог ")
    public void catalogField(String Catalog) {
        CatalogField.sendKeys(Catalog);
        driver.findElement(By.xpath("//span[contains(text(),'" + Catalog + "')]")).click();
    }

    @Step("Выбрано краткое наименование")
    public void shortTitle(String ShortT) {
        ShortTitle.sendKeys(ShortT);
        driver.findElement(By.xpath("//li[contains(text(),'" + ShortT + "')]")).click();
    }

    @Step("Классификация документа - выбрана")
    public void classification() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(ClassifGSGO);
        c.add(ClassifGSReg);
        c.add(ClassifOPKGO);
        c.add(ClassifOPKReg);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();
    }

    @Step("Добавлено вложение")
    public void attachment(String filePath) {
        Attachment.sendKeys(filePath);
    }

    @Step("Заполнено поле Номер документа")
    public void name(String docName) {
        Name.sendKeys(docName);
    }

    @Step("Включены уведомления")
    public void enableNotifications() {
        NotificationYes.click();
    }

    @Step("Заполнено поле Вид документа")
    public void typeOfDocument() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(DocUL);
        c.add(DocGK);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();
    }

    @Step("Заполнено поле Период документа(год)")
    public void year(String docYear) {
        Year.sendKeys(docYear);
        driver.findElement(By.xpath("//li[contains(text(),'" + docYear + "')]")).click();
    }

    @Step("Заполнено поле Период документа(квартал)")
    public void quarta(String quarta) {
        Quarta.sendKeys(quarta);
        driver.findElement(By.xpath("//li[contains(text(),'" + quarta + "')]")).click();
    }

    @Step("Заполнен атрибут Владелец документа")
    public void documentOwner() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(DocClient);
        c.add(DocBank);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();

    }

    @Step("Выбрана дата документа")
    public void date(String docDate) {
        Date.sendKeys(docDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + docDate + "')]")).click();
    }

    @Step("Выбран срок хранения документа")
    public void expirationDate(String expirationDate) {
        ExpirationDate.sendKeys(expirationDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + expirationDate + "')]")).click();
    }

    @Step("Верификация выполнена")
    public void verificationYes() {
        VerificationYes.click();
    }

    @Step("Верификация не выполнена")
    public void verificationNo() {
        VerificationNo.click();
    }

    @Step("Нажать кнопку Добавить")
    public void addButton() {
        AddButton.click();
    }


}
