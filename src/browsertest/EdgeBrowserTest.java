package browsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * 1. Set up EdgeBrowser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Sign In’ link
 * 7. Print the current URL
 * 8. Enter the email in the email field.
 * 9. Enter the password in the password field.
 * 10. Click on the Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to the Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

public class EdgeBrowserTest {

    public static void main(String[] args) {

        //baseUrl
        String baseUrl = "https://courses.ultimateqa.com/";

        //1. Set up Chrome browser.
        WebDriver driver = new EdgeDriver();

        //2. Open URL.
        driver.get(baseUrl);

        //3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //4. Print the current URL.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The Current URL : " + currentUrl);

        //5. Print the page source.
        System.out.println("The Page Source :" + driver.getPageSource());

        //6.Click on the ‘Sign In’ link
        WebElement signIn=  driver.findElement(By.className("header__nav-sign-in"));
        signIn.click();


        //7. Print the current URL
        System.out.println("Get Current URL :" + driver.getCurrentUrl());

        //8. Enter the email in the email field
        WebElement emailId = driver.findElement(By.id("user[email]"));
        emailId.sendKeys("jalpa123@gmail.com");

        //9. Enter the password in the password field.
        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("jalpa123");

        //10. Click on the Login Button
        WebElement login = driver.findElement(By.className("form__button-group"));
        login.click();

        //11.  Navigate to baseUrl
        driver.get(baseUrl);

        //12. Navigate forward to the Homepage.
        driver.navigate().forward();
        System.out.println("Get current URL :"  + driver.getCurrentUrl());

        //13. Navigate back to baseUrl.
        driver.navigate().back();

        //14./refresh the page
        driver.navigate().refresh();

        //15.Close the browser.
        driver.quit();


    }

}
