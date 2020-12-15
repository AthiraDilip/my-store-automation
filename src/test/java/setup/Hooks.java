package setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

import static utils.PropertyReader.loadProperties;

public class Hooks {
    public DriverSetup driverSetup = new DriverSetup();

    @Before
    public void testSetup() throws IOException {
        loadProperties();
        driverSetup.startDriver();
    }

    @After(order = 0)
    public void testTearDown() {
        driverSetup.quitDriver();
    }
}
