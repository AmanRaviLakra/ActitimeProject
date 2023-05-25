package genericLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class CommonUtility {
    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions a=new Actions(driver);
        a.dragAndDrop(source, target).perform();
    }

    public void visibilityOfElementLocated(WebDriver driver, By locatot) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatot));
    }

    public void scrollByAmount(WebDriver driver,int x,int y) {
        Actions a=new Actions(driver);
        a.scrollByAmount(x, y);
    }

    public void moveToElement(WebDriver driver,WebElement wb) {
        Actions a=new Actions(driver);
        a.moveToElement(wb).perform();
    }

    public void doubleClick(WebDriver driver,WebElement wb) {
        Actions a=new Actions(driver);
        a.doubleClick(wb).perform();
    }

    public List<WebElement> getOptions(WebElement wb) {
        Select s=new Select(wb);
        List<WebElement> ls=s.getOptions();
        return ls;
    }

    public void textToBePresentInElementLocated(WebDriver driver,By Locator,String s) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(Locator, s));
    }

    public void textToBePresentInElement(WebDriver driver,WebElement wb,String s) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(wb,s));
    }

    public void selectByIndex(WebElement wb,int index) {
        Select s=new Select(wb);
        s.selectByIndex(index);
    }

    public void selectByValue(WebElement wb,String value) {
        Select s=new Select(wb);
        s.selectByValue(value);
    }

    public void selectByVisibleText(WebElement wb,String text) {
        Select s=new Select(wb);
        s.selectByVisibleText(text);
    }

    public int getRandomNum() {
        Random r=new Random();
        int num=r.nextInt(10000);
        return num;
    }

    public String getMsgFromAlert(WebDriver driver) {
        Alert alt=driver.switchTo().alert();
        String msg=alt.getText();
        return msg;
    }

    public void alertAccept(WebDriver driver) {
        Alert alt=driver.switchTo().alert();
        alt.accept();
    }

    public void alertDismiss(WebDriver driver) {
        Alert alt=driver.switchTo().alert();
        alt.dismiss();
    }
}
