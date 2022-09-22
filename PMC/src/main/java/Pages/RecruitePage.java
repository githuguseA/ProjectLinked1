package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitePage {


	@FindBy (xpath = "//a[text()='Recruitment Advertisement']")
	private WebElement recADV;
	
	@FindBy (xpath = "//a[text()='Corrigendum Dt.22-07-2022']")
	private WebElement corigoD;
	
	public RecruitePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void RecADV () {
		recADV.click();
	}
	
}
