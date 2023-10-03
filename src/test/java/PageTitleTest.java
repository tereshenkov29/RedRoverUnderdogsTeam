import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PageTitleTest {
    @Test
    public void pageTitleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.99-bottles-of-beer.net/");
        String title = driver.getTitle();
        assertEquals("99 Bottles of Beer | Start", title);
        driver.quit();
    }
}