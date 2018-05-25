
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchCheese2 {
    
    public static void main(String[] args) {
        searchGoogle();
    }
    
    public static void initializeDriver() {
        //Ths computer runs on GoogleChrome
        // Invoke a .exe file first
        System.setProperty("webdriver.chrome.driver", 
            "/Users/tangher/Desktop/Selenium/chromedriver");
    }
    
    public static void searchGoogle() {
        initializeDriver();
        
        // Create Driver Object (Chrome Browser)
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        
        WebElement searchElement;
        
        searchElement = driver.findElement(By.name("q"));
        searchElement.sendKeys("Cheese");
        searchElement.submit();
        
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[2]/div/div/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[4]/div[2]/h3/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search-church\"]")).sendKeys("Mozzarella");
        driver.findElement(By.xpath("//*[@id=\"top-search\"]/form/div/span/button/i")).click();
        driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[1]/div[2]/div[1]/div[1]/h3/a")).click();
        
        System.out.println("PAGES YOU'VE VISITED: \n");
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl() + "\n");
        
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl() + "\n");
        
        driver.navigate().back();
        
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/h2")).getText() + "\n");
        
        driver.close();
    }
}
