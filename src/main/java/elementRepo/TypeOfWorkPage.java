package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeOfWorkPage {
    public TypeOfWorkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#createBillingTypeDiv")
    private WebElement creatework;

    public WebElement getCreatework() {
        return creatework;
    }

    public void clickCreateWork() {
        getCreatework().click();
    }
}
