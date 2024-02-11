package WorkFlows;


import Extensions.UIActions;
import Utils.CommonOps;

import com.sun.tools.javac.comp.Todo;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WorkFlows
		extends CommonOps {

	public static void searchForItem(String item) {
		UIActions.click(mainPage.searchField);
		UIActions.enterText(mainPage.searchField, item);
		UIActions.click(mainPage.searchButton);
	}

	public static void getItemPrices() {
		List<WebElement> allItemsPrices = new ArrayList<>();
		allItemsPrices.addAll(mainPage.allItemsPrice);

		double maxPrice = 0;

		for (WebElement price : allItemsPrices) {
			String priceString = price.getText()
			                          .replace("ILS ", "")
			                          .replace(",", "");

			if (!priceString.contains("to") || priceString.isEmpty()) {
				try {
					Double priceToDouble = Double.parseDouble(priceString);
					System.out.println(priceToDouble);

					if (priceToDouble > maxPrice) {
						maxPrice = priceToDouble;
					}
				} catch (NumberFormatException e) {
					System.err.println("Error converting price to double for: " + priceString);
				}
			}
		}
		System.out.println("Most expensive watch price is " + maxPrice);
	}


	//TODO
         /*PSEUDOCODE


        - Insert all double prices into an Array (prices)

        - Find max value with:
        double max = 0;
        for (int i = 0; i < prices.length ; i++)
        {
            if (prices[i] > max){
                max = prices[i];
            }
        }
        System.out.println("Most expensive watch costs :" + max);

        - Find min value with:
        double min = 1000000000;
        for (int i = 0; i < prices.length ; i++)
        {
            if (prices[i] < min){
                min = prices[i];
            }
        }
        System.out.println("Cheapest watch costs :" + min);*/
}
