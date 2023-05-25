package testScript;

import elementRepo.GeneralSettingsPage;
import elementRepo.TimeTrackPage;
import genericLib.BaseClass;
import org.testng.annotations.Test;

public class DropDown extends BaseClass {
    @Test
    public void handleDropdown() {
        TimeTrackPage ttp = new TimeTrackPage(driver);
        ttp.clickSettings();
        ttp.clickGeneralSettings();
        GeneralSettingsPage gsp = new GeneralSettingsPage(driver);
        cu.selectByVisibleText(gsp.getUsergroupsdd(), "Location");
        System.out.println(gsp.getModificationMsg());
    }
}
