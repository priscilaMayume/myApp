package appium.page;

import appium.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static appium.core.DriverFactory.getDriver;

public class SplashPage extends BasePage  {

    public boolean isTelaSplashVisivel() {
        return existeElementoPorTexto("Splash!");
    }

    public void aguadarSplashSumir() {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));


    }
}
