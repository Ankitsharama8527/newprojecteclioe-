package stepdef;

import org.openqa.selenium.By;

public class loginstepdef {
	
	
	WebDriver driver;
		
	@Given("^user is already on Login Page$")
	 public void user_already_on_login_page() {
	     System.setProperty("webdriver.chrom.driver"," /Users/Ankit/Downloads/chromedriver");
	     driver = new ChromeDriver();
	     driver.get("https://www.freecrm.com");
	}
	
	@when("^title of login page is free CRM$ ")
	public void title_of_login_is_free_CRM() {
		WebDriver drive = new ChromeDriver();
		String title = driver.getTitle();
		System.out.println(title); 
		Assert.assertEquals("#1 free CRM for Any business online cuatomer relationship software",title);
			 
	}
	
	@Then("^user enters username And password$")
	public void user_enters_username() {
	
		By drive;
		drive.findElements(By.name("username")).sendkey(Ankit);
		drive.findElement(By.name("password")).sendkey(Ankit@123);
		
	}
	
	@Then("^user click on login button$")
	public void user_click_on_login_button() { 
		WebElement login = drive.findElement(By.xpath("//input[@type='submit']"));
		javascriptExecutor js = (JavascriptExecutor)drive;
		js.excuteScript("arguments[0].click();",loginBtn);
		
	}
	
	@Then("^user on home page&")
	public void user_on_home_page () {
		String title = driver.getTitle();
		System.out.println("home page title :: +title");
		Assert.assertEquals("CRMPRO",title);

}

	 @given("^User is already on login page$")
	 public void User_is_already_on_login_page () {
		 System.setProperty("webdriver.chrom.driver"," /Users/Ankit/Downloads/chromedriver");
	     driver = new ChromeDriver();
	     driver.get("https://www.facebook.com");
	 }
	 
	 @When("^title og login page is facebook$")
	 public void title_on_login_page_is_facebook () {
		 WebDriver drive = new ChromeDriver();
			String title = driver.getTitle();
			System.out.println(title); 
			Assert.assertEquals("FACEBOOK.COM",title);
				 	 
	 }
	 
	 @Then("^user enters username$")
	 public void user_enters_username () {
		 public void user_enters_username() {
				
				By drive;
				drive.findElements(By.name("username")).sendkey(Ankit);
				drive.findElement(By.name("password")).sendkey(Ankit@123);
				
			}
		 
	 }
	 @Then("^user enter the home page$")
	 public void user_enter_the_home_page () {
			String title = driver.getTitle();
			System.out.println("home page title :: +title");
			Assert.assertEquals("facebook",title);

	}

	 }