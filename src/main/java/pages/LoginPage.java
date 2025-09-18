package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By username = By.id("Email");
	private By password = By.id("Password");
	private By loginbutton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String un) {
		
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(un);
	}
	
	public void enterPassWord(String pw) {
		
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickLoginButton() {
		
		driver.findElement(loginbutton).click();
	}
	

}
