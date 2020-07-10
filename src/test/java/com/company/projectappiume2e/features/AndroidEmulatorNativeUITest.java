package com.company.projectappiume2e.features;

import com.company.projectappiume2e.base.BaseTest;
import com.company.projectappiume2e.pages.AndroidCalculatorPage;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidEmulatorNativeUITest extends BaseTest {
    private AndroidCalculatorPage androidCalculatorPage;

    @Test
    public void testCalculatorPlusTwoNumbersNexus6API30(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10.0");
        cap.setCapability("deviceName", "Nexus6API30");
        cap.setCapability("newCommandTimeout",180);
        cap.setCapability("appWaitDuration",30000);
        cap.setCapability("avd", "Nexus6API30");
        cap.setCapability("avdArgs", "-port 5557");

        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("appWaitActivity", "com.android.calculator2.Calculator");

        configAppiumDriver(cap);

        androidCalculatorPage= new AndroidCalculatorPage(driver);
    }
}
