package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {

    protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("/Users/Andrejs K/IdeaProjects/myAppiumProject/apps");
        File app = new File(appDir, "flipkart.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Motorola");
        capabilities.setCapability("platformName","Android");

        //run via USB
        capabilities.setCapability("deviceId","ZY223QBFGB");
        capabilities.setCapability("autoGrantPermissions","true");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

}
