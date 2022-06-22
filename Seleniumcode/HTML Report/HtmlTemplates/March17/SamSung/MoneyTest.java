package SamSung;

import junitparams.JUnitParamsRunner;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

//import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    public  int VALID_AMOUNT = 5;
    public   String VALID_CURRENCY = "USD";

    public  Object[] getMoney() {
        return new Object[] {
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"}
        };
    }
    
    public  String BrowserType() {
        return "Chrome";
    }
    
    
    
    @Test
    @Parameters(method = "BrowserType")
    public void constructorShouldSetAmountAndCurrency(
            int amount, String currency) {
    	
    	MoneyTest money = new MoneyTest();
        System.out.println("BrowserType is "+money.BrowserType());
    
    }
}