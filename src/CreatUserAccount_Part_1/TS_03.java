package CreatUserAccount_Part_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TS_03 extends BaseDriver {

    @Test
    public void logout(){
        driver.get("https://www.akakce.com/");
        WebElement Sing_in=driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        Sing_in.click();
        MyFunc.wait(2);

        WebElement E_mail=driver.findElement(By.id("life"));
        E_mail.sendKeys("cagricanraskuden@gmail.com");
        MyFunc.wait(1);

        WebElement Password=driver.findElement(By.id("lifp"));
        Password.sendKeys("21Tekno43.");
        MyFunc.wait(1);

        WebElement button=driver.findElement(By.id("lfb"));
        button.click();
        MyFunc.wait(5);


        WebElement Account=driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        Actions actions=new Actions(driver);
        MyFunc.wait(5);
        Action action=actions.moveToElement(Account).build();
        MyFunc.wait(5);
        action.perform();

        MyFunc.wait(5);
        WebElement Cik=driver.findElement(By.xpath("//*[text()='Çık']"));
        Action action1=actions.moveToElement(Cik).click().build();
        MyFunc.wait(5);
        action1.perform();




        BekleveKapat();
    }
}//a[@id='H_a_v8']
