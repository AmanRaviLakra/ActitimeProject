package listners;

import genericLib.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListnerImplementation implements ITestListener{
    @Override
    public void onTestFailure(ITestResult result) {
        String tcname=result.getName();
        TakesScreenshot ts=(TakesScreenshot)BaseClass.listnerdriver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("./screenshot/"+tcname+".png");
        try {
            FileUtils.copyFile(src, trg);
        } catch (IOException e) {

        }
    }
}

