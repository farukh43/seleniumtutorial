package class38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExetensionAtRunTime {

	public static void main(String[] args) {
		//Selector Hub
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Learnings\\SeleniumTutorials\\extensionscrx\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		options.addExtensions(file);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		// we cannot block the adds with the help of automation
		//but we can take help of add blockers we can block the the adds

}
}