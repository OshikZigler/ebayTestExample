package Utils;

import org.openqa.selenium.support.PageFactory;

public class PageManager extends Base {

	public static void initPages() { //Initiating page objects

		mainPage = PageFactory.initElements(driver, PageObjects.MainPage.class);
	}
}
