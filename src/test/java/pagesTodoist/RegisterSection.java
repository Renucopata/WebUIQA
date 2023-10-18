package pagesTodoist;
import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {



    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));

    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[@id='element-3']"));

    public TextBox nameTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));

    public Button skip = new Button(By.xpath("(//button[@type='button'])[1]"));

    public Button continueButton = new Button(By.xpath("//button[@type='submit']"));

    public Button signUpButton = new Button(By.xpath("//button[@data-gtm-id='start-email-signup']"));

    //public TextBox emailTextBox = new TextBox(By.xpath("//input[@type='email']"));
    //public TextBox passwordTextBox = new TextBox(By.xpath("//input[@type='password']"));
    //public Button signUpButton = new Button(By.xpath("//span[text()='Sign up with Email']/parent::button"));
}
