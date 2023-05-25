package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsPage {
    public GeneralSettingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#userGroupNamingCodeSelect")
    private WebElement usergroupsdd;

    @FindBy(css = "#FormModifiedTextCell")
    private WebElement msgnotification;

    public WebElement getUsergroupsdd() {
        return usergroupsdd;
    }


    public WebElement getMsgnotification() {
        return msgnotification;
    }

    public String getModificationMsg() {
        return getMsgnotification().getText();
    }
}
