package windowHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_window']")).click();
		WebElement findT = driver.findElement(By.xpath("//body[@class='main-body ui-input-filled']"));
		String text = findT.getText();
		//text.split= (/n);
		//System.out.println(text);
		WebElement findT1 = driver.findElement(By.xpath("(//div[@class='col-12 md:col-6']/div)[1]"));
		String text1 = findT1.getText();
		System.out.println(text1);
		
		
		

	}

}
