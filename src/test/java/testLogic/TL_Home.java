package testLogic;

import framework.Config;
import framework.DataBook;
import framework.Report;
import framework.WebPage;
import uiMap.Home;

public class TL_Home extends WebPage {
    public TL_Home(){
        super();
    }

    public void openApp(){
        String URL = Config.URL;

        driver.get(URL);
        waitForPageToLoad();

        if(isDisplayed(Home.txtGoogleSearch))
            Report.updateReport("User is navigated to Google home page", "Pass");
        else
            Report.updateReport("User is NOT navigated to Google home page", "Fail");



    }//EOM

    public static void enterSearchTerm(){
        String searchTerm = DataBook.getData(Config.testData_DefaultSheetName, "FirstName");
        typeIn(Home.txtGoogleSearch, searchTerm);

        Report.updateReport("Search term is entered", "Pass");
    }
}
