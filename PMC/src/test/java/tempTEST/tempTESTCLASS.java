package tempTEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.RecruitePage;

public class tempTESTCLASS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium files\\newselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://pmc.gov.in/mr");
		
		HomePage homePage = new HomePage (driver);
		homePage.changeLang();
		
		String homePageTitle = driver.getTitle();
		if (homePageTitle.equals("Home | Pune Municipal Corporation")) {
			System.out.println("correct URL---HOMEPAGE");
		}
		else {
			System.out.println("correct URL");
		}
		
		homePage.pmcSelect();
		
		
		RecruitePage recruitePage = new RecruitePage (driver);
		recruitePage.RecADV();
		
		System.out.println("end");		
				
				
				
				
				
				
				
				
	}
}
