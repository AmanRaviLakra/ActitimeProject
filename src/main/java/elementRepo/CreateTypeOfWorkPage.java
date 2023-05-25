package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTypeOfWorkPage {
    public CreateTypeOfWorkPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#name")
    private WebElement namefield;

    @FindBy(xpath = "//input[@value='      Cancel      ']")
    private WebElement cancelbutton;

    public WebElement getNamefield() {
        return namefield;
    }


    public WebElement getCancelbutton() {
        return cancelbutton;
    }

    public void enterName(String name) {
        getNamefield().sendKeys(name);
    }

    public void clickCancel() {
        getCancelbutton().click();
    }
}
