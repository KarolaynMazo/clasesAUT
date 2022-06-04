package co.com.test2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormToolsPage {

    public static final Target NAME = Target.the("Enter the name").
            located(By.id("firstName"));
}
