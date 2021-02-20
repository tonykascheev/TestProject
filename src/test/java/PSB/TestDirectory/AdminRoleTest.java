package PSB.TestDirectory;

import PSB.PageDirectory.AdminRolePage;
import PSB.Settings.ConfProperties;
import PSB.Settings.WebDriverSettings;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class AdminRoleTest extends WebDriverSettings {
    @Step("Проверка создания новой роли")
    @Test
    public void AdminCreationRole() {
        loginPage.Auth();
        documentsPage.onPage();
        driver.findElement(By.xpath("//body/div[@id='app']/section[1]/nav[1]/section[1]/section[1]")).click();
        documentsPage.setAdminTab();
        adminRolePage.setRole();
        adminRolePage.addRole();
        adminRolePage.setCode(ConfProperties.getProperty("codeRole"));
        adminRolePage.setName(ConfProperties.getProperty("roleTitle"));
        adminRolePage.setCatDicChange();
        adminRolePage.clickSaveButton();
    }


}
