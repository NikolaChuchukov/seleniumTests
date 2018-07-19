import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium {

@Test
    public void fantasy() {
        WebDriver driver = null;

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://fantasy.premierleague.com/");
        driver.close();

        System.out.println("Successfully opened fantasy football");
}

}
