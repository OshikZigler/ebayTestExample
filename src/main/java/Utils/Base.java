package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base
{
    //initializing drivers
    public static WebDriver driver;
    public static WebDriverWait explicitWait;

    //defining page objects
    public static PageObjects.MainPage mainPage;
}
