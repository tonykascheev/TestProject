package PSB.TestDirectory;

import PSB.PageDirectory.AdminRolePage;
import PSB.Settings.ConfProperties;
import PSB.Settings.WebDriverSettings;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

public class AdminRoleTest extends WebDriverSettings {
    @Step("Проверка создания новой роли")
    @Test
    public void AdminCreationRole() {
        loginPage.Auth();
        documentsPage.onPage();
        documentsPage.setAdminTab();
        adminRolePage.setRole();
        adminRolePage.addRole();
        adminRolePage.setCode(ConfProperties.getProperty("codeRole"));
        adminRolePage.setName(ConfProperties.getProperty("roleTitle"));
        adminRolePage.setCatDicChange();
        adminRolePage.clickSaveButton();
    }


}
