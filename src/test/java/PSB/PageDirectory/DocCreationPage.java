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

public class DocCreationPage {
    public WebDriver driver;
    public static WebElement[] x;

    public DocCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h5[contains(text(),'Добавление документа')]")
    private WebElement title;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[1]/section[1]/section[1]/section[1]/section[1]/input[1]")
    private WebElement gkField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[2]/section[1]/section[1]/section[1]/input[1]")
    private WebElement ulField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[3]/section[1]/section[1]/div[1]/input[1]")
    private WebElement innField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[4]/section[1]/section[1]/section[1]/input[1]")
    private WebElement razdelDField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[5]/section[1]/section[1]/section[1]/input[1]")
    private WebElement formDocField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[7]/section[1]/section[1]/div[1]/input[1]")
    private WebElement catalogField;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[8]/section[1]/section[1]/section[1]/section[1]/input[1]")
    private WebElement shortTitle;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[9]/section[1]/section[1]/section[1]/input[1]")
    private WebElement fullTitle;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[1]")
    private WebElement classifGSGO;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[2]")
    private WebElement classifGSReg;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[3]")
    private WebElement classifOPKGO;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[1]/section[10]/label[4]")
    private WebElement classifOPKReg;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[2]/section[1]/div[1]/input[1]")
    private WebElement attachment;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[1]/div[1]/input[1]")
    private WebElement name;
    @FindBy(xpath = "//span[contains(text(),'Документ ЮЛ')]")
    private WebElement docUL;
    @FindBy(xpath = "//span[contains(text(),'Документ ГК')]")
    private WebElement docGK;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[5]/section[1]/section[1]/section[1]/input[1]")
    private WebElement year;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[6]/section[1]/section[1]/input[1]")
    private WebElement quarta;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[6]/section[1]/section[1]/input[1]")
    private WebElement status;
    @FindBy(xpath = "//span[contains(text(),'Документ Клиента')]")
    private WebElement docClient;
    @FindBy(xpath = "//span[contains(text(),'Документ Банка')]")
    private WebElement docBank;
    @FindBy(xpath = "//span[contains(text(),'Активно')]")
    private WebElement notificationYes;
    @FindBy(xpath = "//span[contains(text(),'Неактивно')]")
    private WebElement notificationNo;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[8]/section[1]/input[1]")
    private WebElement date;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[9]/section[1]/input[1]")
    private WebElement expirationDate;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[10]/label[1]")
    private WebElement verificationYes;
    @FindBy(xpath = "//body/div[@id='app']/section[1]/section[1]/form[1]/section[5]/section[10]/label[2]")
    private WebElement verificationNo;
    @FindBy(xpath = "//button[contains(text(),'Добавить')]")
    private WebElement addButton;

    @Step("Пользователь находится на странице создания документа")
    public void onPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(title));
        assertEquals(title.getText(), "Добавление документа");
    }

    @Step("Пользователь заполнил поле Группа компаний")
    public void gkField(String GK) {
        gkField.sendKeys(GK);
        driver.findElement(By.xpath("//li[contains(text(),'" + GK + "')]")).click();
    }

    @Step("Поле Раздел досье заполнено")
    public void razdelDField(String RazdelD) {
        razdelDField.sendKeys(RazdelD);
        driver.findElement(By.xpath("//li[contains(text(),'" + RazdelD + "')]")).click();
    }

    @Step("Поле Формат документа заполнено")
    public void formDocField(String FormDoc) {
        formDocField.sendKeys(FormDoc);
        driver.findElement(By.xpath("//li[contains(text(),'" + FormDoc + "')]")).click();
    }

    @Step("Выбран каталог ")
    public void catalogField(String Catalog) {
        catalogField.sendKeys(Catalog);
        driver.findElement(By.xpath("//span[contains(text(),'" + Catalog + "')]")).click();
    }

    @Step("Выбрано краткое наименование")
    public void shortTitle(String ShortT) {
        shortTitle.sendKeys(ShortT);
        driver.findElement(By.xpath("//li[contains(text(),'" + ShortT + "')]")).click();
    }

    @Step("Классификация документа - выбрана")
    public void classification() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(classifGSGO);
        c.add(classifGSReg);
        c.add(classifOPKGO);
        c.add(classifOPKReg);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();
    }

    @Step("Добавлено вложение")
    public void attachment(String filePath) {
        attachment.sendKeys(filePath);
    }

    @Step("Заполнено поле Номер документа")
    public void name(String docName) {
        name.sendKeys(docName);
    }

    @Step("Включены уведомления")
    public void enableNotifications() {
        notificationYes.click();
    }

    @Step("Заполнено поле Вид документа")
    public void typeOfDocument() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(docUL);
        c.add(docGK);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();
    }

    @Step("Заполнено поле Период документа(год)")
    public void year(String docYear) {
        year.sendKeys(docYear);
        driver.findElement(By.xpath("//li[contains(text(),'" + docYear + "')]")).click();
    }

    @Step("Заполнено поле Период документа(квартал)")
    public void quarta(String quarta) {
        this.quarta.sendKeys(quarta);
        driver.findElement(By.xpath("//li[contains(text(),'" + quarta + "')]")).click();
    }

    @Step("Заполнен атрибут Владелец документа")
    public void documentOwner() {
        ArrayList<WebElement> c = new ArrayList<>();
        c.add(docClient);
        c.add(docBank);
        x = c.toArray(new WebElement[0]);
        int idx = new Random().nextInt(x.length);
        WebElement random = (x[idx]);
        random.click();

    }

    @Step("Выбрана дата документа")
    public void date(String docDate) {
        date.sendKeys(docDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + docDate + "')]")).click();
    }

    @Step("Выбран срок хранения документа")
    public void expirationDate(String expirationDate) {
        this.expirationDate.sendKeys(expirationDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + expirationDate + "')]")).click();
    }

    @Step("Верификация выполнена")
    public void verificationYes() {
        verificationYes.click();
    }

    @Step("Верификация не выполнена")
    public void verificationNo() {
        verificationNo.click();
    }

    @Step("Нажать кнопку Добавить")
    public void addButton() {
        addButton.click();
    }


}
