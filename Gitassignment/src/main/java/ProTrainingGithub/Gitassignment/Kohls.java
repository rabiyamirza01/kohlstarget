package ProTrainingGithub.Gitassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kohls {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabiya's Windows PC\\eclipse-workspace\\Gitassignment\\src\\type2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.kohls.com/");	

	}

}
