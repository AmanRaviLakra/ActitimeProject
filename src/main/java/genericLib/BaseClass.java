package genericLib;

import elementRepo.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    public static WebDriver listnerdriver;
    public DataUtility du=new DataUtility();
    public CommonUtility cu=new CommonUtility();

    @BeforeClass
    public void launchBrowser() throws IOException {

        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver();
        listnerdriver=driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void logIn() throws IOException {
        LoginPage lp=new LoginPage(driver);
        driver.get(du.getDataFromProperties("url"));
        lp.logInApp(du.getDataFromProperties("username"), du.getDataFromProperties("password"));


    }

    @AfterMethod
    public void logOut() {
        driver.findElement(By.id("logoutLink")).click();
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
