package TestSuite;

import Utils.CommonOps;
import WorkFlows.WorkFlows;
import org.testng.annotations.Test;

public class eBayTests extends CommonOps
{
    @Test (description = "print lowest and highest item price")
    public void Test01()
    {
        WorkFlows.searchForItem("watch");
        WorkFlows.getItemPrices();
    }
}
