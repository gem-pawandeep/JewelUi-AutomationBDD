package StepDefination;

import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.Before;

public class Jewel {
    @Before
    public void start() {
        DriverManager.setUpBrowser();
    }
}
