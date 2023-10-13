package Pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() { PageFactory.initElements(Driver.getDriver(), this);}
}
