package testScript;

import elementRepo.CreateTypeOfWorkPage;
import elementRepo.TimeTrackPage;
import elementRepo.TypeOfWorkPage;
import genericLib.BaseClass;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertHandling extends BaseClass {
    @Test
    public void handelAlert() throws EncryptedDocumentException, IOException {
        TimeTrackPage ttp=new TimeTrackPage(driver);
        ttp.clickSettings();
        ttp.clickTypesOfWork();
        TypeOfWorkPage twp=new TypeOfWorkPage(driver);
        twp.clickCreateWork();
        CreateTypeOfWorkPage ctp=new CreateTypeOfWorkPage(driver);
        ctp.enterName(du.getDataFromExcelsheet("Sheet1", 1, 2));
        ctp.clickCancel();
        String msg=cu.getMsgFromAlert(driver);
        System.out.println(msg);
        cu.alertDismiss(driver);
    }
}
