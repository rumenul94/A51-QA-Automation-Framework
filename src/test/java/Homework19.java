import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework19 extends BaseTest{

    @Parameters({"baseUrl"})
    @Test
    public void deletePlaylist(String baseUrl) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(baseUrl);
        provideEmail("rumenul.rimon@testpro.io");
        providePassword("27041575");
        clickSubmit();
        deletePlaylist();
    }
}
