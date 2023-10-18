package pagesTodoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginSection {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@placeholder='Enter your email...']"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[@placeholder='Enter your password...']"));
    public Button loginButton = new Button(By.xpath("//button[@type='submit']"));
}
