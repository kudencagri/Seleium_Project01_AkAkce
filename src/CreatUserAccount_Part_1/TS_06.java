package CreatUserAccount_Part_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TS_06 extends BaseDriver {
    @Test
    public void DeleteAccount(){
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
        MyFunc.wait(4);

        WebElement nick=driver.findElement(By.xpath("//*[text()='Çağrı Canras']"));
        nick.click();
        MyFunc.wait(2);

        WebElement delete=driver.findElement(By.xpath("//*[text()='Hesabımı Sil']"));
        delete.click();

        WebElement sifre=driver.findElement(By.id("p"));
        sifre.sendKeys("21Tekno43.");
        MyFunc.wait(2);

        WebElement butt=driver.findElement(By.id("u"));
        butt.click();

        BekleveKapat();

    }
}
