package tours;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		// TODO Auto-generated method stub
		
		
				System.setProperty("webdriver.gecko.driver","C:\\Users\\jpujala\\Downloads\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("identifierId")).sendKeys("jyothsnapujala");
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//span[text()='Next']")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("password")).sendKeys("thinkbig99");
				Thread.sleep(2000);
				driver.findElement(By.id("passwordNext")).click();
				
				driver.close();
				
				
			/*	
				/*driver.findElement(By.xpath(".//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(.//form[1]//textarea[1])[1]")).sendKeys("jyothsnapujala@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(.//form[1]//textarea[1])[1]")).sendKeys("  kvasudhaa7@gmail.com");
				driver.findElement(By.xpath(".//input[@name=\"subjectbox\"]")).sendKeys("important document");
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//div[@class=\"a1 aaA aMZ\"]")).click();
				Thread.sleep(1000);
				// Runtime.getRuntime().exec("C:\\Users\\jpujala\\Desktop\\123.exec");
				// Thread.sleep(1000);
				Robot robot=new Robot();
				StringSelection stringSelection=new StringSelection("C:\\Users\\jpujala\\Downloads\\gmail.txt");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				robot.setAutoDelay(1000);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.setAutoDelay(1000);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.setAutoDelay(1000);
				driver.findElement(By.xpath(".//div[@id=\":134\"]")).click();
				Thread.sleep(1000);
				*/
			/*	driver.findElement(By.xpath(".//*[text()='Inbox']")).click();
				Thread.sleep(3000);
//				driver.findElement(By.cssSelector(".UI table tbody tr:nth-child(1) td:nth-child(2)")).click();
				List<WebElement> mails = driver.findElements(By.xpath(".//div[@class='UI']//table/tbody/tr"));
				for(WebElement ele: mails) {
					String tdAttribute = ele.findElement(By.xpath("(.//td)[3]/span")).getAttribute("title");
					if(tdAttribute.equals("Starred")) {
						continue;
					}
					else {
						ele.findElement(By.xpath("(.//td)[2]")).click();
						break;
					}
				}
				Thread.sleep(4000);
				driver.findElement(By.xpath(".//div[@title='Delete']")).click();
		        Thread.sleep(2000);
				//driver.findElement(By.xpath(".//div[text()=\"Social\"]")).click();
				//Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@class=\"zA zE aqw\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector(".gb_Bf.gb_vf")).sendKeys("ppt");
				//driver.findElement(By.xpath("")
				//driver.quit();
			
*/
		
	}

	}

