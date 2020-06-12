package kdf;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	@Test
	 public void verifyInvalidLogin() throws IOException {
		String[][] data = GenericMethods.getData("D:\\SeleniumFiles\\May2020\\TestData.xlsx", "Sheet3");
		for(int i = 1;i<data.length;i++) {
		switch(data[i][3]) {
	case "openBrowser":
		Methods.openBrowser();
		break;
	case "maxBrowser":
		Methods.maximizeBrowserWindow();
		break;
	case "impWait":
		Methods.implementImplicitWait();
		break;
	case "navigateToAUT":
		Methods.navigateToApp(data[i][6]);
		break;
	case "enterUserId":
		Methods.enterUserId(data[i][4],data[i][5], data[i][6]);
		break;
	case "enterPassword":
		Methods.enterPassword(data[i][4],data[i][5], data[i][6]);
		break;
	case "clickSignIn":
		Methods.clickButton(data[i][4], data[i][5]);
		break;
	case "verifyErrMsg":
		String actualMsg = Methods.getErrMsg(data[i][5]);
		String expectedMsg = data[i][6];
		Assert.assertEquals(actualMsg, expectedMsg);
		break;
	case "closeAUT":
		Methods.closeApplication();
		break;
		}
		}
		
			
	}
}

		
