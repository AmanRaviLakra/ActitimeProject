package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
    public TimeTrackPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css =".popup_menu_button_settings ")
    private WebElement settings;

    @FindBy(css = "#popup_menu_item_6")
    private WebElement generalsettings;

    @FindBy(css = "#container_tasks")
    private WebElement tasks;

    @FindBy(css = "#popup_menu_item_2")
    private WebElement typesofwork;



    public WebElement getTypesofwork() {
        return typesofwork;
    }


    public WebElement getTasks() {
        return tasks;
    }

    public WebElement getSettings() {
        return settings;
    }

    public WebElement getGeneralsettings() {
        return generalsettings;
    }

    public void clickSettings() {
        getSettings().click();
    }

    public void clickGeneralSettings() {
        getGeneralsettings().click();
    }

    public void clickTasks() {
        getTasks().click();
    }

    public void clickTypesOfWork() {
        getTypesofwork().click();
    }
}
