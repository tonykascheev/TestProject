package PSB.PageDirectory;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminRolePage {
    public WebDriver driver;

    public AdminRolePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //
    @FindBy(css = "div.elib-home-page div.elib-administration-page aside.elib-side-bar.elib-administration-page__side-bar ul.elib-side-bar__links-list > li.elib-side-bar__link:nth-child(3)")
    private WebElement roleTab;
    @FindBy(xpath = "//button[contains(text(),'Роль')]")
    private WebElement addRole;

    @FindBy(xpath = "//header/section[1]/input[1]")
    private WebElement searchRole;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[1]/div[1]/input[1]")
    private WebElement code;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[2]/section[1]/div[1]/input[1]")
    private WebElement name;


    //Каталог документов
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[1]/section[2]/label[1]/span[1]")
    private WebElement catDocDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[1]/section[3]/label[1]/span[1]")
    private WebElement catDicChange;
    //Атрибуты документа
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[2]/section[2]/label[1]/span[1]")
    private WebElement atrDocDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[2]/section[3]/label[1]/span[1]")
    private WebElement atrDicChange;
    //Users
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[3]/section[2]/label[1]/span[1]")
    private WebElement usersDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[3]/section[3]/label[1]/span[1]")
    private WebElement usersChange;
    //Roles
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[4]/section[2]/label[1]/span[1]")
    private WebElement roleDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[4]/section[3]/label[1]/span[1]")
    private WebElement roleChange;
    //Просмотр Документов
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[2]/label[1]/span[1]")
    private WebElement archiveDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[3]/label[1]/span[1]")
    private WebElement gsgoDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[4]/label[1]/span[1]")
    private WebElement gsregDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[5]/label[1]/span[1]")
    private WebElement opkgoDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[6]/label[1]/span[1]")
    private WebElement opkregDocView;
    //Dashboard
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[2]/label[1]/span[1]")
    private WebElement searchDoc;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[3]/label[1]/span[1]")
    private WebElement createDoc;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[4]/label[1]/span[1]")
    private WebElement verView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[5]/label[1]/span[1]")
    private WebElement docDownload;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[6]/label[1]/span[1]")
    private WebElement docCardView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[7]/label[1]/span[1]")
    private WebElement copyAs;
    //Карточка документа
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[2]/label[1]/span[1]")
    private WebElement docCardEdit;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[3]/label[1]/span[1]")
    private WebElement docCardDownload;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[4]/label[1]/span[1]")
    private WebElement docCardParent;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[5]/label[1]/span[1]")
    private WebElement docCardSubsidiary;
    //Отчёты
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[8]/section[2]/label[1]/span[1]")
    private WebElement report;
    //Кнопки
    @FindBy(xpath = "//button[contains(text(),'Сохранить')]")
    private WebElement saveButton;
    @FindBy(xpath = "//button[contains(text(),'Отменить')]")
    private WebElement cancelButton;

    @Step("Выбран раздел Администрирование/Роли")
    public void setRole() {
        roleTab.click();
    }

    @Step("Нажата кнопка Добавить роль")
    public void addRole() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        addRole.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Роль пользователя')]")));

    }

    @Step("Поиск по роли")
    public void searchRole(String SeekingRole) {
        searchRole.sendKeys(SeekingRole);
    }

    @Step("Введен код роли")
    public void setCode(String codeRole) {
        code.sendKeys(codeRole);
    }

    @Step("Введено название роли")
    public void setName(String roleTitle) {
        name.sendKeys(roleTitle);
    }

    @Step("Выбран атрибут Видимось каталога")
    public void setCatDocDicView() {
        catDocDicView.click();
    }

    @Step("Выбран атрибут Права на изменение каталога")
    public void setCatDicChange() {
        catDicChange.click();
    }

    public void setAtrDocDicView() {
        atrDocDicView.click();
    }

    public void setArtDicChange() {
        atrDicChange.click();
    }

    public void setUsersDicView() {
        usersDicView.click();
    }

    public void setUsersChange() {
        usersChange.click();
    }

    public void setRoleDicView() {
        roleDicView.click();
    }

    public void setRoleChange() {
        roleChange.click();
    }


    public void setSearchDoc() {
        searchDoc.click();
    }

    public void setCreateDoc() {
        createDoc.click();
    }

    public void setVerView() {
        verView.click();
    }

    public void setDocDownload() {
        docDownload.click();
    }

    public void setDocCardView() {
        docCardView.click();
    }

    public void setCopyAs() {
        copyAs.click();
    }


    public void setDocCardEdit() {
        docCardEdit.click();
    }

    public void setDocCardDownload() {
        gsregDocView.click();
    }

    public void setDocCardParent() {
        docCardParent.click();
    }

    public void setDocCardSubsidiary() {
        docCardSubsidiary.click();
    }

    public void setReport() {
        report.click();
    }

    @Step("Нажата кнопка Добавить роль")
    public void clickSaveButton() {
        saveButton.click();
    }

    @Step("Нажата кнопка Отмена")
    public void clickCancel() {
        cancelButton.click();
    }


}
