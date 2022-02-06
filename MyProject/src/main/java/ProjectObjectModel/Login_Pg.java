package ProjectObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pg{
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(css = ".login_forgot a")
	private WebElement forgotPassword;
	
	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(css = ".login_register a")
	private WebElement newUser;

		
	public Login_Pg(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver,this);
	}

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
