package PageObjects;

import Utils.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage extends Base {

	@FindBy(how = How.ID, using = "gh-ac")
	public WebElement searchField;

	@FindBy(how = How.ID, using = "gh-btn")
	public WebElement searchButton;

	@FindBy(how = How.CLASS_NAME, using = "s-item__price")
	public List<WebElement> allItemsPrice;


}
