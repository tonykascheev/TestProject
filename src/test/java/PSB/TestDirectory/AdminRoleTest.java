package PSB.TestDirectory;

import PSB.PageDirectory.AdminRolePage;
import PSB.Settings.ConfProperties;
import PSB.Settings.WebDriverSettings;
import org.junit.Test;

public class AdminRoleTest extends WebDriverSettings {

    @Test
    public void AdminCreationRole() {
        loginPage.Auth();
        documentsPage.setAdminTab();
        adminRolePage.setRole();
        adminRolePage.addRole();
        adminRolePage.setCode(ConfProperties.getProperty("codeRole"));
        adminRolePage.setName(ConfProperties.getProperty("roleTitle"));
        adminRolePage.setCatDicChange();
        adminRolePage.clickSaveButton();
    }


}
