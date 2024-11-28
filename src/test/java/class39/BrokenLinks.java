package class39;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Link --> href="https://xyz.com"
2) https://xyz.com--->server---> status code
3) status code >= 400 ---> broken link
   status code < 400 ---> not a broken link
*/
public class BrokenLinks {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : " + links.size());

        int noOfBrokenLinks = 0;
        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");
            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("href attribute is null or empty. So not possible to check");
                continue;
            }

            try {
                // Hit URLs to the server
                URL linkURL = new URI(hrefValue).toURL(); // Use URI to URL conversion
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // Use HttpURLConnection for both HTTP and HTTPS
                conn.connect(); // Connect to the server and send request to the server

                if (conn.getResponseCode() >= 400) {
                    System.out.println("Broken Link ===> " + hrefValue);
                    noOfBrokenLinks++;
                } else {
                    System.out.println("Not a Broken Link ===> " + hrefValue);
                }

            } catch (Exception e) {
                e.printStackTrace(); // Log the exception
            }
        }

        System.out.println("No of Broken Links : " + noOfBrokenLinks); //42
        driver.quit(); // Close the browser
    }
}
