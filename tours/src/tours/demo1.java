package tours;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class demo1 {

	public static void main(String[] args) throws InterruptedException
	{
	// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\jpujala\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
	// For Registration  form
		driver.findElement(By.xpath(".//*[text()='REGISTER']")).click();
		driver.findElement(By.id("email")).sendKeys("jyothsnap");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("pujala1796");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("pujala1796");
		Thread.sleep(1000);
		//driver.findElement(By.xpath(".//*[text()='register']")).click();
		driver.findElement(By.name("register")).click();
		Thread.sleep(2000);
	// For login form
		driver.findElement(By.xpath(".//*[text()=' sign-in ']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("sign-in")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("jyothsnap");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("pujala1796");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[text()='login']")).click();
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	// For flight Details 
		driver.findElement(By.xpath(".//*[@name='tripType'][2]")).click();
		Select s=new Select(driver.findElement(By.xpath(".//*[@name='passCount']")));
		s.selectByVisibleText("1");
		Select s1=new Select(driver.findElement(By.xpath(".//*[@name='fromPort']")));
		s1.selectByVisibleText("Paris");
		Select s2=new Select(driver.findElement(By.xpath(".//*[@name='fromMonth']")));
		s2.selectByVisibleText("July");
		Select s3=new Select(driver.findElement(By.xpath(".//*[@name='fromDay']")));
		s3.selectByVisibleText("17");
		Select s4=new Select(driver.findElement(By.xpath(".//*[@name='toPort']")));
		s4.selectByVisibleText("Sydney");
		Select s5=new Select(driver.findElement(By.xpath(".//*[@name='toMonth']")));
		s5.selectByVisibleText("December");
		Select s6=new Select(driver.findElement(By.xpath(".//*[@name='toDay']")));
		s6.selectByVisibleText("30");
	// Preferences
		driver.findElement(By.xpath(".//*[@name='servClass']//following::input[1]")).click();
		Thread.sleep(1000);
		Select s7=new Select(driver.findElement(By.xpath(".//*[@name='airline']")));
		s7.selectByVisibleText("Unified Airlines");
		driver.findElement(By.xpath(".//*[@name='findFlights']")).click();
		Thread.sleep(1000);
	// Select fight	
		driver.findElement(By.xpath(".//*[@name='outFlight']//following::input[1]")).click();
		driver.findElement(By.xpath(".//*[@name='outFlight']//following::input[2]")).click();
		driver.findElement(By.xpath(".//*[@name='inFlight']//following::input[1]")).click();
		driver.findElement(By.xpath(".//*[@name='inFlight']//following::input[2]")).click();
		driver.findElement(By.xpath(".//*[@name='reserveFlights']")).click();
	// Passenger credit card details
		Select s8=new Select(driver.findElement(By.xpath(".//*[@name='creditCard']")));
		Thread.sleep(2000);
		s8.selectByVisibleText("MasterCard");
		driver.findElement(By.xpath(".//*[@name='creditnumber']")).sendKeys("5789362541");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='passFirst0']")).sendKeys("jyothsna");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='passLast0']")).sendKeys("pujala");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@name='buyFlights']")).click();
		driver.quit();
		
	}

}
