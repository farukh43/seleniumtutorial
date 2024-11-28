package class41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	
		String filePath =System.getProperty("user.dir")+"\\testdata\\DataDrivenTesting.xlsx";
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for (int r=1;r<=rows;r++)
		{
			//read data from excel
			String price=ExcelUtils.getCellData(filePath, "Sheet1", r, 0);
			String rateOfIntrested=ExcelUtils.getCellData(filePath, "Sheet1", r, 1);
			String per1=ExcelUtils.getCellData(filePath, "Sheet1", r, 2);
			String per2=ExcelUtils.getCellData(filePath, "Sheet1", r, 3);
			String freq=ExcelUtils.getCellData(filePath, "Sheet1", r, 4);
			String exp_mvalue=ExcelUtils.getCellData(filePath, "Sheet1", r, 5);
			
			//Pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfIntrested);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select freqdrp=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrp.selectByVisibleText(freq);
			
			//clicng on calculated
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
			
			String actualmaturityValue = driver.findElement(By.xpath("//span[@name='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(actualmaturityValue))
			{
			System.out.println("Test Passed");
			ExcelUtils.setCellData(filePath, "Sheet1", r, 7,"Passed");
			ExcelUtils.fillGreenColor(filePath, "Sheet1", r, 7);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", r, 7,"Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", r, 7);
			}
			//clciking on clear button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}// ending of for loop
		driver.quit();		
	}

}
