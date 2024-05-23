package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashBoardPage {

 public DashBoardPage (){

     PageFactory.initElements(Driver.getDriver(), this);

 }


}
