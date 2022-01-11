package Extensions;

import Utils.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UIActions extends CommonOps
{
    public static void click (WebElement element)
    {  //Waiting up to 15 seconds for every element until it's clickable before trying to click
       explicitWait.until(ExpectedConditions.elementToBeClickable(element));
       element.click();
    }

    public static void enterText(WebElement element , String value)
    {   //Waiting up to 15 seconds for every element until it's visible before trying to send keys
        explicitWait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);

    }

}
