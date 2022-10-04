package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoUploadFileSikuli {
	
	@Test(enabled = true, description = "upload test file by using sikuli")
	public void fileUpload() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='imagesrc']/..")).click();
		Thread.sleep(5000);
		//take screenshtos for open button and input box from windows popup by using snipping tool and save
		Screen sc = new Screen();
		//input box to type text for file path
		Pattern p1 = new Pattern("E:\\bird2\\inputF1.png");
		//open button 
		Pattern p2 = new Pattern("E:\\bird2\\openBtn.png");
		sc.type(p1, "E:\\Resumes_classes\\sudhir_KV2.doc");
		sc.click(p2);
		
		
		
	}

}
