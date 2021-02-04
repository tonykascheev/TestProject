package PSB;

import org.junit.Test;

public class DocCreationTest extends WebDriverSettings {
    @Test
    public void docCreation() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
        documentsPage.newDoc();
        docCreationPage.onPage();
        docCreationPage.GKField(ConfProperties.getProperty("GK"));
        docCreationPage.RazdelDField(ConfProperties.getProperty("RazdelD"));
        docCreationPage.FormDocField(ConfProperties.getProperty("FormDoc"));
        docCreationPage.CatalogField(ConfProperties.getProperty("Catalog"));
        docCreationPage.ShortTitle(ConfProperties.getProperty("ShortT"));
        docCreationPage.ClassifGSGO();
        docCreationPage.Attachment(ConfProperties.getProperty("filePath"));
        docCreationPage.Name(ConfProperties.getProperty("docName"));
        docCreationPage.DocGK();
        docCreationPage.EnableNotifications();
        docCreationPage.Year(ConfProperties.getProperty("docYear"));
        docCreationPage.Quarta(ConfProperties.getProperty("quarta"));
        docCreationPage.DocClient();
        docCreationPage.AddButton();

    }
}
