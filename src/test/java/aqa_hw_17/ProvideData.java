package aqa_hw_17;

import org.testng.annotations.DataProvider;

public class ProvideData {

    @DataProvider

    public Object[][] getPrimeSubscriptionData() {
        return new Object[][]{
                {"Prime Monthly"},
                {"Prime Annual"}
        };
    }
}

