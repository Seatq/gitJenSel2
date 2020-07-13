package gitJenSel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWD2 {
	public static void main(String[] args) throws Exception {
		System.out.println("  >>>>>>> Started Execution"); 
		WebDriver myDriver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// Initialize browser
		myDriver = new ChromeDriver();
		 // Maximize browser
				myDriver.manage().window().maximize();
				 
		// Open IteLearn
		myDriver.get("https://www.itelearn.com");
		System.out.println("Navigated now will wait for 4 seconds");
		Thread.sleep(4000);
		myDriver.quit();
		System.out.println("  >>>>>>> Ended Execution"); 
		 
		}

}
