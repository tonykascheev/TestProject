package PSB.TestDirectory;

import PSB.Settings.ConfProperties;
import PSB.Settings.Randomizer;
import PSB.Settings.WebDriverSettings;
import io.qameta.allure.Step;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class DocCreationTest extends WebDriverSettings {
    File file = new File(ConfProperties.getProperty("filePath"));

    @Test
    @Step("Проверка создания документа")
    public void docCreation() throws IOException {
        loginPage.auth();
        documentsPage.newDoc();
        docCreationPage.onPage();
        docCreationPage.gkField(Randomizer.randomizer(ConfProperties.getProperty("gk")));
        docCreationPage.razdelDField(Randomizer.randomizer(ConfProperties.getProperty("razdelD")));
        docCreationPage.formDocField(Randomizer.randomizer(ConfProperties.getProperty("formDoc")));
        docCreationPage.catalogField(ConfProperties.getProperty("catalog"));
        docCreationPage.shortTitle(Randomizer.randomizer(ConfProperties.getProperty("shortT")));
        docCreationPage.classification();
        docCreationPage.attachment(file.getAbsolutePath());
        docCreationPage.name(ConfProperties.getProperty("docName"));
        docCreationPage.typeOfDocument();
        docCreationPage.enableNotifications();
        docCreationPage.year(Randomizer.randomizer((ConfProperties.getProperty("docYear"))));
        docCreationPage.quarta(Randomizer.randomizer(ConfProperties.getProperty("quarta")));
        docCreationPage.documentOwner();
        docCreationPage.addButton();

    }
}
