package WorkFlows;


import Extensions.UIActions;
import Utils.CommonOps;
import com.sun.tools.javac.comp.Todo;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class WorkFlows extends CommonOps
{
    public static void searchForItem (String item)
    {
        UIActions.click(mainPage.searchField);
        UIActions.enterText(mainPage.searchField , item);
        UIActions.click(mainPage.searchButton);
    }

    public static void getItemPrices ()
    {
        /*ArrayList allItemsPrices = new ArrayList();
        allItemsPrices.addAll(mainPage.allItemsPrice);
        System.out.println(allItemsPrices);*/

        for (WebElement price : mainPage.allItemsPrice)
        {
            String priceString = price.getText();
            System.out.println(priceString);
        }
        //TODO
         /*PSEUDOCODE

        - Trim "ILS " from all prices string
        - Parse all strings to double
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
}
