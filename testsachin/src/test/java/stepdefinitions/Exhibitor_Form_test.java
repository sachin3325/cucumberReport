package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Exhibitor_Form_test 
{
	public static WebDriver driver;
	
	@Given("when user clicks the for exhibitor link")
	public void when_user_clicks_the_for_exhibitor_link() throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tagexpo.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.linkText("For Exhibitors")).click();
        
        
        
		
	}
	
	@When("user sees the MSME claim popup and click the Exhibitor button")
	public void user_sees_the_msme_claim_popup_and_click_the_exhibitor_button() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[8]/button[1]")).click();
        Thread.sleep(3000);
		
	}
	
	@When("user enters the Company Name")
	public void user_enters_the_company_name() throws InterruptedException 
	{
		WebElement companyname = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/input[2]"));
        companyname.sendKeys("1clx");
        Thread.sleep(3000);
	}
	
	@When("user enters the Brand Name")
	public void user_enters_the_brand_name() throws InterruptedException 
	{
		    WebElement brandname = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/input[1]"));
	        brandname.sendKeys("Bata");
	        Thread.sleep(3000);
	}
	
	@When("user enters the Address")
	public void user_enters_the_address() throws InterruptedException 
	{
		   WebElement Address = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[3]/div[1]/input[1]"));
	        Address.sendKeys("Erode");
	        Thread.sleep(3000);
	}
	
	@When("user enters the Managing Director")
	public void user_enters_the_managing_director() throws InterruptedException 
	{
		   WebElement manag_Dir = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[4]/div[1]/input[1]"));
	        manag_Dir.sendKeys("Sachin");
	        Thread.sleep(3000);

	}
	
	@When("user enters the Mobile Number")
	public void user_enters_the_mobile_number() throws InterruptedException 
	{
		WebElement mobNum = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[5]/div[1]/input[1]"));
	    mobNum.sendKeys("8148862533");
        Thread.sleep(3000);
	}
	
	@When("user enters the Contact Person")
	public void user_enters_the_contact_person() throws InterruptedException 
	{
		 WebElement conPerson = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[6]/div[1]/input[1]"));
		    conPerson.sendKeys("Vasanth");
	        Thread.sleep(3000);

	}
	
	@When("user enters the Designation")
	public void user_enters_the_designation() throws InterruptedException 
	{
		WebElement designation = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[7]/div[1]/input[1]"));
	    designation.sendKeys("Testing");
        Thread.sleep(3000);
	}
	
	@When("user enters the Pan_Number")
	public void user_enters_the_pan_number() throws InterruptedException 
	{
		  WebElement panNum = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[8]/div[1]/input[1]"));
		    panNum.sendKeys("DAJPC4150P");
	        Thread.sleep(3000);
	}
	
	@When("user enters the GST_Number")
	public void user_enters_the_gst_number() throws InterruptedException 
	{
		 WebElement gstNum = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[9]/div[1]/input[1]"));
		    gstNum.sendKeys("18AABCU9603R1ZM");
	        Thread.sleep(3000);

	}
	
	@When("user enters the Phone_Number")
	public void user_enters_the_phone_number() throws InterruptedException 
	{
		 WebElement phNum = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[10]/div[1]/input[1]"));
		    phNum.sendKeys("8220575172");
	        Thread.sleep(3000);

	}
	
	@When("user enters the E-Mail")
	public void user_enters_the_e_mail() throws InterruptedException 
	{
		 WebElement email = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[11]/div[1]/input[1]"));
		    email.sendKeys("sachinanand584@gmail.com");
	        Thread.sleep(3000); 
	}
	
	@When("user enters the Website")
	public void user_enters_the_website() throws InterruptedException 
	{
		WebElement website = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[12]/div[1]/input[1]"));
	    website.sendKeys("https://www.1clxlite.com");
        Thread.sleep(3000);
        
	}
	
	@When("user enters the Password")
	public void user_enters_the_password() throws InterruptedException 
	{
		WebElement password = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[1]/div[13]/div[1]/input[1]"));
        password.sendKeys("Sachin@001");
        Thread.sleep(3000);

	}
	
	@When("User enters the companylogo")
	public void user_enters_the_companylogo() throws InterruptedException 
	{
		WebElement companyLogo = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[2]/div[1]/input[1]"));
	    companyLogo.sendKeys("C:\\Users\\Sachithanandhan.S\\Downloads\\CLX-White.png");
        Thread.sleep(3000);
	}
	
	@When("User enters the profileimage")
	public void user_enters_the_profileimage() throws InterruptedException 
	{
		WebElement profileimg = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[4]/div[1]/input[1]"));
	    profileimg.sendKeys("C:\\Users\\Sachithanandhan.S\\Downloads\\logo.png");
        Thread.sleep(3000); 
	}
	
	@When("user choose their CATEGORIES")
	public void user_choose_their_categories() throws InterruptedException 
	{
		WebElement categories1 = driver.findElement(By.xpath("(//input[@name='category[]'])[1]"));
	    categories1.click();
       
        
        WebElement categories2 = driver.findElement(By.xpath("(//input[@name='category[]'])[2]"));
	    categories2.click();
        Thread.sleep(3000);
	}
	
	@When("user choose their Products")
	public void user_choose_their_products() throws InterruptedException 
	{
		    WebElement product1 = driver.findElement(By.xpath("(//input[@name='products_on_display[]'])[1]"));
		    product1.click();
		    
		    WebElement product2 = driver.findElement(By.xpath("(//input[@name='products_on_display[]'])[2]"));
		    product2.click();
		    
		    WebElement products3 = driver.findElement(By.xpath("(//input[@name='products_on_display[]'])[3]"));
		    products3.click();
	        Thread.sleep(3000);
	        
	}
	@When("User choose the Book stall")
	public void user_choose_the_book_stall() throws InterruptedException 
	{
		WebElement bookbtn = driver.findElement(By.xpath("//body[1]/main[1]/article[1]/section[1]/form[1]/fieldset[1]/div[8]/div[1]/div[1]/button[1]"));
	    bookbtn.click();
	    Thread.sleep(3000);
	    
	    WebElement stallno = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[24]"));
	    stallno.click();
	    
	    WebElement confirmstall = driver.findElement(By.xpath("//button[@id='confirmstall']"));
	    confirmstall.click();
	    
	    Thread.sleep(3000);
	    
	    
	}
	
	@When("user clicks the acknowledge checkbox")
	public void user_clicks_the_acknowledge_checkbox() throws InterruptedException 
	{
		WebElement acknowledge = driver.findElement(By.xpath("//input[@id='acknowledge_check']"));
	    acknowledge.click();
	    Thread.sleep(3000);
	}
	
	@Then("user clicks submit button")
	public void user_clicks_submit_button() 
	{
		  
		   WebElement confirmspace = driver.findElement(By.xpath("//button[@type='submit']"));
		   confirmspace.click();

	}

	
	

}
