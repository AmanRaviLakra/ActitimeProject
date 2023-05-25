package testScript;

import elementRepo.TasksPage;
import elementRepo.TimeTrackPage;
import genericLib.BaseClass;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(listners.ListnerImplementation.class)
public class CreateCustomer extends BaseClass {
    @Test
    public void createCustomer() throws EncryptedDocumentException, IOException {
        String customername = du.getDataFromExcelsheet("Sheet3", 0, 1);
        int num = cu.getRandomNum();
        customername = customername + num;
        TimeTrackPage ttp = new TimeTrackPage(driver);
        ttp.clickTasks();
        TasksPage tp = new TasksPage(driver);
        tp.clickAddNew();
        tp.ClickCreateCustomer(customername, du.getDataFromExcelsheet("Sheet3", 1, 1));
        cu.textToBePresentInElement(driver, tp.getFetchtitle(), customername);
        String expCustomername = tp.fetchCustomerName();
        System.out.println(expCustomername);
    }
}
