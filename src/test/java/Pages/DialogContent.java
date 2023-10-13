package Pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() { PageFactory.initElements(Driver.getDriver(), this); }
}
