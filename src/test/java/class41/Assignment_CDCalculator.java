package class41;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_CDCalculator {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open the specified URL
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String filePath =System.getProperty("user.dir")+"\\testdata\\CDCalculator_Assignment.xlsx";
		int rows=ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for (int r=1;r<=rows;r++)
		{
			//read data from excel
			String IntialDepositAmt=ExcelUtils.getCellData(filePath, "Sheet1", r, 0);
			String lenghtMonths=ExcelUtils.getCellData(filePath, "Sheet1", r, 1);
			String instateRate=ExcelUtils.getCellData(filePath, "Sheet1", r, 2);
			String compunding=ExcelUtils.getCellData(filePath, "Sheet1", r, 3);
			String total=ExcelUtils.getCellData(filePath, "Sheet1", r, 4);
			//String exp_value=ExcelUtils.getCellData(filePath, "Sheet1", r, 5);
			
			//Pass above data into application
			WebElement intialdemositAmt=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			intialdemositAmt.clear();
			intialdemositAmt.sendKeys(IntialDepositAmt);
			
			WebElement lenghtMonths_loc=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			lenghtMonths_loc.clear();
			lenghtMonths_loc.sendKeys(lenghtMonths);
			
			
			WebElement instateRate_loc=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			instateRate_loc.clear();
			instateRate_loc.sendKeys(instateRate);
			
			WebElement compoundinfg_loc=driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c109-4']"));
			compoundinfg_loc.click();
			
			List <WebElement> compoundingLoc_text=	driver.findElements(By.xpath("//*[contains(@class, 'mat-option')]//span[@class='mat-option-text']"));
			for (WebElement ele : compoundingLoc_text) {			
				String option = ele.getText();
				if (option.equals(compunding)) 
				{
					ele.click();
				}

			}
			
			//clicking on  Let's run the numbers button
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			String actualValue = driver.findElement(By.xpath("//*[@id='displayTotalValue']")).getText();
			
			if(total.equals(actualValue))
			{
			System.out.println("Test Passed");
			ExcelUtils.setCellData(filePath, "Sheet1", r, 6,"Passed");
			ExcelUtils.fillGreenColor(filePath, "Sheet1", r, 6);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", r, 6,"Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1", r, 6);
			}
			//clciking on clear button
			Thread.sleep(2000);
		}// ending of for loop
		driver.quit();	
		

	}

}
