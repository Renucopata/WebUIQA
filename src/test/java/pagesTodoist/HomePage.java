package pagesTodoist;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class HomePage {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Label projectSection = new Label(By.xpath("//div[text()='Projects']"));
    public Button addProjectButton = new Button(By.xpath("//button[@aria-label='Add project']"));

    public Button more = new Button(By.xpath("//li[last()]//div//span[@data-project-actions='true']//button [@aria-label='More project actions']"));

    public Button editProject =  new Button(By.xpath("//div[text()='Edit project']"));


    public Label checkNewProject(String xpath){
        return new Label(By.xpath("//span[text()='" + xpath + "'][last()]"));
    }
//    public Label projectName = new Label(By.xpath("//span[text()='" + name + "'][last()]"));
}
