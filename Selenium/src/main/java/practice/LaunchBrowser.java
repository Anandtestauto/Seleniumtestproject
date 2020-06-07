package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://web.whatsapp.com/");
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
