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
    @FindBy(xpath = "//span[contains(text(),'Роли')]")
    private WebElement RoleTab;
    @FindBy(xpath = "//button[contains(text(),'Роль')]")
    private WebElement AddRole;

    @FindBy(xpath = "//header/section[1]/input[1]")
    private WebElement SearchRole;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[1]/div[1]/input[1]")
    private WebElement Code;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[2]/section[1]/div[1]/input[1]")
    private WebElement Name;


    //Каталог документов
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[1]/section[2]/label[1]/span[1]")
    private WebElement CatDocDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[1]/section[3]/label[1]/span[1]")
    private WebElement CatDicChange;
    //Атрибуты документа
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[2]/section[2]/label[1]/span[1]")
    private WebElement AtrDocDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[2]/section[3]/label[1]/span[1]")
    private WebElement AtrDicChange;
    //Users
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[3]/section[2]/label[1]/span[1]")
    private WebElement UsersDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[3]/section[3]/label[1]/span[1]")
    private WebElement UsersChange;
    //Roles
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[4]/section[2]/label[1]/span[1]")
    private WebElement RoleDicView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[4]/section[3]/label[1]/span[1]")
    private WebElement RoleChange;
    //Просмотр Документов
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[2]/label[1]/span[1]")
    private WebElement ArchiveDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[3]/label[1]/span[1]")
    private WebElement GSGODocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[4]/label[1]/span[1]")
    private WebElement GSRegDocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[5]/label[1]/span[1]")
    private WebElement OPKGODocView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[5]/section[6]/label[1]/span[1]")
    private WebElement OPKREGDocView;
    //Dashboard
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[2]/label[1]/span[1]")
    private WebElement SearchDoc;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[3]/label[1]/span[1]")
    private WebElement CreateDoc;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[4]/label[1]/span[1]")
    private WebElement VerView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[5]/label[1]/span[1]")
    private WebElement DocDownload;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[6]/label[1]/span[1]")
    private WebElement DocCardView;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[6]/section[7]/label[1]/span[1]")
    private WebElement CopyAs;
    //Карточка документа
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[2]/label[1]/span[1]")
    private WebElement DocCardEdit;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[3]/label[1]/span[1]")
    private WebElement DocCardDownload;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[4]/label[1]/span[1]")
    private WebElement DocCardParent;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[7]/section[5]/label[1]/span[1]")
    private WebElement DocCardSubsidiary;
    //Отчёты
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/section[1]/form[1]/section[3]/section[8]/section[2]/label[1]/span[1]")
    private WebElement Report;
    //Кнопки
    @FindBy(xpath = "//button[contains(text(),'Сохранить')]")
    private WebElement SaveButton;
    @FindBy(xpath = "//button[contains(text(),'Отменить')]")
    private WebElement CancelButton;

    @Step("Выбран раздел Администрирование/Роли")
    public void setRole() {
        RoleTab.click();
    }
    @Step("Нажата кнопка Добавить роль")
    public void addRole() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        AddRole.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Роль пользователя')]")));

    }
    @Step("Поиск по роли")
    public void SearchRole(String SeekingRole) {
        SearchRole.sendKeys(SeekingRole);
    }
    @Step("Введен код роли")
    public void setCode(String codeRole) {
        Code.sendKeys(codeRole);
    }
    @Step("Введено название роли")
    public void setName(String roleTitle) {
        Name.sendKeys(roleTitle);
    }
    @Step("Выбран атрибут Видимось каталога")
    public void setCatDocDicView() {
        CatDocDicView.click();
    }
    @Step("Выбран атрибут Права на изменение каталога")
    public void setCatDicChange() {
        CatDicChange.click();
    }

    public void setAtrDocDicView() {
        AtrDocDicView.click();
    }

    public void setArtDicChange() {
        AtrDicChange.click();
    }

    public void setUsersDicView() {
        UsersDicView.click();
    }

    public void setUsersChange() {
        UsersChange.click();
    }

    public void setRoleDicView() {
        RoleDicView.click();
    }

    public void setRoleChange() {
        RoleChange.click();
    }


    public void setSearchDoc() {
        SearchDoc.click();
    }

    public void setCreateDoc() {
        CreateDoc.click();
    }

    public void setVerView() {
        VerView.click();
    }

    public void setDocDownload() {
        DocDownload.click();
    }

    public void setDocCardView() {
        DocCardView.click();
    }

    public void setCopyAs() {
        CopyAs.click();
    }


    public void setDocCardEdit() {
        DocCardEdit.click();
    }

    public void setDocCardDownload() {
        GSRegDocView.click();
    }

    public void setDocCardParent() {
        DocCardParent.click();
    }

    public void setDocCardSubsidiary() {
        DocCardSubsidiary.click();
    }

    public void setReport() {
        Report.click();
    }
    @Step("Нажата кнопка Добавить роль")
    public void clickSaveButton() {
        SaveButton.click();
    }
    @Step("Нажата кнопка Отмена")
    public void clickCancel() {
        CancelButton.click();
    }


}
