package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath = "//select[@id='lang-dropdown-select-language']")
	private WebElement lang;
	
	@FindBy (xpath = "//option[text()='English']")
	private WebElement langEng;
	
	@FindBy (xpath = "(//span[@title='PMC'])[1]")
	private WebElement pmc;
	
	@FindBy (xpath = "(//li[@id='menu-1740-1']//div//a)[6]")
	private WebElement recruite;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void changeLang () {
		lang.click();
		langEng.click();
	}
	
	public void pmcSelect () {
		pmc.click();
		recruite.click();
		
	}
}
