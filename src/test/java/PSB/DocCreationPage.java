package PSB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class DocCreationPage {
    public WebDriver driver;

    public DocCreationPage(WebDriver driver) {
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

    public void onPage() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(Title));
        assertEquals(Title.getText(), "Добавление документа");
    }

    public void GKField(String GK) {
        GKField.sendKeys(GK);
        driver.findElement(By.xpath("//li[contains(text(),'" + GK + "')]")).click();
    }

    public void RazdelDField(String RazdelD) {
        RazdelDField.sendKeys(RazdelD);
        driver.findElement(By.xpath("//li[contains(text(),'" + RazdelD + "')]")).click();
    }

    public void FormDocField(String FormDoc) {
        FormDocField.sendKeys(FormDoc);
        driver.findElement(By.xpath("//li[contains(text(),'" + FormDoc + "')]")).click();
    }

    public void CatalogField(String Catalog) {
        CatalogField.sendKeys(Catalog);
        driver.findElement(By.xpath("//span[contains(text(),'" + Catalog + "')]")).click();
    }

    public void ShortTitle(String ShortT) {
        ShortTitle.sendKeys(ShortT);
        driver.findElement(By.xpath("//li[contains(text(),'" + ShortT + "')]")).click();
    }

    public void ClassifGSGO() {
        ClassifGSGO.click();
    }

    public void ClassifGSReg() {
        ClassifGSReg.click();
    }

    public void ClassifOPKGO() {
        ClassifOPKGO.click();
    }

    public void ClassifOPKReg() {
        ClassifOPKReg.click();
    }

    public void Attachment(String filePath) {
        Attachment.sendKeys(filePath);
    }

    public void Name(String docName) {
        Name.sendKeys(docName);
    }

    public void EnableNotifications() {
        NotificationYes.click();
    }

    public void DocUL() {
        DocUL.click();
    }

    public void DocGK() {
        DocGK.click();
    }

    public void Year(String docYear) {
        Year.sendKeys(docYear);
        driver.findElement(By.xpath("//li[contains(text(),'" + docYear + "')]")).click();
    }

    public void Quarta(String quarta) {
        Quarta.sendKeys(quarta);
        driver.findElement(By.xpath("//li[contains(text(),'" + quarta + "')]")).click();
    }

    public void DocClient() {
        DocClient.click();
    }

    public void DocBank() {
        DocBank.click();
    }

    public void Date(String docDate) {
        Date.sendKeys(docDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + docDate + "')]")).click();
    }

    public void ExpirationDate(String expirationDate) {
        ExpirationDate.sendKeys(expirationDate);
        driver.findElement(By.xpath("//li[contains(text(),'" + expirationDate + "')]")).click();
    }

    public void VerificationYes() {
        VerificationYes.click();
    }

    public void VerificationNo() {
        VerificationNo.click();
    }

    public void AddButton() {
        AddButton.click();
    }


}
