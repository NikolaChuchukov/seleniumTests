import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium {


    public static void main(String[] args) {
        WebDriver driver = null;

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://fantasy.premierleague.com/");
        driver.close();
}

}
