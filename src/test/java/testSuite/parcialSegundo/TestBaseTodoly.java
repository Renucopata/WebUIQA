package testSuite.parcialSegundo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import session.Session;

public class TestBaseTodoly {

    protected LoginSection loginSection = new LoginSection();
    protected MainPage mainPage = new MainPage();
    protected MenuSection menuSection = new MenuSection();
    protected SettingsPage settingsPage = new SettingsPage();
    protected pages.signupPopup signupPopup = new signupPopup();

    @BeforeEach
    public void openBroswer() {
        Session.getInstance();
    }

    @AfterEach
    public void closeBroswer() {

        Session.getInstance().closeSession();

    }
}
