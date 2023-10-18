package pagesTodoist;


import org.openqa.selenium.By;
import controls.Button;
import controls.Control;

public class ProjectField {
    public Control getProjectByName(String name) {
        return new Control(By.xpath("//a//span[text()='" + name + "']"));
    }

    public Button getOptionButtonByName(String name) {
        return new Button(By.xpath("//span[text()='" + name + "']//parent::a//parent::div//button[@aria-label='More project actions']"));
    }

    public Button editProjectButton = new Button(By.xpath("//div[text()='Edit project']/parent::div/parent::li"));

    public Button deleteProjectButton = new Button(By.xpath("//div[text()='Delete project']/parent::div/parent::li"));
}
