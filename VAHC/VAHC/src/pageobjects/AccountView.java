package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AccountView"                                
, summary=""
, relativeUrl=""
, connection="RN_User"
		)             
public class AccountView {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='This is an case created with Provar on 2022-07-07 (060)']")
	public WebElement CASES_SUBJECT;

	@FindBy(xpath = "//div[@class='content']//table/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = Actions.class)
	public List<Actions> actionList;

	@PageRow()
	public static class Actions {

		@BooleanType()
		@FindBy(xpath = ".//td[1]/input[@type='checkbox']")
		public WebElement selected;


	}


}
