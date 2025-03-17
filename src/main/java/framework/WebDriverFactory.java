package framework;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class WebDriverFactory {
    private static WebDriver driver = null;

    public static void createWebDriverObject(String browserName){
        Duration duration = Duration.of(Config.waitTimeInSeconds, ChronoUnit.SECONDS);

        if(browserName.equalsIgnoreCase("chrome")){
            ChromeDriverService chromeDriverService = new ChromeDriverService.Builder().build();
            ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.addArguments("--no-sandbox", "--disable-extensions");
            chromeOptions.setImplicitWaitTimeout(duration);
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

            driver = new ChromeDriver(chromeDriverService, chromeOptions);

        } else if(browserName.equalsIgnoreCase("edge")){
            EdgeDriverService edgeDriverService = new EdgeDriverService.Builder().build();
            EdgeOptions edgeOptions = new EdgeOptions();

            edgeOptions.addArguments("--no-sandbox", "--disable-extensions");
            edgeOptions.setImplicitWaitTimeout(duration);
            edgeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

            driver = new EdgeDriver(edgeDriverService, edgeOptions);
        }

        driver.manage().window().maximize();
    }

    public static WebDriver getWebDriverObject(){
        return driver;
    }

    public static void destroyWebDriverObject(){
        if(Config.closeBrowserAfterExecution.equalsIgnoreCase("Yes")){
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}
