import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "hplogo")
    WebElement logo;

    @FindBy(name ="q")
    WebElement barreRecherche;

    @FindBy (css =".lsb")
    WebElement buttonRecherche;

    public HomePage(WebDriver driver)
    {

       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public ResultsPage rechercheAvecEntree(String text)
    {
        barreRecherche.sendKeys(text);
        barreRecherche.sendKeys(Keys.ENTER);
        return new ResultsPage(driver);
    }
    public ResultsPage rechercheAvecClick(String text)
    {
        barreRecherche.sendKeys(text);
        buttonRecherche.click();
        return new ResultsPage(driver);
    }
}
