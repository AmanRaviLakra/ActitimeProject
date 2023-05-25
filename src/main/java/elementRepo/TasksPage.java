package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
    public TasksPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".title.ellipsis")
    private WebElement addnew;

    @FindBy(css = ".createNewCustomer")
    private WebElement createcustomer;

    @FindBy(css = ".newNameField")
    private WebElement namefield;

    @FindBy(css = "[placeholder='Enter Customer Description']")
    private WebElement descriptionfield;

    @FindBy(xpath = "//div[text()='Create Customer']")
    private WebElement clickcreatecustomer;

    @FindBy(css = ".titleEditButtonContainer")
    private WebElement fetchtitle;

    public WebElement getAddnew() {
        return addnew;
    }


    public WebElement getCreatecustomer() {
        return createcustomer;
    }


    public WebElement getNamefield() {
        return namefield;
    }


    public WebElement getDescriptionfield() {
        return descriptionfield;
    }


    public WebElement getClickcreatecustomer() {
        return clickcreatecustomer;
    }


    public WebElement getFetchtitle() {
        return fetchtitle;
    }

    public void clickAddNew() {
        getAddnew().click();
        getCreatecustomer().click();
    }

    public void ClickCreateCustomer(String customername, String description) {
        getNamefield().sendKeys(customername);
        getDescriptionfield().sendKeys(description);
        getClickcreatecustomer().click();
    }

    public String fetchCustomerName() {
        return getFetchtitle().getText();
    }
}
