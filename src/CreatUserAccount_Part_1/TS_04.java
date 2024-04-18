package CreatUserAccount_Part_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TS_04 extends BaseDriver {
    @Test
    public void OrderListControl(){
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


        WebElement Account=driver.findElement(By.xpath("//*[text()='Çağrı Canras']"));
        Account.click();
        MyFunc.wait(3);

        WebElement MyOrder=driver.findElement(By.xpath("//*[text()='Siparişlerim']"));
        MyOrder.click();
        
        WebElement text=driver.findElement(By.xpath("//div[@class='no-record']"));
        System.out.println("text.getText().contains(Kayıtlı siparişiniz bulunmuyor.) = " + text.getText().contains("Kayıtlı siparişiniz bulunmuyor."));


        BekleveKapat();

    }
}
