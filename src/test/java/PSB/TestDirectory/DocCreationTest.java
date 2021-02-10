package PSB.TestDirectory;

import PSB.Settings.ConfProperties;
import PSB.Settings.WebDriverSettings;
import org.junit.Test;

public class DocCreationTest extends WebDriverSettings {
    @Test
    public void docCreation() {
        loginPage.Auth();
        documentsPage.newDoc();
        docCreationPage.onPage();
        docCreationPage.gkField(ConfProperties.getProperty("gk"));
        docCreationPage.razdelDField(ConfProperties.getProperty("razdelD"));
        docCreationPage.formDocField(ConfProperties.getProperty("formDoc"));
        docCreationPage.catalogField(ConfProperties.getProperty("catalog"));
        docCreationPage.shortTitle(ConfProperties.getProperty("shortT"));
        docCreationPage.classifGSGO();
        docCreationPage.attachment(ConfProperties.getProperty("filePath"));
        docCreationPage.name(ConfProperties.getProperty("docName"));
        docCreationPage.docGK();
        docCreationPage.enableNotifications();
        docCreationPage.year(ConfProperties.getProperty("docYear"));
        docCreationPage.quarta(ConfProperties.getProperty("quarta"));
        docCreationPage.docClient();
        docCreationPage.addButton();

    }
}
