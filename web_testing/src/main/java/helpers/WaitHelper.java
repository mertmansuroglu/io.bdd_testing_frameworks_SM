package helpers;

import driver.DriverManager;
import elements.GetBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper extends GetBy {

    private long DEFAULT_WAIT = 15;
    private long DEFAULT_SLEEP_IN_MILLIS = 500;
    private WebDriver driver;

    protected WaitHelper() {
        this.driver = DriverManager.getInstances().getDriver();
    }

    protected WebDriverWait getWait(long timeout, long sleepInMillis) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(sleepInMillis));
    }

    protected WebDriverWait getWait(long timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(DEFAULT_SLEEP_IN_MILLIS));
    }

    protected WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT), Duration.ofMillis(DEFAULT_SLEEP_IN_MILLIS));
    }
}
